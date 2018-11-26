package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import modello.Cliente;

public class EntityManagerTest {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	private String codiceFiscaleDiTest = "0123456";
	
	@Before
	public void inizializza() {
		this.emf = Persistence.createEntityManagerFactory("ecommerce");
		this.em = emf.createEntityManager();
	}

	@Test
	public void funzionamentoEntityManagerTest() {
		// dovrei verificare che em non è nullo!!
		assertNotNull("entity manager è nullo, ma non dovrebbe!", this.em);
	}
	
	private void inserisciClienteDiTest() {
		Cliente c = new Cliente();
		c.setRagioneSociale("Cliente di Test");
		c.setPartitaIVA(this.codiceFiscaleDiTest);
		c.setCodiceFiscale(this.codiceFiscaleDiTest);
		c.setEmail("test@cliente.com");
		
		// salvo il cliente
		this.em.getTransaction().begin();
		this.em.persist(c);
		this.em.getTransaction().commit();
	}

	@Test
	public void inserimentoERimozioneClienteTest() {
		this.inserisciClienteDiTest();
		
		// recupero il cliente (esempio di lettura per chiave)
		Cliente c2 = this.em.find(Cliente.class, this.codiceFiscaleDiTest);
		assertNotNull("non ho trovato il cliente", c2);
		
		// rimuovo il cliente di test
		this.em.getTransaction().begin();
		this.em.remove(c2);
		this.em.getTransaction().commit();
	}
	
	@Test
	public void modificaClienteTest() {
		this.inserisciClienteDiTest();
		// recupero il cliente (esempio di lettura per chiave)
		Cliente c1 = this.em.find(Cliente.class, this.codiceFiscaleDiTest);
		
		this.em.getTransaction().begin();
		c1.setPartitaIVA("*****");
		c1.setEmail("#####");
		this.em.getTransaction().commit();
		
		Cliente c2 = this.em.find(Cliente.class, this.codiceFiscaleDiTest);
		assertEquals("la partita IVA non coincide", "*****", c2.getPartitaIVA());
		assertEquals("l'email non coincide", "#####", c2.getEmail());
		
		// rimuovo il cliente di test
		this.em.getTransaction().begin();
		this.em.remove(c2);
		this.em.getTransaction().commit();
	}

}
