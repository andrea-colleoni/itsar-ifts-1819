package lezione3;

public class PoligonoRegolare extends Poligono {

	int apotema;
	int lato;
	
	private String privata;
	protected String protetta;
	public String pubblica;
	String propDefault;
	
	int perimetro() {
		return lato * lati;
	}
	
	int area() {
		return perimetro() * apotema / 2;
	}
	
}
