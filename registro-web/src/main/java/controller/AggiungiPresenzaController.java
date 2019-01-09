package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.PresenzaManager;

/**
 * Servlet implementation class AggiungiPresenzaController
 */
@WebServlet("/aggiungiPresenza")
public class AggiungiPresenzaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AggiungiPresenzaController() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		try {
			PresenzaManager.aggiungiPresenza(
					Integer.valueOf(request.getParameter("studente")), 
					sdf.parse(request.getParameter("dataOraEntrata")), 
					(!"".equals(request.getParameter("dataOraUscita")) ? sdf.parse(request.getParameter("dataOraUscita")) : null), 
					request.getParameter("registro"),
					request.getParameter("note"));
		} catch (NumberFormatException | ParseException e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("elencoPresenze");
	}

}
