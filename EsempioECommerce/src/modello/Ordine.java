package modello;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The Class Ordine.
 */
@Entity
public class Ordine {
	
	/** The data ordine. */
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataOrdine;
	
	/** The numero ordine. */
	@Id
	private String numeroOrdine;

	/** The cliente. */
	@ManyToOne
	private Cliente cliente;
	
	/** The righe ordine. */
	@OneToMany(mappedBy="ordine")
	private List<RigaOrdine> righeOrdine;
	
	/**
	 * Questo metodo aggiunge una riga d'ordine all'ordine e
	 * imposta l'ordine corrente sulla riga d'ordine.
	 *
	 * @param ro the ro
	 */
	public void addRigaOrdine(RigaOrdine ro) {
		if (this.righeOrdine == null) {
			this.righeOrdine = new ArrayList<>();
		}
		this.righeOrdine.add(ro);
		ro.setOrdine(this);
	}
	
	/**
	 * Removes the riga ordine.
	 *
	 * @param ro the ro
	 */
	public void removeRigaOrdine(RigaOrdine ro) {
		if (this.righeOrdine != null) {
			this.righeOrdine.remove(ro);
		}
		ro.setOrdine(null);
	}
	
	/**
	 * Gets the data ordine.
	 *
	 * @return the data ordine
	 */
	public Date getDataOrdine() {
		return dataOrdine;
	}
	
	/**
	 * Sets the data ordine.
	 *
	 * @param dataOrdine the new data ordine
	 */
	public void setDataOrdine(Date dataOrdine) {
		this.dataOrdine = dataOrdine;
	}
	
	/**
	 * Gets the numero ordine.
	 *
	 * @return the numero ordine
	 */
	public String getNumeroOrdine() {
		return numeroOrdine;
	}
	
	/**
	 * Sets the numero ordine.
	 *
	 * @param numeroOrdine the new numero ordine
	 */
	public void setNumeroOrdine(String numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}
	
	/**
	 * Gets the cliente.
	 *
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * Sets the cliente.
	 *
	 * @param cliente the new cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	

}
