package eserciziogara;

public class Automobile {

	private String nome;
	private boolean accesa;
	private float livelloCarburante;
	private float kmPercorsi;
	private float consumoKmLitro;
	private float capacitaSerbatoio;

	public void accendi() {
		this.accesa = true;
	}

	public void spegni() {
		this.accesa = false;
	}

	public void viaggia(float km) {
		float consumoPrevisto = km / this.consumoKmLitro;
		if (this.isAccesa()) {
			if (consumoPrevisto <= this.livelloCarburante) {
				this.livelloCarburante -= consumoPrevisto;
				this.kmPercorsi += 1;
			} else {
				System.out.println(this.getNome() + ": livello di carburante insufficiente");
				this.spegni();
			}
		} else {
			System.out.println(this.getNome() + ": la macchina è spenta e non può viaggiare");
		}
	}

	public void rifornimento(float litri) {
		float capacitaResidua = this.capacitaSerbatoio - this.livelloCarburante;
		if (capacitaResidua >= litri) {
			System.out.println(this.getNome() + ": effettuato rifornimento di " + litri + " litri");
			this.livelloCarburante += litri;
		} else {
			System.out.println(this.getNome() + ": troppi litri di carburante; impossibile fare rifornimento");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAccesa() {
		return accesa;
	}

	public void setAccesa(boolean accesa) {
		this.accesa = accesa;
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
