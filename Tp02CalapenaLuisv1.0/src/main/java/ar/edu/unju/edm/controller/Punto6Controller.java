package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import ar.edu.unju.edm.model.Punto6;

@Controller

public class Punto6Controller {
	@Autowired
	Punto6 punto6;
	@GetMapping("/InversaEnteros")
	public ModelAndView getRestante3 (@RequestParam (name= "num1") String num1 , @RequestParam (name= "num2") String num2 , @RequestParam (name= "num3") String num3 ,@RequestParam (name= "num4") String num4 , @RequestParam (name= "num5") String num5 , @RequestParam (name= "num6") String num6 , @RequestParam (name= "num7") String num7 , @RequestParam (name= "num8") String num8 ,@RequestParam (name= "num9") String num9 ,@RequestParam (name= "num10") String num10    ) {
		punto6.setNum1(Integer.valueOf(num1));
		punto6.setNum2(Integer.valueOf(num2));
		punto6.setNum3(Integer.valueOf(num3));
		punto6.setNum4(Integer.valueOf(num4));
		punto6.setNum5(Integer.valueOf(num5));
		punto6.setNum6(Integer.valueOf(num6));
		punto6.setNum7(Integer.valueOf(num7));
		punto6.setNum8(Integer.valueOf(num8));
		punto6.setNum9(Integer.valueOf(num9));
		punto6.setNum10(Integer.valueOf(num10));
		String resultadoRestante3=punto6.InvertirNumero();
		ModelAndView modelView = new ModelAndView("punto6tp03");
		modelView.addObject("resultado6",resultadoRestante3);
		return modelView;
	}
}
