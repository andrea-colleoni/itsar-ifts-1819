package lezione2;

public class Persona {
	
	String nome; // variabile d'istanza
	String cognome;
	String email;
	
	void cammina() {
		System.out.println("io sono " + nome + " e cammino...");
	}
	
	String nomeCompleto() {
		String nomeCompleto = nome + " " + cognome; // variabile locale
		return nomeCompleto;
	}
	
	void saluta(String messaggio) { // argomento del metodo
		System.out.println(nome + " dice: " + messaggio);
	}

}
