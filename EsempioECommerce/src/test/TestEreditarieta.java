package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import modello.Cliente;
import modello.Utente;

public class TestEreditarieta {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	@Before
	public void inizializza() {
		this.emf = Persistence.createEntityManagerFactory("ecommerce");
		this.em = emf.createEntityManager();
	}

	@Test
	public void test() {
		Cliente c = new Cliente();
		c.setEmail("cliente");
		
		Utente u = new Utente();
		u.setEmail("utente");
		
		em.getTransaction().begin();
		em.persist(c);
		em.persist(u);
		em.getTransaction().commit();
	}

}
