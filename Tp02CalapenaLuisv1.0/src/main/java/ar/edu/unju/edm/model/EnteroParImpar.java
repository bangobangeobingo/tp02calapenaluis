package ar.edu.unju.edm.model;


import org.springframework.stereotype.Component;


@Component
public class EnteroParImpar {
	
	private int entero;
	private String resultado;
	public EnteroParImpar() {
		// TODO Auto-generated constructor stub
	}
	public String getEntero() {
		if(entero%2==0) {
			resultado = "Es par";
		}
		else
		{
			resultado = "Es impar";
		}
		return resultado;
	}
	public void setEntero(int entero) {
		this.entero = entero;
	}
	public EnteroParImpar(int entero) {
		this.entero = entero;
	}	
	
}
