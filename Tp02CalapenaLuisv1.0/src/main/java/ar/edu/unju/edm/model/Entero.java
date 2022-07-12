package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Entero {
	
	private int entero;
	
	public Entero() {
		// TODO Auto-generated constructor stub
	}
	public Entero(int entero) {
		this.entero = entero;
	}
	public int getEnteros() {
		return entero;
	}
	public void setEnteros(int entero) {
		this.entero = entero;
	}
	
}
