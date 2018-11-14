package lezione3;

public class UsaFigureGeometriche {

	public static void main(String[] args) {
		Poligono p = new Poligono();
		
		p.lati = 4;
		p.regolare = false;
		
		PoligonoRegolare pr = new PoligonoRegolare();
		pr.lati = 4;
		pr.lato = 10;
		pr.apotema = 8;
		System.out.println(pr.area());
		
		Quadrato q = new Quadrato();
		q.lato = 20;
		System.out.println(q.area());

	}

}
