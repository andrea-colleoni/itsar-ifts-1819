package business;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import modello.Studente;
import utility.JPAUtility;

public class StudenteManager {
	
	private static Logger log = Logger.getLogger("registro-business");
	
	public static void aggiungiStudente(Studente s) {
		EntityManager em = JPAUtility.getEm();
		
		Studente sDb = em.find(Studente.class, s.getMatricola());
		if (sDb == null) {
			em.getTransaction().begin();
			em.persist(s); // aggiungo lo studente a DB
			em.getTransaction().commit();
			log.log(Level.INFO, "aggiunto studente");
		} else {
			log.log(Level.WARNING, "studente esiste già");
		}
	}
	
	public static List<Studente> elencoStudenti() {
		EntityManager em = JPAUtility.getEm();
		return em.createQuery("select s from Studente s", Studente.class).getResultList();
	}

}
