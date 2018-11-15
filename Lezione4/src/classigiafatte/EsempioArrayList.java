package classigiafatte;

import java.util.ArrayList;

public class EsempioArrayList {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();

		lista.add("ciao");
		lista.add("buongiorno");
		System.out.println("hai aggiunto " + lista.size() + " elementi");
		lista.add("buonasera");
		System.out.println("hai aggiunto " + lista.size() + " elementi");

		for (String s : lista) {
			System.out.println(s);
		}
		lista.remove("ciao");
		System.out.println("hai aggiunto " + lista.size() + " elementi");

		for (String s : lista) {
			System.out.println(s);
		}
		lista.add("arrivederci");
		for (String s : lista) {
			System.out.println(s);
		}
		lista.sort(null);
		for (String s : lista) {
			System.out.println(s);
		}
		if(lista.contains("dfdfgdfg")) {
			System.out.println("c'è");
		} else {
			System.out.println("non c'è");
		}
		System.out.println(lista.indexOf("buongiorno"));
		
		lista.get(2);
	}

}
