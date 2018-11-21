import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Programma {

	static Logger log = Logger.getLogger("esempio");
	
	public static void main(String[] args) {
		Pippo p = new Pippo();
		
		System.out.println(p);
		
		log.log(Level.INFO, "valore di p: " + p);
		log.log(Level.SEVERE, "valore di p: " + p);
		log.log(Level.FINE, "valore di p: " + p);
	}

}
