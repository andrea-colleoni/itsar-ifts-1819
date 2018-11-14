package esercizi;

public class NestedLoopPatternA {

	public static void main(String[] args) {
		int dimensione = 8;
		for (int riga = 1; riga <= dimensione; riga++) {
			for (int colonna = 1; colonna <= riga; colonna++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
