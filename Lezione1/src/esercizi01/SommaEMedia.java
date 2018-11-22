package esercizi01;

public class SommaEMedia {

	public static void main(String[] args) {
		int somma = 1;
		for (int i = 2; i <= 100; i++) {
			somma = somma + i;
		}
		System.out.println("La somma dei primi 100 numeri è " + somma);
		System.out.println("La media dei primi 100 numeri è " + ((float) somma / 100));
		// (float)somma = CAST è l'interpretazione dell'int somma come float

		// rifaccio usando while
		int sommaWhile = 1;
		int i = 2;
		while (i <= 100) {
			sommaWhile = sommaWhile + i;
			i++;
		} 
		System.out.println("La somma dei primi 100 numeri è " + sommaWhile);
		System.out.println("La media dei primi 100 numeri è " + ((float) sommaWhile / 100));

		// rifaccio usando do...while
		int sommaDoWhile = 1;
		int j = 2;
		do {
			sommaDoWhile = sommaDoWhile + j;
			j++;
		} while (j <= 100);
		System.out.println("La somma dei primi 100 numeri è " + sommaDoWhile);
		System.out.println("La media dei primi 100 numeri è " + ((float) sommaDoWhile / 100));
	}

}
