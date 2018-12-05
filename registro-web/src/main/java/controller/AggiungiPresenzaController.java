package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.PresenzaManager;
import business.RegistroManager;
import business.StudenteManager;
import modello.Presenza;
import modello.Registro;
import modello.Studente;

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
					sdf.parse(request.getParameter("dataOraUscita")), 
					request.getParameter("registro"),
					request.getParameter("note"));
		} catch (NumberFormatException | ParseException e) {
			e.printStackTrace();
		}
		
		List<Presenza> presenze = PresenzaManager.elencoPresenze();
		List<Studente> studenti = StudenteManager.elencoStudenti();
		List<Registro> registri = RegistroManager.elencoRegistri();
		
		request.setAttribute("elencoPresenze", presenze);
		request.setAttribute("elencoStudenti", studenti);
		request.setAttribute("elencoRegistri", registri);
		request.setAttribute("oggi", new Date());
		request.getRequestDispatcher("/elencoPresenze.jsp").forward(request, response);
	}

}
