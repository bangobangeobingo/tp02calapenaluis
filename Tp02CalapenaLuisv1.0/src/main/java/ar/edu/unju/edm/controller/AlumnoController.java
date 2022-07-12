package ar.edu.unju.edm.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Alumno;
import ar.edu.unju.edm.model.Persona;
import ar.edu.unju.edm.until.ListadoAlumno;

@Controller
public class AlumnoController {
	@Autowired
	Persona persona;
	@GetMapping ("/mostrarAlumnos")
	public String getListado(Model model) {
    //creacion del alumno
		
		persona.setFecha(LocalDate.parse("2003-07-09"));
		String resultado1 = persona.getEdad();
		Alumno alumno1 =new Alumno("luis","calapena",resultado1,44949761,388477659);
		
	 persona.setFecha(LocalDate.parse("2001-12-13"));
		String resultado2 = persona.getEdad();
	 Alumno alumno2 =new Alumno("luis2","calapena2",resultado2,44912589,388477659);
	 
	 persona.setFecha(LocalDate.parse("1993-04-23"));
		String resultado3 = persona.getEdad();
	 Alumno alumno3 =new Alumno("luis3","calapena3",resultado3,45085907,388477659);
	 
	 persona.setFecha(LocalDate.parse("2000-02-05"));
		String resultado4 = persona.getEdad();
	 Alumno alumno4 =new Alumno("luis4","calapena4",resultado4,44949820,388477659);
	 
	 //Agregar alumno al litado 
	 ListadoAlumno nombre = new ListadoAlumno();
	 nombre.getListado().add(alumno1);
	 nombre.getListado().add(alumno2);
	 nombre.getListado().add(alumno3);
	 nombre.getListado().add(alumno4);
	 
	 //Enviar listado a la vista
	 model.addAttribute("listadoAlumno", nombre.getListado());
	 return  "punto7tp02" ;
	}	 
}
