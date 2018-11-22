package geometria;

public class Quadrato extends PoligonoRegolare {
	
	public Quadrato() {
		super();
		this.setnLati(4);
	}

	public float area() {
		return misuraLato *  misuraLato;
	}

	
}
