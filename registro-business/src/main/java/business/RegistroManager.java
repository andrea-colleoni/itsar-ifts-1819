package business;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import modello.Registro;
import utility.JPAUtility;

public class RegistroManager {
	private static Logger log = Logger.getLogger("registro-business");
	
	public static void aggiungiRegistro(Registro r) {
		EntityManager em = JPAUtility.getEm();
		
		Registro rDb = em.find(Registro.class, r.getCodiceCorso());
		if (rDb != null) {
			em.getTransaction().begin();
			em.persist(r); 
			em.getTransaction().commit();
			log.log(Level.INFO, "aggiunto registro");
		} else {
			log.log(Level.WARNING, "registro esiste già");
		}
	}
	
	public static List<Registro> elencoRegistri() {
		EntityManager em = JPAUtility.getEm();
		return em.createQuery("select r from Registro r", Registro.class).getResultList();
	}
}
