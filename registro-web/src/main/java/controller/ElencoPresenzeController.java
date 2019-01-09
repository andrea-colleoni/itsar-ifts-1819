package controller;

import java.io.IOException;
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
 * Servlet implementation class ElencoPresenzeController
 */
@WebServlet("/elencoPresenze_old")
public class ElencoPresenzeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ElencoPresenzeController() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
