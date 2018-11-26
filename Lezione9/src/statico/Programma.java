package statico;

public class Programma {
	
	private String nonStatica;

	public static void main(String[] args) {
		
		System.out.println("Argomenti del programma:");
		for(String s : args) {
			System.out.println(s);
		}
		System.out.println("------------------------");
		
		Persona.variabileStatica = "Buonasera";
		
		Programma prog = new Programma();
		prog.nonStatica = "valore";
		prog.go();
		
		System.out.println(prog.nonStatica);

	}
	
	public void go() {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		p1.setNome("Mario");
		p2.setNome("Luigi");
		
		p1.variabileStatica = "Ciao";
		p2.variabileStatica = "Buongiorno";
	}

}
