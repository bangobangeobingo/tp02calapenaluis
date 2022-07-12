package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto5 {
       private String Cadena;
       public Punto5() {
		// TODO Auto-generated constructor stub
	}
	public String getCadena() {
		return Cadena;
	}
	public void setCadena(String cadena) {
		Cadena = cadena;
	}
	public Punto5(String cadena) {
		super();
		Cadena = cadena;
	}
    public String Cadena () {
    	String convertido="";
    	String res="";
    	//char [] caracteres= Cadena.toCharArray();
    	for (int i=this.Cadena.length()-1;i>=0;i--) {
    		char actual = this.Cadena.charAt(i);
    		res=res+actual;
    	}
    	return res;
    }
}
