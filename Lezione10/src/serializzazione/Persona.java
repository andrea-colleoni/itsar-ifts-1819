package serializzazione;

import javax.xml.bind.annotation.XmlRootElement;

// serve per la serializzazione con JAXB e indica che Persona è
// un elemto radice dell'XML prodotto (root element)
@XmlRootElement
public class Persona {
	
	private String nome;
	private String cognome;
	private String email;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
