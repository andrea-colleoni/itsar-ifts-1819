package test;

import java.util.Date;

import javax.persistence.EntityManager;

import org.junit.Test;

import modello.Cliente;
import modello.Ordine;
import modello.Prodotto;
import modello.RigaOrdine;
import utility.EntityManagerProvider;

public class RigheOrdineTest {
	
	@Test
	public void test() {
		EntityManager em = EntityManagerProvider.getEntityManager();
		
		Ordine o = new Ordine();
		o.setNumeroOrdine("0123");
		o.setDataOrdine(new Date());
		
		Cliente c = new Cliente();
		c.setEmail("email@");
		c.addOrdine(o);
		
		RigaOrdine ro1 = new RigaOrdine();
		
		Prodotto p = new Prodotto();
		p.setBarcode("098765");
		p.setMarca("Barilla");
		p.setModello("Spaghetti 05");
		ro1.setProdotto(p);
		ro1.setQuantita(1);
		
		o.addRigaOrdine(ro1);
		
		RigaOrdine ro2 = new RigaOrdine();
		ro2.setProdotto(p);
		ro2.setQuantita(2);
	
		o.addRigaOrdine(ro2);
		
		em.getTransaction().begin();
		em.persist(c);
		em.persist(o);
		em.persist(ro1);
		em.persist(ro2);
		em.persist(p);
		em.getTransaction().commit();
		
	}

}
