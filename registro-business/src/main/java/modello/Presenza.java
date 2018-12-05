package modello;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Presenza implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codicePresenza;
	
	@ManyToOne
	private Studente studente;
	@ManyToOne
	private Registro registro;
	
	private Date dataOraEntrata;
	private Date dataOraUscita;
	private String note;

	public Presenza() {
		super();
	}

	public Studente getStudente() {
		return studente;
	}

	public void setStudente(Studente studente) {
		this.studente = studente;
	}

	public Date getDataOraEntrata() {
		return dataOraEntrata;
	}

	public void setDataOraEntrata(Date dataOraEntrata) {
		this.dataOraEntrata = dataOraEntrata;
	}

	public Date getDataOraUscita() {
		return dataOraUscita;
	}

	public void setDataOraUscita(Date dataOraUscita) {
		this.dataOraUscita = dataOraUscita;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	public int getCodicePresenza() {
		return codicePresenza;
	}

	public void setCodicePresenza(int codicePresenza) {
		this.codicePresenza = codicePresenza;
	}
	
	

}
