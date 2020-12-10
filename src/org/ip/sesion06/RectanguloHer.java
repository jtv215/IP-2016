package org.ip.sesion06;

public class RectanguloHer extends ObjGeometrico {

	
	private double ancho;
	private double alto;
	
	public RectanguloHer() {
		super();
		ancho = 0.0;
		alto = 0.0;
	}
	
	public RectanguloHer(double ancho, double alto){
		super();
		this.ancho= ancho;
		this.alto= alto;		
	}	
	
	public RectanguloHer(double ancho, double alto, String color, boolean relleno){
		
		super();
		this.ancho= ancho;
		this.alto= alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}
	
	
/**to string*/
	
	@Override
	public String toString() {
		return "ancho="+ancho+ " alto="+alto;
	}

	/** Calcular el area*/
	public double calcularArea(){
	
		return 	  ancho*alto;
	}
	
	/**Calcular el perímetro**/
	public double calcularPerimetro(){
	return  (2*ancho)+(2*alto);
	}

	/**Mostar Rectangulo**/
	
	public void mostrarRectangulo(){
		
		
		
		
		
	}
	
}
