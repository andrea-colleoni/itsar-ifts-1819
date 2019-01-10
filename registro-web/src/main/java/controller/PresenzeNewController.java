package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import business.PresenzaManager;
import business.RegistroManager;
import business.StudenteManager;
import modello.Registro;
import modello.Studente;
import viewmodel.PresenzaVM;

@Controller
public class PresenzeNewController {
	
	@RequestMapping(value = "elencoStudenti", method=RequestMethod.GET)
	public @ResponseBody List<Studente> elencoStudenti() {
		return StudenteManager.elencoStudenti();
	}
	
	@RequestMapping(value = "elencoCorsi", method=RequestMethod.GET)
	public @ResponseBody List<Registro> elencoCorsi() {
		return RegistroManager.elencoRegistri();
	}
	
	@RequestMapping(value = "aggiungiPresenza", method=RequestMethod.POST)
	public @ResponseBody boolean aggiungiPresenza(@RequestBody PresenzaVM p) {
		try {
			PresenzaManager.aggiungiPresenza(p.model());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
