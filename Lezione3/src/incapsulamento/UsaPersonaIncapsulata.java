package incapsulamento;

public class UsaPersonaIncapsulata {

	public static void main(String[] args) {
		Persona p = new Persona();
		
		p.setNome("Mario");
		
		System.out.println(p.getNome());
		
		PersonaFisica pf = new PersonaFisica();
		pf.setCognome("Rossi");
		pf.setCodiceFiscale("RSSMRO45657898765");
		
		Persona pf2 = new PersonaFisica();
		pf2.setNome("Anna");
		((PersonaFisica)pf2).setCodiceFiscale("ABCDEFGHI45678");
		((PersonaGiuridica)pf2).setPartitaIVA("123456678765");
	}

}
