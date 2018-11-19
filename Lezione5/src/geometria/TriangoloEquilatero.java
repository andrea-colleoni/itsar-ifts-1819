package geometria;

public class TriangoloEquilatero extends PoligonoRegolare {
	
	public TriangoloEquilatero() {
		super();
		this.setnLati(3);
	}

	public float area() {
		double altezza = Math.sqrt(Math.pow(misuraLato, 2) - 
				Math.pow(misuraLato / 2,  2));
		
		return (float)(misuraLato * altezza / 2);
	}
}
