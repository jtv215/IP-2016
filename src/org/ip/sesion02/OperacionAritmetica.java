package org.ip.sesion02;

public class OperacionAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 7;
		int y = 2;
		char operaciones = '/';

		switch (operaciones) {
		case '+':
			System.out.println("Los datos son:");
			System.out.println("x= " + x + ", " + "y = " + y);
			System.out.println("La operacion elegida es: " + operaciones + "\n");
			int sumar = x + y;
			System.out.println("El resultado de la operacion es:" + x
					+ operaciones + y + " = " + sumar);
			break;

		case '-':
			System.out.println("Los datos son:");
			System.out.println("x = " + x + "," + "y = " + y);
			System.out.println("La operacion elegida es: " + operaciones + "\n");
			int restar = x - y;
			System.out.println("El resultado de la operacion es:" + x
					+ operaciones + y + " = " + restar);
			break;
		case '*':
			System.out.println("Los datos son:");
			System.out.println("x = " + x + ", " + "y = " + y);
			System.out.println("La operacion elegida es: " + operaciones + "\n");
			int multiplicar = x * y;
			System.out.println("El resultado de la operacion es: " + x
					+ operaciones + y + " = " + multiplicar);
			break;
		case '/':
			System.out.println("Los datos son:");
			System.out.println("x = " + x + ", " + "y = " + y);
			System.out.println("La operacion elegida es: " + operaciones + "\n");
			float dividir =(float) x / y ;
			
			
			if (x>=0 && y>=x) {System.out.println("No se puede dividir");}
			else{
				System.out.println("El resultado de la operacion es: " + x
						+ operaciones + y + " = " + (float)dividir);
			}
			break;

				
		}
	}
}
