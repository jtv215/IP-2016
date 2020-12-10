package org.ip.sesion08;

import java.util.Scanner;

public class EntradaSalidaArrays {

	private static Scanner entrada;

	public static int[] leerEnteros1D() {
		entrada = new Scanner(System.in);
		System.out
				.println("Introduce el número de componentes del array de enteros");
		int dimension = entrada.nextInt();
		int[] array = new int[dimension];
		System.out.println("Introduce valores enteros en el array ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduce valor " + (i + 1) + "=> ");
			array[i] = entrada.nextInt();
		}
		return array;
	}

	public static double[] leerReales1D() {
		entrada = new Scanner(System.in);
		System.out
				.println("Introduce el número de componentes del array de reales");
		int dimension = entrada.nextInt();
		double[] array = new double[dimension];
		System.out.println("Introduce valores reales en el array ");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduce valor " + (i + 1) + "=> ");
			array[i] = entrada.nextDouble();
		}
		return array;
	}

	public static int[] inicialiazarEnteros1D() {
		int N = 50;
		entrada = new Scanner(System.in);
		System.out
				.println("Introduce el número de componentes del array de enteros");
		int dimension = entrada.nextInt();
		int[] array = new int[dimension];
		System.out.println("Introduce valores enteros en el array ");
		for (int i = 0; i < array.length; i++) {
			array[i] = ((int) (Math.random() * N)) + 1;
		}
		return array;
	}

	public static double[] inicialiazarReales1D() {

		entrada = new Scanner(System.in);
		System.out
				.println("Introduce el número de componentes del array de enteros");
		int dimension = entrada.nextInt();
		double[] array = new double[dimension];
		int N = 100;
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * N;
		}
		return array;
	}

	public static void mostrar1D(int[] array) {
		System.out.println("Array Enteros: ");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1)
				System.out.print(array[i]);
			else
				System.out.print(array[i] + "\t");
		}
	}

	public static void mostrar1D(double[] array) {
		System.out.print("Array Reales: ");
		for (int i = 0; i < array.length; i++) { //el array.length es la longitud que pasas por consola
			if (i == array.length - 1)// aqui es longitud menos 1, para que no imprima tabulador.
				System.out.print(array[i]);
			else
				System.out.print(array[i] + "\t");
		}
	}
}
