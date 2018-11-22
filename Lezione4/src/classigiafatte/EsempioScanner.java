package classigiafatte;

import java.util.Scanner;

public class EsempioScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("scrivi qualcosa: ");
		String s = sc.nextLine();
		System.out.println("hai scritto: " + s);
	}

}
