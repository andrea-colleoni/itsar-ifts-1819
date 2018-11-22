package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AltroProgramma {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lezione8");
		EntityManager em = emf.createEntityManager();
		
		Studente s = em.find(Studente.class, 1234);
//		Corso c = em.find(Corso.class, 1);
		
//		em.getTransaction().begin();
//		s.getIscrizioni().add(c);
//		c.getStudenti().add(s);
//		em.getTransaction().commit();
		
		for(Corso c : s.getIscrizioni()) {
			System.out.println(c.getNome());
		}

	}

}
