package org.ip.sesion06;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ObjGeometrico {

	
	protected double x;
	protected double y;
	private String color;
	private boolean relleno;

	private  java.util.Date fechaCreacion;	

	
	/**3 constructores*/
public ObjGeometrico(){
	super();
	this.x=0.0;
	this.y=0.0;
	this.color= "blanco";
	this.relleno=false;
	fechaCreacion=new java.util.Date();
}
	
	public ObjGeometrico(double x, double y, String color, boolean relleno){
		super();
		this.x= x;
		this.y= y;
		this.color=color;
		this.relleno=relleno;
	}
	
	public ObjGeometrico(double x, double y){
		super();
		this.x= x;
		this.y= y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isRelleno() {
		return relleno;
	}

	public void setRelleno(boolean relleno) {
		this.relleno = relleno;
	}

	public java.util.Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(java.util.Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	/**Desplazar**/		
	public void desplazar(double dx, double dy){
		x+=dx;
		y+=dy;
		
	}
	
	/**toString**/
	@Override
	public String toString() {
		return "ObjGeometrico {(x="+x +", y="+y + ") color=" + color+", relleno="+ relleno+ ", fecha creacion=" +fechaCreacion+")";

	}
	
	
}
