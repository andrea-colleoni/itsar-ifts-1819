package geometria;

public abstract class PoligonoRegolare implements FiguraPianaChiusa {
	
	private float nLati;
	protected float misuraLato;
	
	public float perimetro() {
		return nLati * misuraLato;
	}

	public float getnLati() {
		return nLati;
	}

	protected void setnLati(float nLati) {
		this.nLati = nLati;
	}

	public float getMisuraLato() {
		return misuraLato;
	}

	public void setMisuraLato(float misuraLato) {
		this.misuraLato = misuraLato;
	}
	

}
