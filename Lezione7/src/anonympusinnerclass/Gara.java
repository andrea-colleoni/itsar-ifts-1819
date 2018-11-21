package anonympusinnerclass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Gara {

	public static void main(String[] args) {
		List<Automobile> gara = new ArrayList<>();;

		gara.add(new Automobile("BMW"));
		gara.add(new Automobile("Fiat"));
		gara.add(new Automobile("Range Rover"));
		gara.add(new Automobile("Porsche"));
		gara.add(new Automobile("Ferrari"));

		for (Automobile auto : gara) {
			auto.rifornimento((float)(Math.random() * 40 + 10));
			auto.accendi();
		}
		while(	gara.stream().anyMatch((a) -> a.isAccesa())) {
			for (Automobile auto : gara) {
				if(auto.isAccesa()) {
					auto.viaggia(1);
				}
			}
		}
		// anonymus inner class che fornisce un'implementazione dell'interfaccia
		// comparator che confronta tra loro le auto due a due
		gara.sort(new Comparator<Automobile>() {
			@Override
			public int compare(Automobile auto1, Automobile auto2) {
				return (int)(auto2.getCapacitaSerbatoio() - auto1.getCapacitaSerbatoio());
			}
		});
		// riscrivo come lambda expression
		gara.sort((auto1, auto2) -> (int)(auto2.getCapacitaSerbatoio() - auto1.getCapacitaSerbatoio()));
		
		System.out.println("------------ORDINE DI ARRIVO-----------------");
		for (Automobile auto : gara) {
			System.out.println(auto.getNome() + " ha percoso " + auto.getKmPercorsi() + " km");
		}
	}

	
	private static void scambia(Automobile[] array, int i, int j ) {
		Automobile temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
