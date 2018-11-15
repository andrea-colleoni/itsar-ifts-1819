package eserciziogaraguidato;

public class Automobile {

	private String nome;
	private boolean accesa;
	private float livelloCarburante;
	private float kmPercorsi;
	private float consumoKmLitro;
	private float capacitaSerbatoio;
	
	public Automobile(String nome) {
		this.accesa = false;
		this.nome = nome;
		this.consumoKmLitro = (float)(Math.random() * 10 + 15);
		this.capacitaSerbatoio = (float)(Math.random() * 25 + 35);
		System.out.println(this.nome + " creata con capacità: " + this.capacitaSerbatoio +
				", consumo: " + this.consumoKmLitro);
	}
	
	public void accendi() {
		this.accesa = true;
	}
	
	public void spegni() {
		this.accesa = false;
	}
	
	public void viaggia(float km) {
		float carburanteDaConsumare = km / this.consumoKmLitro;
		if (this.isAccesa() && carburanteDaConsumare <= this.livelloCarburante) {
			this.kmPercorsi += km;
			this.livelloCarburante -= carburanteDaConsumare;
		} else {
			System.out.println(this.nome + ": sono spenta oppure non ho carburante sufficiente");
			this.spegni();
		}
	}
	
	public void rifornimento(float litri) {
		float capacitaResidua = this.capacitaSerbatoio - this.livelloCarburante;
		if(capacitaResidua >= litri) {
			this.livelloCarburante += litri;
			System.out.println(this.nome + ": rifornimento effettuato; livello carburante: " + this.livelloCarburante);
		} else {
			this.livelloCarburante = this.capacitaSerbatoio;
			float eccedenza = litri - capacitaResidua;
			System.out.println(this.nome + ": troppa benzina! ho fatto il pieno, ma sono avanzati " + eccedenza + " litri");
		}
	}
	
	public String getNome() {
		return nome;
	}
	public boolean isAccesa() {
		return accesa;
	}
	
	public float getLivelloCarburante() {
		return livelloCarburante;
	}
	public void setLivelloCarburante(float livelloCarburante) {
		this.livelloCarburante = livelloCarburante;
	}
	public float getKmPercorsi() {
		return kmPercorsi;
	}
	public void setKmPercorsi(float kmPercorsi) {
		this.kmPercorsi = kmPercorsi;
	}
	public float getConsumoKmLitro() {
		return consumoKmLitro;
	}
	public void setConsumoKmLitro(float consumoKmLitro) {
		this.consumoKmLitro = consumoKmLitro;
	}
	public float getCapacitaSerbatoio() {
		return capacitaSerbatoio;
	}
	public void setCapacitaSerbatoio(float capacitaSerbatoio) {
		this.capacitaSerbatoio = capacitaSerbatoio;
	}
}
