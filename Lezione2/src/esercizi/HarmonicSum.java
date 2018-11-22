package esercizi;

public class HarmonicSum {

	public static void main(String[] args) {
		int n = 50000;
		
		double sommaDaSinistra = 0.0;
		double sommaDaDestra = 0.0;
		
		for(int denom = 1; denom <= n; denom++) {
			sommaDaSinistra += (1 / (double)denom);
		}
		System.out.println("Somma da sinistra = " + sommaDaSinistra);
		
		for(int denom = n; denom >= 1; denom--) {
			sommaDaDestra += (1 / (double)denom);
		}
		System.out.println("Somma da destra = " + sommaDaDestra);
		
		System.out.println("Differenza = " + (sommaDaDestra - sommaDaSinistra));
	}

}
