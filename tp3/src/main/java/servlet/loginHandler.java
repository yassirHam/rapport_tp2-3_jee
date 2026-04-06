package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.UserDAO;
import model.User;
/**
 * Servlet implementation class loginHandler
 */
@WebServlet("/loginHandler")
public class loginHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	UserDAO dao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    @Override
    public void init() throws ServletException {
    	dao = new UserDAO();
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
		String password = request.getParameter("mdp");
		if (login.isEmpty() || password.isEmpty()) {
		   request.setAttribute("error","remplis tous les champs");
		   request.getRequestDispatcher("login.jsp").forward(request, response);
		   return;
		}
		User u = dao.validate(login, password);
		if (u != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user",u);
			response.sendRedirect(request.getContextPath() +"/home.jsp");
			return;   
		}
		else {
			request.setAttribute("error","login or mdp invalid");
		    request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
	}

}
