package org.ip.sesion07;

import java.util.Scanner;

public class ComprobarPalindromo2 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		// mensaje al usuario
		System.out.print("Introduzca una cadena ");
		String s = input.nextLine();
		String s1 = s.toLowerCase(); //pasa todo a minúscula
		if (esPalindromo(s1))
			System.out.println(s + " Es un palindromo");
		else
			System.out.println(s + " No es un palindromo");
	}

	public static boolean esPalindromo(String s) {
		int inicio = 0;

		int fin = s.length() - 1;

		while (inicio < fin) {
			
			while (s.charAt(inicio) == ' ')
				// saltar esacios en blanco por la izqueirda
				inicio++;
			
			while (s.charAt(fin) == ' ')
				//saltar espacios en blanco por la derecha
				fin--;
			
			if (s.charAt(inicio) != s.charAt(fin))
				return false;
			inicio++;
			fin--;
		}
		return true;
	}

}