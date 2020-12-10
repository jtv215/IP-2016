package org.ip.sesion07;

import java.lang.IllegalArgumentException;

public class CirculoConExcepcion {

	private double xCentro;
	private double yCentro;
	private double radio;
	private static int numCirculos;
	
	//CONSTRUCTORES
	public CirculoConExcepcion(){
		super();
		this.xCentro=0.0;
		this.yCentro=0.0;
		this.radio=0.0;
		this.numCirculos=0;
		numCirculos++;
	}
	
	public CirculoConExcepcion(double xCentro, double yCentro, double radio){
		super();
		this.xCentro=xCentro;
		this.yCentro=yCentro;
		this.radio=radio;
		numCirculos++;
	}
	//METODOS
	public double getxCentro(){
		return xCentro;
	}
	public void setxCentro(double xCentro){
		this.xCentro=xCentro;
	}
	public double getyCentro(){
		return yCentro;
	}
	public void setyCentro(double yCentro){
		this.yCentro=yCentro;
	}
	public double getRadio(){
		return radio;
	}
	
	public void setRadio(double radio)throws IllegalArgumentException{//"declaro" la excepción Illegal...
		if(radio<0){//si es negativo
			throw new IllegalArgumentException("El radio no puede ser negativo");//lanzo la excepcion con un mensaje
		}
	}	
			
			
//	
//	}
	public static int getNumCirculos(){
		return numCirculos;
	}
	public double calcularArea(){
		return ( Math.PI*(Math.pow(radio,2)));
	}
	public double calcularLongitud(){
		return Math.PI*radio;
	}
	public double calcularDiametro(){
		return 2*radio;
	}
	public void desplazar(double dx, double dy){
		xCentro+=dx;
		yCentro+=dy;
	}
	public void cambiarTamanio(double factor)throws IllegalArgumentException{
		
		if (factor<0){ //si el factor es negativo
			throw new IllegalArgumentException("El factor no puede ser negativo");
		}
		}
	
}
