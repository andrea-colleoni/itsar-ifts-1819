package modello;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestProgramma {

	public static void main(String[] args) {
		// ottenere un'istanza di EntityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ecommerce");
		EntityManager em = emf.createEntityManager();

		Cliente c = new Cliente();
		c.setRagioneSociale("Cliente di Test");
		c.setPartitaIVA("012345");
		c.setCodiceFiscale("012345");
		c.setEmail("test@cliente.com");
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	}

}
