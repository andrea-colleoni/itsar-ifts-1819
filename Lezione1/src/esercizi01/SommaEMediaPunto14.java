package esercizi01;

public class SommaEMediaPunto14 {

	public static void main(String[] args) {
		int limiteInferiore = 111;
		int limiteSuperiore = 10000;
		int somma = limiteInferiore;
		int numeroDiNumeri = 1;
		for (int i = limiteInferiore + 1; i <= limiteSuperiore; i++) {
			if (i % 2 == 0) {
				somma = somma + i;
				numeroDiNumeri++;
			}
		}
		System.out.println("La somma dei primi 100 numeri è " 
				+ somma);
		System.out.println("La media dei primi 100 numeri è " 
				+ ((float) somma / numeroDiNumeri));
	}

}
