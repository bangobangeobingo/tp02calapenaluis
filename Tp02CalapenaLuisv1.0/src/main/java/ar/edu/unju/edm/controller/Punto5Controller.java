package ar.edu.unju.edm.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Punto5;

@Controller

public class Punto5Controller {
	@Autowired
	Punto5 punto5;
	@GetMapping("/InversaCadena")
	public ModelAndView getInversa (@RequestParam (name= "inverso") String inverso) {
		punto5.setCadena(inverso);
		String resultadoRestante1=punto5.Cadena();
		ModelAndView modelView = new ModelAndView("punto5tp03");
		modelView.addObject("resultado5",resultadoRestante1);
		
		return modelView;
	}
}
