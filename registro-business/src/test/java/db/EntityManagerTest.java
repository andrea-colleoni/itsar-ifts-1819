package db;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;

import org.junit.Test;

import utility.JPAUtility;

public class EntityManagerTest {

	@Test
	public void jpaUtilityTest() {
		EntityManager em = JPAUtility.getEm();
		assertNotNull(em);
	}

}
