package lezione01;

public class ControlloFlussoSwitch {

	public static void main(String[] args) {
		int b = 5;

		switch (b) { // valuto i possibili valori di b
		case 1:
			System.out.println("b vale 1");
			break;
		case 5:
			System.out.println("b vale 5");
			break;
		case 7:
			System.out.println("b vale 7");
			break;
		default:
			System.out.println("nessuno dei casi precedenti");
		}
	}

}
