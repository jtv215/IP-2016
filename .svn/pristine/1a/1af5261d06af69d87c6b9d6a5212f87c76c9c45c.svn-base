package org.ip.sesion07;

public class TestCirculoConExcepcion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CirculoConExcepcion circ1=new CirculoConExcepcion(2.0,3.0,6.2); //creo un nuevo objeto
			
	try{
		circ1.setRadio(-6.5); //cambio el area a negativo para que me salga el error y se va al metodo setRadio
		System.out.println("dentro de try "+circ1.getRadio()); //como me salta un error no imprime 
	}
	catch (IllegalArgumentException ex){
		System.out.println(ex.toString());  //aqui me imprime el mensaje que tengo en el método set radio
	}
		
	System.out.println("Number of objects created:"+ CirculoConExcepcion.getNumCirculos());
		
		CirculoConExcepcion circ2=new CirculoConExcepcion(-2.0,3.0,6.0);
		
	try{
		circ2.cambiarTamanio(-1);
	}
	catch (IllegalArgumentException ex){
		System.out.println(ex.toString()); 
	}
	
	System.out.println("Number of objects created:"+ CirculoConExcepcion.getNumCirculos());
	}

}