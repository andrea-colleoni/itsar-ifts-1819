package esercizi;

public class NestedLoopPatternI {

	public static void main(String[] args) {
		int dimensione = 7;
		for (int riga = 1; riga <= dimensione; riga++) {
			for (int colonna = 1; colonna <= dimensione; colonna++) {
//				if (riga == 1 || riga == dimensione) {
//					System.out.print("#");
//				} else {
//					if (colonna == 1 || colonna == dimensione) {
//						System.out.print("#");
//					} else if (riga == colonna) {
//						System.out.print("#");
//					} else if (riga + colonna == dimensione + 1) {
//						System.out.print("#");
//					} else {
//						System.out.print(" ");
//					}
//				}
				if (	riga == 1 || 
						riga == dimensione || 
						colonna == 1 || 
						colonna == dimensione || 
						riga == colonna || 
						riga + colonna == dimensione + 1
					) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
