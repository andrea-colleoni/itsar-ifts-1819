package programma;

import java.util.ArrayList;
import java.util.Collection;

import geometria.FiguraPianaChiusa;
import geometria.Quadrato;
import geometria.TriangoloEquilatero;

public class UsaFigure {

	public static void main(String[] args) {
		Quadrato q = new Quadrato();
		q.setMisuraLato(3);
		
		System.out.println(q.area());
		
		TriangoloEquilatero t = new TriangoloEquilatero();
		t.setMisuraLato(5);
		// t.setnLati(3);
		
		System.out.println(t.area());
		
		// un tipo astratto non è istanziabile )non posso fare new() ) 
		//PoligonoRegolare poli = new PoligonoRegolare();
		
		
		Collection<FiguraPianaChiusa> figure = new ArrayList<>();
		figure.add(q);
		figure.add(t);

		
		for(FiguraPianaChiusa f : figure) {
			System.out.println(f.perimetro());
			System.out.println(f.area());
		}
		
	}

}
