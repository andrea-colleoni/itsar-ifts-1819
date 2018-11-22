package esercizi;

public class CozaLozaWoza {

	public static void main(String[] args) {
		int max = 110;
		int fineRiga = 11;
		int coza = 3;
		int loza = 5;
		int woza = 7;
		
		for(int i = 1; i <= max; i++) {
			boolean hoScritto = false;
			if (i % coza == 0) {
				System.out.print("Coza");
				hoScritto = true;
			}
			if (i % loza == 0) {
				System.out.print("Loza");
				hoScritto = true;
			}
			if (i % woza == 0) {
				System.out.print("Woza");
				hoScritto = true;
			}
			//if(i % coza != 0 && i % loza != 0 && i % woza != 0) {
			//if(hoScritto == false) {
			if(!hoScritto) {
				System.out.print(i);
			}
			
			if (i % fineRiga == 0) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
		}
	}

}
