package lezione01;

public class Variabili {

	public static void main(String[] args) {
		int base;
		base = 10;
		
		int altezza = 20;
		altezza = altezza + 5; // la variabile può variare
		
		base++; // incremento
		base = base + 1;
		
		base--; // decremento
		base = base - 1;
		
		// incremento postfisso ( qui parto con la base a 10)
		System.out.println("base prima dell'incremento: " + base);
		System.out.println(base++);
		System.out.println("base dopo l'incremento: " + base);
		
		// incremento prefisso ( qui parto con la base a 11)
		System.out.println("base prima dell'incremento: " + base);
		System.out.println(++base);
		System.out.println("base dopo l'incremento: " + base);	
		
		int b, h;
		
		int area = base * altezza;
		
		System.out.println("L'area del rettangolo è " + area);
	}

}
