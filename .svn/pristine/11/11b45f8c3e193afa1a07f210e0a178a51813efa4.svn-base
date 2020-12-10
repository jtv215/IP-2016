package org.ip.sesion09;

import java.util.Scanner;

public class EntradaSalidaArrays {

	private static Scanner entrada;

	public static int[][] leerEnteros2D() { // Lectura matriz no cuadrada
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el número de filas");
		int dimension1 = entrada.nextInt();
		System.out.println("Introduce el número de columnas");
		int dimension2 = entrada.nextInt();
		int[][] a = new int[dimension1][dimension2];
		System.out.println("Introduce valores enteros en la matriz ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("Introduce valor a[" + i + "," + j + "] => ");
				a[i][j] = entrada.nextInt();
			}
		}
		return a;
	}

	public static int[][] inicializarEnteros2D() {// valores enteros
		int[][] matriz = new int[3][3];
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				matriz[fila][columna] = (int) (Math.random());
			}
		}
		return matriz;
	}

	public static void mostrar2D(int[][] a) {
		System.out.println("Los valores guardados en la matriz son ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void mostrar2D(double[][] a) {
		System.out.println("Los valores guardados en la matriz son ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

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
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1)
				System.out.print(array[i]);
			else
				System.out.print(array[i] + "\t");
		}
	}
}