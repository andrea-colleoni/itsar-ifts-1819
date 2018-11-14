package lezione2;

public class PrimaClasse {

	public static void main(String[] args) {
		System.out.println("prima della chiamata");
		metodo1();
		System.out.println("dopo la chiamata di metodo");
	}

	public static void metodo1() {
		SecondaClasse.metodo2();
		System.out.println("m1");
	}
}
