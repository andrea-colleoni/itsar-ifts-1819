package eserciziogara;

import java.util.Arrays;
import java.util.Comparator;

public class Gara {

	public static void main(String[] args) {
		Automobile[] gara = new Automobile[5];

		for (int i = 0; i < gara.length; i++) {
			gara[i] = new Automobile();
		}
		gara[0].setNome("BMW");
		gara[1].setNome("Audi");
		gara[2].setNome("Fiat");
		gara[3].setNome("Toyota");
		gara[4].setNome("Renault");

		for (int i = 0; i < gara.length; i++) {
			gara[i].setConsumoKmLitro((float) Math.random() * 10 + 15);
			gara[i].setCapacitaSerbatoio((float) Math.random() * 25 + 35);
			gara[i].rifornimento((float) Math.random() * 40 + 10);
		}

		for (int i = 0; i < gara.length; i++) {
			gara[i].accendi();
		}

		while (gara[0].isAccesa() || gara[1].isAccesa() || gara[2].isAccesa() || gara[3].isAccesa()
				|| gara[4].isAccesa()) {
			for (int i = 0; i < gara.length; i++) {
				if (gara[i].isAccesa()) {
					gara[i].viaggia(1);
				}
			}
		}
		Arrays.sort(gara, new Comparator<Automobile>() {
			@Override
			public int compare(Automobile o1, Automobile o2) {
				return (int) (o2.getKmPercorsi() - o1.getKmPercorsi());
			}
		});
		System.out.println("---------RISULTATI DELLA GARA--------------");
		for (int i = 0; i < gara.length; i++) {
			System.out.println(gara[i].getNome() + " ha percorso " + gara[i].getKmPercorsi() + " km.");
		}
	}

}
