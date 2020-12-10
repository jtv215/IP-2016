package org.ip.sesion05;

public class Circulo {

	// variables
	private double xCentro;
	private double yCentro;
	private double radio;
	private static int numCirculos = 0;

	// constructor por defecto
	public Circulo() {
		xCentro = 0;
		yCentro = 0;
		radio = 0;
		numCirculos++;
	}

	// constructor general -crea los objetos y lo inicializa
	public Circulo(double xCentro, double yCentro, double radio) {
		super();
		this.xCentro = xCentro;
		this.yCentro = yCentro;
		this.radio = radio;
		numCirculos++;
	}

	/** constructor Centro **/
	public Circulo(double xCentro, double yCentro) {
		this.xCentro = xCentro;
		this.yCentro = yCentro;
		numCirculos++;
	}

	/** constructor radio **/
	public Circulo(double radio) {
		this.radio = radio;
		numCirculos++;
	}

	/** contructor copia **/
	public Circulo(Circulo copia) {

		this.xCentro = copia.xCentro;
		this.yCentro = copia.yCentro;
		this.radio = copia.radio;
		numCirculos++;

	}

	/** metodo get y set **/
	public double getxCentro() {
		return xCentro;
	}

	public void setxCentro(double xCentro) {
		this.xCentro = xCentro;
	}

	public double getyCentro() {
		return yCentro;
	}

	public void setyCentro(double yCentro) {
		this.yCentro = yCentro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public static double getNumCirculos() {
		return numCirculos;
	}

	public void setNumCirculos(double numCirculos) {
		this.numCirculos = (int) numCirculos;
	}

	// metodo tostring
	@Override
	public String toString() {
		return "Circulo={ (" + "xCentro="  + xCentro + "," +" yCentro=" + yCentro
				+ ")," + " radio=" + radio + "}";

	}

	/** Metodo equals que verifica si dos circulos son iguales */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		if (Double.doubleToLongBits(radio) != Double
				.doubleToLongBits(other.radio))
			return false;
		if (Double.doubleToLongBits(xCentro) != Double
				.doubleToLongBits(other.xCentro))
			return false;
		if (Double.doubleToLongBits(yCentro) != Double
				.doubleToLongBits(other.yCentro))
			return false;
		return true;
	}

	public double compareTo (Circulo circulo){
		Circulo otro=(Circulo)circulo;
		if(calcularArea()==otro.calcularArea()){
			return 0;
		}else if (calcularArea()< otro.calcularArea()){
			return -1;
		}else{
			return 1;
		
		}
			
	}

	
	public double calcularArea(){
		return Math.PI *radio*radio;
	}
	
	public double calcularLongitud(){
		return  2 *Math.PI *radio;
		
	}
	public double calcularDiametro(){
		return 2 *radio;
		
	}
	
	
	public void desplazar(double dx, double dy){
		xCentro+=dx;
		yCentro+=dy;
		
	}
	
	public void cambiarTamanio(double valor){
		radio+=valor;
		
	}
	public boolean estarDentro(double x, double y){
		double xPunto=(x-xCentro) *(x-xCentro);
		double yPunto=(y-yCentro) *(y-yCentro);
		if(xPunto +yPunto<=radio*radio)
			return true;
		else
			return false;
		
	}
	
	
	public boolean contiene(Circulo circ) {
		double xValor = (xCentro - circ.getxCentro()) * (xCentro - circ.getxCentro());
		double yValor = (yCentro - circ.getyCentro()) * (yCentro - circ.getyCentro());
		double distanciaCentros = Math.sqrt(yValor + xValor);
		if (radio > circ.getRadio()) {
			if (distanciaCentros + circ.getRadio() <= radio) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public boolean solapa(Circulo circ) {
		double xValor = (xCentro - circ.getxCentro()) * (xCentro - circ.getxCentro());
		double yValor = (yCentro - circ.getyCentro()) * (yCentro - circ.getyCentro());
		double distanciaCentros = Math.sqrt(yValor + xValor);
		if (distanciaCentros < radio + circ.getRadio() && radio - circ.getRadio() < distanciaCentros) {
			return true;
		} else {
			return false;
		}

	}

	public boolean sonDisjuntos(Circulo circ) {
		double xValor = (xCentro - circ.getxCentro()) * (xCentro - circ.getxCentro());
		double yValor = (yCentro - circ.getyCentro()) * (yCentro - circ.getyCentro());
		double distanciaCentros = Math.sqrt(yValor + xValor);
		if (distanciaCentros > radio + circ.getRadio()) {
			return true;
		} else {
			return false;
		}

	}
	
}