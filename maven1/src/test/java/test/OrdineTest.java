package test;

import org.junit.Test;

import modello.Ordine;
import modello.RigaOrdine;

public class OrdineTest {

	@Test
	public void test() {
		Ordine o = new Ordine();
		RigaOrdine ro = new RigaOrdine();
		
		o.addRigaOrdine(ro);
	}

}
