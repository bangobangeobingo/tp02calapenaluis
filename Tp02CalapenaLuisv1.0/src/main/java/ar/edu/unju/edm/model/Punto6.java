package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto6 {
      private int num1;
      private int num2;
      private int num3;
      private int num4;
      private int num5;
      private int num6;
      private int num7;
      private int num8;
      private int num9;
      private int num10;
      public Punto6() {
		// TODO Auto-generated constructor stub
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum3() {
		return num3;
	}
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	public int getNum4() {
		return num4;
	}
	public void setNum4(int num4) {
		this.num4 = num4;
	}
	public int getNum5() {
		return num5;
	}
	public void setNum5(int num5) {
		this.num5 = num5;
	}
	public int getNum6() {
		return num6;
	}
	public void setNum6(int num6) {
		this.num6 = num6;
	}
	public int getNum7() {
		return num7;
	}
	public void setNum7(int num7) {
		this.num7 = num7;
	}
	public int getNum8() {
		return num8;
	}
	public void setNum8(int num8) {
		this.num8 = num8;
	}
	public int getNum9() {
		return num9;
	}
	public void setNum9(int num9) {
		this.num9 = num9;
	}
	public int getNum10() {
		return num10;
	}
	public void setNum10(int num10) {
		this.num10 = num10;
	}
      public String InvertirNumero () {
    	  String con= "";
    	  int k=0;
    	  int numero[]= {this.num1,this.num2,this.num3,this.num4,this.num5,this.num6,this.num7,this.num8,this.num9,this.num10};
    	  int numerosInvertidos[] =new int[numero.length];
    	  for(int i= numero.length-1 , j= 0 ;  i>=0;--i , j++) {
    		  numerosInvertidos[j] = numero [i];
    	  }
    	  for (int i = 0 ; i < numerosInvertidos.length  ;i++ ) {
    	  k=numerosInvertidos[i];	  
    	  con = con + Integer.toString(k) + " - ";
    	  }
    	  return con;
      }
}
