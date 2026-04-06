package servlet;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Reservation;
import model.Client;
/**
 * Servlet implementation class creeReservation
 */
@WebServlet("/creeReservation")
public class creeReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public creeReservation() {
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
		String type = request.getParameter("type");
		String prix = request.getParameter("prix");
		String vue = request.getParameter("vue");
		if(nom.isBlank() || prenom.isBlank() || telephone.isBlank() || email.isBlank() || type.isBlank() || prix.isBlank()){
			request.setAttribute("errorrr", "Ooops, erreur !!! Vous devez remplir tous les champs");
			RequestDispatcher requ = request.getRequestDispatcher("Reservation.jsp");
			requ.forward(request, response);
			return;
		}
		Client c = new Client(nom,prenom,telephone,email);
		Reservation r = new Reservation(c,type,prix,vue);
		request.setAttribute("success", "reservation ajoutee avec success!");
		request.setAttribute("reservation", r);
		request.setAttribute("client", c);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/infoReservation.jsp");
		rd.forward(request, response);
		
	}

}
