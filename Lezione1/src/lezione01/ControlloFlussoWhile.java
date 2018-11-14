package lezione01;

public class ControlloFlussoWhile {
	
	public static void main(String[] args) {
		int i = 10;
		while(i < 20) { // nelle tonde ci va una condizione
			System.out.println("ciao... " + i);
			i = i + 3;
		}
		// for usando while
		int j = 0;
		while(j < 10) {
			System.out.println("j: " + j);
			j++;
		}
		// altra versione del ciclo while => do...while
		int k = 20;
		do {
			System.out.println("sono passato di qui??");
		} while(k != 20);
	}

}
