package org.ip.sesion06;

public class TrianguloHer extends ObjGeometrico{


	private double longitudLado1;
	private double longitudLado2;
	private double longitudLado3;


	
	/** 3 Constructores**/
	public TrianguloHer() {
		super();
		longitudLado1 = 1.0;
		longitudLado2 = 1.0;
		longitudLado3 = 1.0;
		
	}

public TrianguloHer(double longitudLado1, double longitudLado2, double longitudLado3){
	super();
	this.longitudLado1= longitudLado1;
	this.longitudLado2= longitudLado2;
	this.longitudLado3= longitudLado3;
	
}

public TrianguloHer(double longitudLado1, double longitudLado2, double longitudLado3, String color, boolean relleno){
	
	super();
	this.longitudLado1= longitudLado1;
	this.longitudLado2= longitudLado2;
	this.longitudLado3=longitudLado3;

}

/**get y set*/
	public double getLongitudLado1() {
		return longitudLado1;
	}
	public void setLongitudLado1(double longitudLado1) {
		this.longitudLado1 = longitudLado1;
	}


	public double getLongitudLado2() {
		return longitudLado2;
	}
	public void setLongitudLado2(double longitudLado2) {
		this.longitudLado2 = longitudLado2;
	}
	
	public double getLongitudLado3() {
		return longitudLado3;
	}
	public void setLongitudLado3(double longitudLado3) {
		this.longitudLado3 = longitudLado3;
	}

	/**to string*/
	
	@Override
	public String toString() {
		return "[" + longitudLado1 + ", "+ longitudLado2+", "+ longitudLado3+"]";
	}

	/** Calcular el area*/
	public double calcularArea(){
	double s=((longitudLado1+ longitudLado2+longitudLado3)/2);
		
		return 	  Math.sqrt(s*(s-longitudLado1)*(s-longitudLado2)*(s-longitudLado3));
	}
	
	/**Calcular el perímetro**/
	public double calcularPerimetro(){
	return longitudLado1+longitudLado2+longitudLado3;
	}
	
	/**mostar Trinangulo**/
	

	
	
}
