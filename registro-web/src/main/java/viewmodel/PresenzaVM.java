package viewmodel;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import business.RegistroManager;
import business.StudenteManager;
import modello.Presenza;

public class PresenzaVM {
	private Integer codicePresenza;
	
	private Integer idStudente;
	private String idRegistro;
	
	private String dataOraEntrata;
	private String dataOraUscita;
	private String note;
	
	public Presenza model() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Presenza _ret = new Presenza();
		_ret.setCodicePresenza(this.getCodicePresenza());
		_ret.setDataOraEntrata(sdf.parse(this.getDataOraEntrata()));
		_ret.setDataOraUscita(sdf.parse(this.getDataOraUscita()));
		_ret.setNote(this.getNote());
		
		_ret.setStudente(StudenteManager.perId(this.idStudente));
		_ret.setRegistro(RegistroManager.perId(this.idRegistro));
		return _ret;
	}
	
	public Integer getCodicePresenza() {
		return codicePresenza;
	}
	public void setCodicePresenza(Integer codicePresenza) {
		this.codicePresenza = codicePresenza;
	}
	public Integer getIdStudente() {
		return idStudente;
	}
	public void setIdStudente(Integer idStudente) {
		this.idStudente = idStudente;
	}
	public String getIdRegistro() {
		return idRegistro;
	}
	public void setIdRegistro(String idRegistro) {
		this.idRegistro = idRegistro;
	}
	public String getDataOraEntrata() {
		return dataOraEntrata;
	}
	public void setDataOraEntrata(String dataOraEntrata) {
		this.dataOraEntrata = dataOraEntrata;
	}
	public String getDataOraUscita() {
		return dataOraUscita;
	}
	public void setDataOraUscita(String dataOraUscita) {
		this.dataOraUscita = dataOraUscita;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
