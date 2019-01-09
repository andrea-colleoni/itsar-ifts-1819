package modello;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Registro {

	@Id
	@Column(length=20)
	private String codiceCorso;
	private String titoloCorso;
	
	@OneToMany(mappedBy="registro")
	@JsonIgnore
	private List<Presenza> presenze;
	
	
	public String getCodiceCorso() {
		return codiceCorso;
	}
	public void setCodiceCorso(String codiceCorso) {
		this.codiceCorso = codiceCorso;
	}
	public String getTitoloCorso() {
		return titoloCorso;
	}
	public void setTitoloCorso(String titoloCorso) {
		this.titoloCorso = titoloCorso;
	}
	public List<Presenza> getPresenze() {
		return presenze;
	}
	public void setPresenze(List<Presenza> presenze) {
		this.presenze = presenze;
	}
	
	
}
