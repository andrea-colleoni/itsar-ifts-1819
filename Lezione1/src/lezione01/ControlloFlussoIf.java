package lezione01;

public class ControlloFlussoIf {

	public static void main(String[] args) {
		// controllo di flusso condizionale (if)
		int a = 0;
		int b = 20;
		// due casi
		if (a == b) {
			System.out.println("a e b sono uguali");
			System.out.println("faccio altre cose (case true)...");
		} else {
			System.out.println("a e b sono diversi");
			System.out.println("faccio altre cose (caso false)...");
		}
		// tre casi
		b = 21;
		if (b < 10) {
			System.out.println("b è minore di 10");
		} else if (b > 20) {  
			System.out.println("b è maggiore di 20");
		} else if (b > 15) {
			System.out.println("b è maggiore di 15");	
		} else {
			System.out.println("b è compreso tra 10 e 20");
		}
		System.out.println("ho finito.");
	}

}
