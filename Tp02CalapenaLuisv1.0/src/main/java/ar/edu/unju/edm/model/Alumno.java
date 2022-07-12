package ar.edu.unju.edm.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
@Component
public class Alumno {
	private String nombre;
	private String apellido;
	private String fechanac;
	private int dni;
	private int telefono;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, String apellido, String fechanac, int dni, int telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechanac = fechanac;
		this.dni = dni;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechanac() {
		return fechanac;
	}

	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	

}
