package org.ip.sesion03;



import java.util.Scanner;

public class TrianguloAsteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el lado del triangulo");
		lado = entrada.nextInt();
		char espacio = ' ';
		if (3 < lado && lado < 15) {

			for (int i = 0; i <= lado; i++) {
				for (int espacios = lado - i; espacios > 0; espacios--) {
					System.out.print(espacio + " ");
				}
				for (int lineas = 0; lineas < i; lineas++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		} else {
			System.out.println("\nPor favor, Introduce un número tal que  3 < lado < 15");
		}
	}
}