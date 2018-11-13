package lezione01;

public class ControlloFlussoFor {

	public static void main(String[] args) {
		// la 1^ istruzione viene eseguita prima di entrare la prima volta nel ciclo
		// la 2^ istruzione (condizione) viene eseguita prima di ogni ciclo
		// la 3^ istruzione viene eseguita ad ogni fine ciclo
		for(int i = 0;
				i < 10;
				i++) {
			System.out.println("i: " + i);
		}
		// equivalente a quello sopra
		int j = 0;
		for(;;) {
			if(j < 10) {
				System.out.println("j: " + j);
			} else {
				break;
			}
			j = j + 2;
		}

	}

}
