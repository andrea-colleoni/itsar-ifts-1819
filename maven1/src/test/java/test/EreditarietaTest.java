package test;

import javax.persistence.EntityManager;

import org.junit.Test;

import modello.Cliente;
import modello.Utente;
import utility.EntityManagerProvider;

public class EreditarietaTest {

	@Test
	public void test() {
		EntityManager em = EntityManagerProvider.getEntityManager();
		
		Cliente c = new Cliente();
		c.setEmail("cliente@");
		c.setPassword("pass");
		c.setAttivo(false);
		c.setCodiceFiscale("ABCDEF");
		c.setPartitaIVA("01235");
		c.setIndirizzo("qui");
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
		Cliente c2 = em.find(Cliente.class, "cliente@");
		System.out.println(c2.getPassword());
		
		Utente u = new Utente();
		u.setAttivo(true);
		u.setEmail("utente@");
		u.setPassword("xxx");
		
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		
		Utente u2 = em.find(Utente.class, "utente@");
		System.out.println(u2.getPassword());
		
	}

}
