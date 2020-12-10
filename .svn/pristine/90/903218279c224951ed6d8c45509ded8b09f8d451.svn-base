package org.ip.sesion07;

import java.util.Scanner;

public class ComprobarPalindromo3 {

	private static Scanner input;

	public static void main(String[] args) {

		System.out.print("Introduzca una cadena ");
		input = new Scanner(System.in);
		String s = input.nextLine();
		if (esPalindromo(s)) {
			System.out.println("La cadena " + s + " es un palindromo");
		} else {
			System.out.println("La cadena " + s + " no es un palindromo");
		}
	}

	public static boolean esPalindromo(String s) {

		StringBuffer s1 = new StringBuffer(s); // stringbuffer crea una variable
												// que permite modifcar el
												// string
		s1.reverse();


		//String s2 =s1.substring(0);
		// Paso a mayuscula y quito spacios en blancos del inicio y final

		/** para comprobar la palabra **/
		System.out.println("Cadena    " + s);
		System.out.println("Invertida " + s1);
		System.out.println("char " + s1.charAt(0));
		if (s1.equals(s))
			return true;
		else
			return false;

	}
}