package servlet;

import DAO.UserDAO;
import model.User;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registerHandler
 */
@WebServlet("/registerHandler")
public class registerHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
      UserDAO d;
    /**
     * @see HttpServlet#HttpServlet()
     */
      @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	d = new UserDAO();
    }
    public registerHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		if(login.isEmpty() || password.isEmpty()) {
			request.setAttribute("error", "tous les champs doivent etre remplis");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		}
		if(!d.register(new User(login,password))) {
			request.setAttribute("error", "user already exists");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
			return;
		}else {
			request.getSession().setAttribute("success", "user registered succefully");
			response.sendRedirect(request.getContextPath() +"/login.jsp");
		}
		
		
	}

}
