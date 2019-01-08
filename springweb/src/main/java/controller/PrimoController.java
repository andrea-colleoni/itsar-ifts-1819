package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Persona;

@Controller
public class PrimoController {

	@RequestMapping(value = "saluta", method = RequestMethod.GET)
	public @ResponseBody String metodo() {
		return "ciao";
	}

	@RequestMapping(value = "persona", method = RequestMethod.GET)
	public @ResponseBody Persona pippo() {
		Persona p = new Persona();
		p.setCognome("Rossi");
		p.setNome("Mario");
		p.setIndirizzo("Milano");
		return p;
	}

	@RequestMapping(value = "persone", method = RequestMethod.GET)
	public @ResponseBody List<Persona> pippi() {
		Persona p = new Persona();
		p.setCognome("Rossi");
		p.setNome("Mario");
		p.setIndirizzo("Milano");
		List<Persona> lista = new ArrayList<>();
		lista.add(p);
		return lista;
	}

	@RequestMapping(value = "personeConNome", method = RequestMethod.GET)
	public @ResponseBody List<Persona> persona(String nome) {
		Persona p = new Persona();
		p.setCognome("Rossi");
		p.setNome(nome);
		p.setIndirizzo("Milano");
		List<Persona> lista = new ArrayList<>();
		lista.add(p);
		return lista;
	}

	@RequestMapping(value = "nuovaPersona", 
			method = RequestMethod.POST,
	        consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	// da finire... sostituiremo con request body in JSON
	public void nuovaPersona(@RequestBody Persona p) {
		System.out.println(p);
	}
}
