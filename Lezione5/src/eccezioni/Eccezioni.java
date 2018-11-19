package eccezioni;

public class Eccezioni {

	public static void main(String[] args) {
		
		Integer a = 0;
		Integer b = null;
		
		try {
			System.out.println(a / b);
			System.out.println("ho fatto il calcolo");
		} catch(ArithmeticException e) {
			System.out.println("arithmetic");
		} catch (Exception e) {
			System.out.println("generica");
			e.printStackTrace();
		} 
		System.out.println("ho finito.");
	}
}
