package servlet;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;
/**
 * Servlet implementation class creerClient
 */
@WebServlet("/creerClient")
public class creeClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public creeClient() {
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
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		if(nom.isBlank() || prenom.isBlank() || telephone.isBlank() || email.isBlank()){
		    request.setAttribute("error", "Ooops, erreur !!! Vous devez remplir tous les champs");
		    RequestDispatcher rd = request.getRequestDispatcher("inscription.jsp");
		    rd.forward(request, response);
		    return;
		}
		
		Client c = new Client(nom,prenom,telephone,email);
		request.setAttribute("client", c);
		request.setAttribute("success", "Client ajouté avec succès");
        RequestDispatcher requ = request.getRequestDispatcher("WEB-INF/infoClient.jsp");
        requ.forward(request, response);
	}
 
}
