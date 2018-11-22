package jpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Studente {

	@Id
	private int matricola;
	private String nome;
	private String cognome;
	@Temporal(TemporalType.DATE)
	private Date dataNascita;
	private String indirizzo;
	private String email;
	
	@ManyToMany(mappedBy="studenti", cascade=CascadeType.ALL)
	private List<Corso> iscrizioni;
	
	public Studente() {
		super();
		iscrizioni = new ArrayList<Corso>();
	}
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
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Corso> getIscrizioni() {
		return iscrizioni;
	}
	public void setIscrizioni(List<Corso> iscrizioni) {
		this.iscrizioni = iscrizioni;
	}
	
	
}
