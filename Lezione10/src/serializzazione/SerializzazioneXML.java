package serializzazione;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class SerializzazioneXML {
	public static void main(String[] args) throws IOException, JAXBException {
		Persona p = new Persona();
		
		p.setNome("Mario");
		p.setCognome("Rossi");
		p.setEmail("mario@rossi");
		
		// JAXB è già compreso nella JRE standard, quindi non sono necessari altri jar
		
		// creo un contesto JAXB facente riferimento alla classe Persona
		JAXBContext ctx = JAXBContext.newInstance(Persona.class);
		// creo un marshaller (serializzatore)
		Marshaller m = ctx.createMarshaller();
		// imposto alcune caratteristiche del serializzatore (opzionale)
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    StringWriter sw = new StringWriter();
	    // metto il risultato dell'operaizone di marshall in uno stream di output
	    // che ha come destinazione una stringa
	    m.marshal(p, sw);
	    
	    System.out.println(sw.toString());
	}
}
