package modello;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Cliente extends Utente {
	
	private String ragioneSociale;
	private String codiceFiscale;
	private String partitaIVA;
	private String indirizzo;
	private String numeroTelefono;
	
	@OneToMany(mappedBy="cliente")
	private List<Ordine> ordini;
	
	public void addOrdine(Ordine o) {
		if (this.ordini == null) {
			this.ordini = new ArrayList<>();
		}
		this.ordini.add(o);
		o.setCliente(this);
	}
	
	public void removeOrdine(Ordine o) {
		if (this.ordini != null) {
			this.ordini.remove(o);
		}
		o.setCliente(null);
	}
	
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public String getPartitaIVA() {
		return partitaIVA;
	}
	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public List<Ordine> getOrdini() {
		return ordini;
	}
	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}
	
	

}
