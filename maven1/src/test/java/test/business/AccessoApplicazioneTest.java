package test.business;

import static org.junit.Assert.*;

import org.junit.Test;

import business.AccessoApplicazione;
import business.UtenteManager;
import modello.Utente;

public class AccessoApplicazioneTest {

	@Test
	public void testLogin() {
		Utente u = new Utente();
		u.setEmail("email@test.it");
		u.setPassword("password");
		u.setAttivo(true);
		
		UtenteManager.aggiungiUtente(u);
		
		assertTrue("accesso con credenziali giuste", AccessoApplicazione.login("email@test.it", "password"));
		assertFalse("accesso con credenziali errate", AccessoApplicazione.login("email@test.it", "password-errata"));
		assertFalse("accesso con credenziali errate", AccessoApplicazione.login("email@test.errata", "password"));
		
		u.setAttivo(false);
		UtenteManager.modificaUtente(u);
		assertFalse("accesso con credenziali giuste, ma utente non attivo", AccessoApplicazione.login("email@test.it", "password"));
	}

}
