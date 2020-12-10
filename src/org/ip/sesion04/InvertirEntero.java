package org.ip.sesion04;

import java.util.Scanner;

public class InvertirEntero {

	public static Scanner entrada = new Scanner(System.in);

	public static void mostrarInverso(int valor) {
		if (valor < 10) {
			System.out.println(valor);
		} else {
			System.out.print(valor % 10);
			mostrarInverso(valor / 10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un valor entero para invertirlo");
		int valor = entrada.nextInt();
		System.out.print("El entero " + valor + " invertido es ");
		mostrarInverso(valor);
	}
}