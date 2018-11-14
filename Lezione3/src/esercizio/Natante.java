package esercizio;

public class Natante extends Mezzo {

	private float pescaggio;
	
	

	public float getPescaggio() {
		return pescaggio;
	}

	public void setPescaggio(float pescaggio) {
		this.pescaggio = pescaggio;
	}

	@Override
	public void muovi() {
		System.out.println("mi muovo sull'acqua...");
	}

	@Override
	public void fermati() {
		super.fermati();
	}
	
	
}
