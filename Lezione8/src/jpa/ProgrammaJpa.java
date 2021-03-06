package jpa;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProgrammaJpa {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lezione8");
		EntityManager em = emf.createEntityManager();
		
		Studente s = new Studente();
		s.setNome("Mario");
		s.setCognome("Rossi");
		s.setMatricola(123);
		s.setEmail("mario@scuola.it");
		s.setIndirizzo("Milano");
		s.setDataNascita(new Date());
		
		Corso c = new Corso();
		c.setCodice(2);
		c.setNome("ITS");
		
		s.getIscrizioni().add(c);
		c.getStudenti().add(s);
		
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		
	}

}
