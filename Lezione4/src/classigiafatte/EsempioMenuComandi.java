package classigiafatte;

import java.util.Scanner;

public class EsempioMenuComandi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu:");
		System.out.println("1. Fai ....");
		System.out.println("2. Fai ,,,,");
		System.out.println("3. Fai @@@@@");
		System.out.println("0. Esci");
		System.out.print("Scelta > ");
		int comando = sc.nextInt();
		while( comando != 0) {
			switch(comando) {
			case 1:
				System.out.println(".....");
				break;
			case 2:
				System.out.println(",,,,");
				break;
			case 3:
				System.out.println("@@@@");
				break;
			default:
				System.out.println("comando non disponibile");
			}
			System.out.println();
			System.out.print("Scelta > ");
			comando = sc.nextInt();
		}
		System.out.println("programma terminato");

	}

}
