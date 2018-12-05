package modello;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Studente {
	
	@Id
	private int matricola;
	private String nome;
	private String cognome;
	
	@OneToMany(mappedBy="studente")
	private List<Presenza> presenze;
	
	
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
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
	public List<Presenza> getPresenze() {
		return presenze;
	}
	public void setPresenze(List<Presenza> presenze) {
		this.presenze = presenze;
	}

}
