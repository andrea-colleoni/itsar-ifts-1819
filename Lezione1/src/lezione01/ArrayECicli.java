package lezione01;

public class ArrayECicli {

	public static void main(String[] args) {
		int[] numeri;
		int a = 2;
		numeri = new int[5];
		
		numeri[0] = 10;
		numeri[1] = 2;
		numeri[2] = 15;
		numeri[3] = 20;
		numeri[4] = 22;
		//numeri[5] = 18;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("i: " + i + " valore: " + numeri[i]);
		}
	}

}
