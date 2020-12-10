package org.ip.sesion03;

import java.util.Scanner;

public class Euclides {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner dividiendo = new Scanner(System.in);
	Scanner divisor = new Scanner(System.in);

	double x, y;

		do {
			System.out.println("Introduce el primer valor entero positivo");
			x = dividiendo.nextInt();
			} while (x <= 0);
		
		do {
			System.out.println("Introduce el segundo valor entero positivo");
			y = divisor.nextInt();
			} while (y <= 0);


	double r1 = x % y;
		
		System.out.print("El MCD de " +(int)+x+ " y " +(int)+y+ " es ");
		
		while (r1 != 0) {
			x = y;
			y = r1;
			r1 = x % r1;
		}
		System.out.print( (int) +y);
	}
}	
	
