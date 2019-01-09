package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import business.PresenzaManager;
import modello.Presenza;

@Controller
public class PresenzeController {

	@RequestMapping(value="elencoPresenze", method = RequestMethod.GET)
	public @ResponseBody List<Presenza> presenze() {
		return PresenzaManager.elencoPresenze();
	}
}
