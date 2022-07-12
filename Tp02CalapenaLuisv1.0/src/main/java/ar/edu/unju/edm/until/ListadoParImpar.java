package ar.edu.unju.edm.until;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.edm.model.EnteroParImpar;


public class ListadoParImpar {
	private List<EnteroParImpar> entero = new ArrayList<>();
	
	public ListadoParImpar() {
		// TODO Auto-generated constructor stub
	}
	public List<EnteroParImpar> getEnteros() {
		return entero;
	}
	public void setEntero(List<EnteroParImpar> entero) {
		this.entero = entero;
	}
	public ListadoParImpar(List<EnteroParImpar> entero) {
		super();
		this.entero = entero;
	}

}
