import java.sql.Date;
import java.util.Scanner;
import java.util.logging.Logger;

public class CreaAutomobile {
	
	static Logger log = Logger.getLogger("auto");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Automobile a = new Automobile();

		System.out.print("marca >");
		String s = sc.nextLine();
		log.info("string inserita: " + s);
		a.setMarca(s);

		System.out.print("modello >");
		s = sc.nextLine();
		log.info("string inserita: " + s);
		a.setModello(s);
		
		boolean compilato = false;
		while (!compilato) {
			try {
				System.out.print("cilindrata >");
				s = sc.nextLine();
				log.info("string inserita: " + s);
				a.setCilindrata(Float.valueOf(s));
				compilato = true;
			} catch (NumberFormatException e) {
				System.out.println("valore non corretto;");
			}
		}
		
		compilato = false;
		while (!compilato) {
			try {
				System.out.print("numero di posti >");
				s = sc.nextLine();
				log.info("string inserita: " + s);
				a.setNumeroPosti(Integer.valueOf(s));
				compilato = true;
			} catch (NumberFormatException e) {
				System.out.println("valore non corretto;");
			}
		}
		
		compilato = false;
		while (!compilato) {
			try {
				System.out.print("data di immatricolazione (aaaa-mm-dd) >");
				s = sc.nextLine();
				log.info("string inserita: " + s);
				a.setDataImmatricolazione(Date.valueOf(s));
				compilato = true;
			} catch (IllegalArgumentException e) {
				System.out.println("valore non corretto;");
			}
		}
		
		System.out.println(a);
		
	}

}
