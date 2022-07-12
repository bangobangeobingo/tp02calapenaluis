package ar.edu.unju.edm.controller;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.ProcesoFecha;

@Controller

public class ProcesoFechaController {
	@Autowired
	
	ProcesoFecha procesoFecha;
	
	@GetMapping("/calcularTiempoTranscurrido")
	
	public ModelAndView getTiempoTranscurrido(@RequestParam(name = "fecha1") String fecha1, @RequestParam(name = "fecha2") String fecha2) {
		procesoFecha.setFecha1(LocalDate.parse(fecha1));
		procesoFecha.setFecha2(LocalDate.parse(fecha2));
		Period tiempoTranscurrido = procesoFecha.contarTiempoTranscurrido();
		ModelAndView modelView = new ModelAndView("calcularTiempoTranscurrido");
		modelView.addObject("resultadoTiempoTranscurridoYears", tiempoTranscurrido.getYears());
		modelView.addObject("resultadoTiempoTranscurridoMonths", tiempoTranscurrido.getMonths());
		modelView.addObject("resultadoTiempoTranscurridoDays", tiempoTranscurrido.getDays());
		return modelView;
	}
	@GetMapping("/formatearFechaPage")
	
	public ModelAndView getFormatearPage(@RequestParam(name = "fecha1")String fecha1, @RequestParam(name = "fecha2") String fecha2) {
		ModelAndView modelView = new ModelAndView("/formatearFechaPage");
		procesoFecha.setFecha1(LocalDate.parse(fecha1));
		procesoFecha.setFecha2(LocalDate.parse(fecha2));
		modelView.addObject("resultadoFechaFormateada1", procesoFecha.formatearFecha(procesoFecha.getFecha1()));
		modelView.addObject("resultadoFechaFormateada2", procesoFecha.formatearFecha(procesoFecha.getFecha2()));
		return modelView;
	}
	@GetMapping("/compararFechasPage")
	
	public ModelAndView getCompararPage(@RequestParam (name = "fecha1") String fecha1, @RequestParam(name = "fecha2") String fecha2) {
		ModelAndView modelView = new ModelAndView("/compararFechasPage");
		procesoFecha.setFecha1(LocalDate.parse(fecha1));
		procesoFecha.setFecha2(LocalDate.parse(fecha2));
		String formateo1 = procesoFecha.formatearFecha(procesoFecha.getFecha1());
		String formateo2 = procesoFecha.formatearFecha(procesoFecha.getFecha2());
		procesoFecha.setFecha1(LocalDate.parse(formateo1,DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		procesoFecha.setFecha2(LocalDate.parse(formateo2,DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		String resultadoComparar = procesoFecha.compararFechas();
		modelView.addObject("resultadoCompararFechas",resultadoComparar);
		return modelView;
	}
	// b)
	@GetMapping("/procesoFechaB1")
	public ModelAndView getProcesoFecha() {
		ModelAndView modelView = new ModelAndView("/procesoFechaB1");
		ProcesoFecha profecha1 = new ProcesoFecha(LocalDate.of(2005, 7, 14), LocalDate.now());
		modelView.addObject("variable1", profecha1.getFecha1());
		modelView.addObject("variable2", profecha1.getFecha2());
		return modelView;
	}
    @GetMapping("/procesoFechaB2")
    public ModelAndView getProcesoFecha2() {
    	ModelAndView modelView = new ModelAndView("/procesoFechaB2");
    	ProcesoFecha profecha2 = new ProcesoFecha(LocalTime.of(5, 30, 2), LocalTime.of(20, 40, 10));
    	modelView.addObject("variable1", profecha2.getTime1().plusHours(5));
    	modelView.addObject("variable2", profecha2.getTime2().minusMinutes(20));
    	return modelView;
    }
    @GetMapping("/procesoFechaB3")
    public ModelAndView getProcesoFecha3() {
    	ModelAndView modelView = new ModelAndView("/procesoFechaB3");
    	ProcesoFecha profecha3 = new ProcesoFecha(LocalDateTime.of(2003,  8, 21, 14, 40, 00), LocalDateTime.of(2022, 7, 14, 17, 21, 28));
    	modelView.addObject("variable1", profecha3.getDateTime1());
    	modelView.addObject("variable2", profecha3.getDateTime2());
    	
    	return modelView;
    }
    @GetMapping("/procesoFechaB4")
    public ModelAndView getProcesoFecha4() {
    	ModelAndView modelView = new ModelAndView("/procesoFechaB4");
    	ProcesoFecha profecha4 = new ProcesoFecha(LocalDate.of(2003, 8, 21), LocalDate.now());
    	Period tiempoTranscurrido = profecha4.contarTiempoTranscurrido();
    	modelView.addObject("variable1", tiempoTranscurrido.getYears());
    	modelView.addObject("variable2", tiempoTranscurrido.getMonths());
    	modelView.addObject("variable3", tiempoTranscurrido.getDays());
    	return modelView;
    }
    @GetMapping("/procesoFechaB5")
    public ModelAndView getProcesoFecha5(@RequestParam(name = "fecha1") String fecha1, @RequestParam(name = "fecha2") String fecha2) throws DateTimeException {
    	ModelAndView modelView = new ModelAndView("/procesoFechaB5");
    	ProcesoFecha profecha5 = new ProcesoFecha();
    	try {
    		profecha5.setFecha1(LocalDate.parse(fecha1, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    		profecha5.setFecha2(LocalDate.parse(fecha2, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    		LocalDate incremento = profecha5.getFecha1().plusDays(365);
    		LocalDate decremento = profecha5.getFecha2().minusMonths(6);
    		modelView.addObject("variable1", incremento);
    		modelView.addObject("variable2", decremento);
    		return modelView;
    	}
    	catch (DateTimeException e) {
    		throw new DateTimeException("Ingrese fecha válida");
    	}
    }
}