package business;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import modello.Presenza;
import modello.Registro;
import modello.Studente;
import utility.JPAUtility;

public class PresenzaManager {
private static Logger log = Logger.getLogger("registro-business");
	
	public static void aggiungiPresenza(Presenza p) {
		EntityManager em = JPAUtility.getEm();
		
		Presenza pDb = em.find(Presenza.class, p.getCodicePresenza());
		if (pDb != null) {
			em.getTransaction().begin();
			em.persist(p); 
			em.getTransaction().commit();
			log.log(Level.INFO, "aggiunta presenza");
		} else {
			log.log(Level.WARNING, "presenza esiste già");
		}
	}
	
	public static void aggiungiPresenza(Integer matricola, Date entrata, String codiceCorso) {
		EntityManager em = JPAUtility.getEm();
		Registro r = em.find(Registro.class, codiceCorso);
		Studente s = em.find(Studente.class, matricola);
		if (r != null && s != null) {
			Presenza p  = new Presenza();
			p.setStudente(s);
			p.setRegistro(r);
			p.setDataOraEntrata(entrata);
			aggiungiPresenza(p);
		} else {
			log.log(Level.WARNING, "studente o registro inesistenti");
		}
	}
	
	public static List<Presenza> elencoPresenze() {
		EntityManager em = JPAUtility.getEm();
		return em.createQuery("select p from Presenza p", Presenza.class).getResultList();
	}
	
	public static List<Presenza> elencoPresenze(String codiceCorso) {
		EntityManager em = JPAUtility.getEm();
		return em.createQuery(
				"select p from Presenza p where p.registro.codiceCorso=:codiceCorso", Presenza.class)
				.setParameter("codiceCorso", codiceCorso)
				.getResultList();
	}
	
	public static List<Presenza> elencoPresenze(Integer matricola) {
		EntityManager em = JPAUtility.getEm();
		return em.createQuery(
				"select p from Presenza p where p.studente.matricola=:matricola", Presenza.class)
				.setParameter("matricola", matricola)
				.getResultList();
	}

}
