package serializzazione;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ProgrammaSerializzazione {

	public static void main(String[] args) throws IOException {
		// creo un oggetto di classe persona
		Persona p = new Persona();
		
		p.setNome("Mario");
		p.setCognome("Rossi");
		p.setEmail("mario@rossi");
		
		// uso l'ObjectMapper che viene dalla libreria Jackson DataMapper
		// Per farla funzionare è necessario caricare 3 jar:
		// * jackson-core
		// * jackson-databind
		// * jasckson-annotations
		// si possono trovare qui: https://mvnrepository.com/artifact/com.fasterxml.jackson.core
		// vanno aggiunti al Buld Path del progetto Eclipse
		ObjectMapper om = new ObjectMapper();
		
		// object mapper traduce da java a JSON con writeValueAsString
		String json = om.writeValueAsString(p);
		System.out.println(json);
		
		String personaJson = "{\"nome\":\"Andrea\",\"cognome\":\"Colleoni\",\"email\":\"andrea@colleoni.info\"}";
		// object mapper traduce da JSON a java con readValue
		Persona p2 = om.readValue(personaJson, Persona.class);
		System.out.println(p2.getNome());
		
	}
}
