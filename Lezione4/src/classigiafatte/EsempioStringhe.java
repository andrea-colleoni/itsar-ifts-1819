package classigiafatte;

public class EsempioStringhe {

	public static void main(String[] args) {
		String testo = "abcdefghijklmnopqrstuvwxyz-abcdefghilmn";

		System.out.println("la stringa è lunga " + testo.length());

		System.out.println("la 5^ lettera della stringa è " + testo.charAt(4));
		System.out.println(testo.substring(4));
		System.out.println(testo.substring(4, 10));

		System.out.println(testo.replace('m', '#'));
		System.out.println(testo.replaceAll("defgh", "##############"));

		System.out.println(testo.indexOf("n"));
		System.out.println(testo.indexOf("n", 15));

		System.out.println(testo.lastIndexOf("n"));
		System.out.println(testo.lastIndexOf("n", 15));

		System.out.println(testo.toUpperCase());
		System.out.println(testo.toUpperCase().substring(8, 20).indexOf("J"));
		
		
	}

}
