package lezione2;

public class UsaLaClassePersona {

	public static void main(String[] args) {
		int a = 10;
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();

		p1.nome = "Mario";
		p2.nome = "Anna";
		p3.nome = "Luigi";
		
		p1.cammina();
		p2.cammina();
		p3.cammina();
		
		p1.nomeCompleto();
		
		String n1 = p1.nomeCompleto();
		String n2 = p2.nomeCompleto();
		String n3 = p3.nomeCompleto();
		
		p1.saluta("ciao");
		p2.saluta("buongiorno");
		p3.saluta("buonasera");
		
		p1 = null;
		p2 = p3;
		p2.nome = "Sandro";
		p3.cammina();
	}

}
