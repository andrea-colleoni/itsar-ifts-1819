package modello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RigaOrdine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer numeroRiga;
	
	@ManyToOne
	private Prodotto prodotto;
	private Integer quantita;
	@ManyToOne
	private Ordine ordine;
	
	public Prodotto getProdotto() {
		return prodotto;
	}
	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}
	public Ordine getOrdine() {
		return ordine;
	}
	public void setOrdine(Ordine ordine) {
		this.ordine = ordine;
	}
	public Integer getNumeroRiga() {
		return numeroRiga;
	}
	public void setNumeroRiga(Integer numeroRiga) {
		this.numeroRiga = numeroRiga;
	}
	
	

}
