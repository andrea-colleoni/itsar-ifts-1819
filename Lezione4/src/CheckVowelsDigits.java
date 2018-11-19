import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class CheckVowelsDigits {
	/*
	 * Write a program called CheckVowelsDigits, which prompts the user for a
	 * String, counts the number of vowels (a, e, i, o, u, A, E, I, O, U) and digits
	 * (0-9) contained in the string, and prints the counts and the percentages
	 * (with 2 decimal digits)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci la stringa da analizzare > ");
		String testo = sc.nextLine();
		int conteggioVocali = 0;
		int conteggioNumeri = 0;
		
		for(Character c : testo.toCharArray()) {
		// alternativa con ciclo for:
//		for(int i = 0; i < testo.length(); i++) {
//			Character c = testo.charAt(i);
			if (Character.isDigit(c)) {
				conteggioNumeri++;
			} else if (Character.isLetter(c)) {
				switch(Character.toLowerCase(c)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					conteggioVocali++;
					break;
				}
			}
		}
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		
		System.out.println("numero di vocali: " + conteggioVocali + " (" + 
				nf.format(((float)conteggioVocali / testo.length()) * 100) + "% )");
		System.out.println("numero di numeri: " + conteggioNumeri + " (" + 
				nf.format(((float)conteggioNumeri / testo.length()) * 100) + "% )");
	}

}
