package org.ip.sesion06;

public class Rectangulo  extends Figura {
	protected double ancho;
	protected double alto;
	
	
	public Rectangulo(double x,double y,double ancho,double alto){
		super(x,y);
		this.ancho=ancho;
		this.alto=alto;
	}
	public double getAncho(){return ancho;}
	public double getAlto(){return alto;}
	

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
	public double area(){
		return ancho*alto;
	}
	
}