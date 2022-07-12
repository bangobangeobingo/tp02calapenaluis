package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.EnteroParImpar;
import ar.edu.unju.edm.until.ListadoParImpar;

@Controller
public class EnteroParImparController {
	
	@GetMapping ("/mostrarParImpar")
	public String getArreglo(Model model) {
		
		EnteroParImpar entero1 = new EnteroParImpar (1440);
		EnteroParImpar entero2 = new EnteroParImpar (2004);
		EnteroParImpar entero3 = new EnteroParImpar (47);
		EnteroParImpar entero4 = new EnteroParImpar (477);
		EnteroParImpar entero5 = new EnteroParImpar (217990987);
		EnteroParImpar entero6 = new EnteroParImpar (2020);
		EnteroParImpar entero7 = new EnteroParImpar (2017);
		EnteroParImpar entero8 = new EnteroParImpar (44977776);
		
		ListadoParImpar numeros = new ListadoParImpar();
		
		numeros.getEnteros().add(entero1);
		numeros.getEnteros().add(entero2);
		numeros.getEnteros().add(entero3);
		numeros.getEnteros().add(entero4);
		numeros.getEnteros().add(entero5);
		numeros.getEnteros().add(entero6);
		numeros.getEnteros().add(entero7);
		numeros.getEnteros().add(entero8);
		
		model.addAttribute("contenido", numeros.getEnteros());
		return "punto4tp02";    
	}
}
