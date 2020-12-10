package org.ip.sesion06;

public class TestFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangulo rect = new Rectangulo(2.0, 3.0, 6.0, 4.0);
		
		System.out.println("El rectángulo con:");
		System.out.println("Origen = (" + rect.getX()+ ", "+rect.getY()+ ") " + " Ancho ="
				+ rect.getAncho() + " Alto =" + rect.getAlto());
		System.out.println("tiene un área de " + rect.area());



		System.out.println("\nEl cuadrado con:");
		Cuadrado cuad = new Cuadrado(5.0, 2.0, 3.0);

		System.out.println("Origen = (" + cuad.getX()+ ", "+cuad.getY()+ ") +Lado ="
				+ cuad.getAlto());	
		
		System.out.println("tiene un área de " + cuad.area() );
	}

}
