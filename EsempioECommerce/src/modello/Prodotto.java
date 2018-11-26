package modello;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Prodotto {

	private String marca;
	private String modello;
	private Float prezzoUnitario;
	@Id
	private String barcode;
	
	@OneToMany(mappedBy="prodotto")
	private List<RigaOrdine> righeOrdine;
	
	public void addRigaOrdine(RigaOrdine ro) {
		if (this.righeOrdine == null) {
			this.righeOrdine = new ArrayList<>();
		}
		this.righeOrdine.add(ro);
		ro.setProdotto(this);
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
	public Float getPrezzoUnitario() {
		return prezzoUnitario;
	}
	public void setPrezzoUnitario(Float prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public List<RigaOrdine> getRigheOrdine() {
		return righeOrdine;
	}
	public void setRigheOrdine(List<RigaOrdine> righeOrdine) {
		this.righeOrdine = righeOrdine;
	}
	
	
}
