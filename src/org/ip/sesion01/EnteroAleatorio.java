package org.ip.sesion01;

//import java.util.Random;

public class EnteroAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Entero aleatorio
			
	
		int aleatorio= (int) (Math.random()*(15 - (-15) +1) + (-15) -1);
	
		System.out.println("Vamos a generar un entero entre -15 y 15 \n");
		System.out.println("El entero generado aleatoriomente es: " +aleatorio);
		
		

	}

}
