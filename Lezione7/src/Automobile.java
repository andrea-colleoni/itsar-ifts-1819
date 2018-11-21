import java.util.Date;

public class Automobile {
	
	private Integer id;
	private String marca;
	private String modello;
	private Float cilindrata;
	private Date dataImmatricolazione;
	private Integer numeroPosti;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public Float getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(Float cilindrata) {
		this.cilindrata = cilindrata;
	}
	public Date getDataImmatricolazione() {
		return dataImmatricolazione;
	}
	public void setDataImmatricolazione(Date dataImmatricolazione) {
		this.dataImmatricolazione = dataImmatricolazione;
	}
	public Integer getNumeroPosti() {
		return numeroPosti;
	}
	public void setNumeroPosti(Integer numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	@Override
	public String toString() {
		return "Automobile [id=" + id + ", marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata
				+ ", dataImmatricolazione=" + dataImmatricolazione + ", numeroPosti=" + numeroPosti + "]";
	}

	
}
