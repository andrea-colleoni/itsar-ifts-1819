package test;

import static org.junit.Assert.fail;

import javax.persistence.EntityManager;

import org.junit.Test;

import modello.Cliente;
import utility.EntityManagerProvider;

public class ModificaClienteTest {
	
	private String emailTest = "test@cliente.com";

	@Test
	public void test1() {
		EntityManager em = EntityManagerProvider.getEntityManager();
		Cliente c = em.find(Cliente.class, "email@....");
		
		em.getTransaction().begin();
		c.setPartitaIVA("456789876");
		
		em.getTransaction().commit();
		
	}
	
	@Test
	public void test2() {
		EntityManager em = EntityManagerProvider.getEntityManager();
		Cliente c = new Cliente();
		
		c.setPartitaIVA("879798");
		c.setEmail("iuyiuyiuy");
		
		//  Cliente db = em.find(Cliente.class, c.getEmail());
		
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
		
	}

}
