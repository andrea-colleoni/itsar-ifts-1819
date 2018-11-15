package eserciziogaraguidato;

public class Gara {

	public static void main(String[] args) {
		Automobile[] gara = new Automobile[5];
//		
//		for(int i = 0; i < gara.length; i++ ) {
//			gara[i] = new Automobile();	
//		}
		gara[0] = new Automobile("BMW");
		gara[1] = new Automobile("Fiat");
		gara[2] = new Automobile("Range Rover");
		gara[3] = new Automobile("Porsche");
		gara[4] = new Automobile("Ferrari");
		gara = new Automobile[6];
		gara[5] = new Automobile("Enterprise");

		//for (int i = 0; i < gara.length; i++) {
		for (Automobile auto : gara) {
			auto.rifornimento((float)(Math.random() * 40 + 10));
			auto.accendi();
		}
		while(	gara[0].isAccesa() ||
				gara[1].isAccesa() ||
				gara[2].isAccesa() ||
				gara[3].isAccesa() ||
				gara[4].isAccesa()) {
			for (Automobile auto : gara) {
				if(auto.isAccesa()) {
					auto.viaggia(1);
				}
			}
		}
		// bubble sort
		for(int indiceEsternoBS = 0; indiceEsternoBS < gara.length - 1; indiceEsternoBS++) {
			for(int indiceInternoBS = indiceEsternoBS + 1; indiceInternoBS < gara.length; indiceInternoBS++) {
				if (gara[indiceEsternoBS].getKmPercorsi() < gara[indiceInternoBS].getKmPercorsi()) {
					scambia(gara, indiceEsternoBS, indiceInternoBS);
				}
			}
		}
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
