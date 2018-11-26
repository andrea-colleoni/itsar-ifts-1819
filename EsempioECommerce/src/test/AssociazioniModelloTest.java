package test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import modello.Cliente;
import modello.Ordine;

public class AssociazioniModelloTest {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	@Before
	public void inizializza() {
		this.emf = Persistence.createEntityManagerFactory("ecommerce");
		this.em = emf.createEntityManager();
	}

	@Test
	public void inserisciClienteConOdiniTest() {
		Cliente c = new Cliente();
		c.setCodiceFiscale("1234");
		c.setEmail("email");
		
		Ordine o = new Ordine();
		o.setNumeroOrdine("test02-2018");
		o.setDataOrdine(new Date());
		
		// impostare l'associazione cliente-ordine
		c.addOrdine(o);
		
		this.em.getTransaction().begin();
		this.em.persist(c);
		this.em.persist(o);
		this.em.getTransaction().commit();
		
	}

}
