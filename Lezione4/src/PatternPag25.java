
public class PatternPag25 {

	public static void main(String[] args) {
		
		printPatternX(6);
	}
	
	public static void printPatternX(int size) {
		for(int riga = 0; riga < size; riga++ ) {
			for(int colonna = 0; colonna < size * 2; colonna++) {
				if(colonna < riga || colonna > (size * 2 - 1 - riga)) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

}
