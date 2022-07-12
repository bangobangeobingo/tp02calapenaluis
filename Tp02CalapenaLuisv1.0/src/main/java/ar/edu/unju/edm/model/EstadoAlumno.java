package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class EstadoAlumno {
	
	private String nombre;
	private String apellido;
	private long libreta;
	private double[] notas = new double[5];
	public EstadoAlumno() {
		// TODO Auto-generated constructor stub
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
	public long getLibreta() {
		return libreta;
	}
	public void setLibreta(long libreta) {
		this.libreta = libreta;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public double calcularPromedio() {
		double totalnotas=0;
		double promedio=0;
		double [] notas = {7.6, 8.5, 9.0, 5.3, 3.8};
		for(double i:notas) {
			totalnotas=totalnotas+i;
		}
		promedio = totalnotas/5;
		return promedio;
	}
	public double conseguirNotaMaxima() {
		double notamaxima=0.0;
		double[] notas = {7.6, 8.5, 9.0, 5.3, 3.8};
		for(double i:notas) {
			if(i>notamaxima) {
				notamaxima=i;				
			}
		}
		return notamaxima;
	}
	public EstadoAlumno(String nombre, String apellido, long libreta, double[] notas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.libreta = libreta;
		this.notas = notas;
	}
	
}
