package esercizio;

public class Mezzo {
	
	private float peso;
	private String colore;
	private int numeroPosti;
	private String marca;
	private String modello;
	private String sistemaGuida;
	
	public void muovi() {
		System.out.println("mi muovo...");
	}
	
	public void fermati() {
		System.out.println("mi fermo.");
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
	// un'altra cosa...
	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
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

	public String getSistemaGuida() {
		return sistemaGuida;
	}

	public void setSistemaGuida(String sistemaGuida) {
		this.sistemaGuida = sistemaGuida;
	}

}
