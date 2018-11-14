package esercizio;

public class UsaMezziDiTrasporto {

	public static void main(String[] args) {
		Mezzo[] mezzi = new Mezzo[5];
		mezzi[0] = new Terrestre();
		mezzi[1] = new Terrestre();
		mezzi[2] = new Volante();
		mezzi[3] = new Natante();
		mezzi[4] = new Natante();

		for(int i = 0; i < mezzi.length; i++) {
			mezzi[i].muovi();
			mezzi[i].fermati();
		}
		
	}

}
