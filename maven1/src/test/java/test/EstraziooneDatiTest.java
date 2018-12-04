package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import modello.Cliente;
import modello.Ordine;

public class EstraziooneDatiTest {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	@Before
	public void inizializza() {
		this.emf = Persistence.createEntityManagerFactory("ecommerce");
		this.em = emf.createEntityManager();
	}

	@Test
	public void elencoClientiTest() {
		List<Cliente> elenco;
		
		// lettura con query dell'elenco clienti
		// il linguaggio utilizzato si chiama JPQL
		elenco = this.em.createQuery("select c from Cliente c", Cliente.class).getResultList();
		
		for(Cliente c : elenco) {
			System.out.println("Cliente: " + c.getCodiceFiscale());
			for(Ordine o : c.getOrdini()) {
				System.out.println("Ordine :" + o.getNumeroOrdine());
			}
			System.out.println("----------");
		}
	}

}
