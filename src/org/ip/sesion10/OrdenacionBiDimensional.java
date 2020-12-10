package org.ip.sesion10;

import java.util.Arrays;

public class OrdenacionBiDimensional {

	public static String muestraMatriz(int[][] matriz) {
		String salida = "Matriz:\n";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j != matriz[i].length - 1)
					salida += matriz[i][j] + "\t";
				else
					salida += matriz[i][j];
			}
			if (i != matriz.length - 1)
				salida += "\n";
		}
		return salida;
	}

	public static int[] transformarMatrizEnArray(int[][] matriz) {

		int i = 0, j = 0;
		int[] resultadoArray = new int[matriz.length * matriz[i].length]; // multiplicas
																			// filas
																			// x
																			// columna=
																			// tamaño
																			// array
		int k = 0;// empieza del el primer valor del array con indice cero
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				resultadoArray[k] = matriz[i][j];
				k++;
			}
		}
		return resultadoArray;
	}

	public static String muestraArray(int[] array) {
		String salida = "Array: [";
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1)
				salida += array[i] + "\t";
			else
				salida += array[i];
		}
		return salida + "]";
	}

	public static void insercion(int[] array) {
		for (int i = 1; i < array.length; i++) { // Bucle de las incorporaciones
													// de cada elemento
			int aux = array[i];
			int j;
			for (j = i - 1; j >= 0 && aux < array[j]; j--) {// Bucle de los
															// desplazamientos
				array[j + 1] = array[j]; // si j es mayor que cero && auxilar es
											// menor que el indice j;
			}
			// Inserto el elemento (aux) en a[j + 1]
			array[j + 1] = aux;
		}
	}

	public static int[][] transformarArrayOrdenadoEnMatrizFilas(int[][] matriz,
			int[] array) {
		int[][] nuevaMatriz = new int[matriz.length][matriz[0].length];// aqui
																		// esta
																		// llamando
																		// a la
																		// matriz
																		// antigua
																		// para
																		// saber
																		// sus
																		// dimensiones
		int k = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				nuevaMatriz[i][j] = array[k];// y aqui copia el array que me
												// pasan y la transformo a la la
												// matriz fila
				k++;
			}
		}
		return nuevaMatriz;
	}

	public static int[][] transformarArrayOrdenadoEnMatrizColumnas(
			int[][] matriz, int[] array) {

		int[][] nuevaMatriz = new int[matriz[0].length][matriz.length];// ojo
																		// con
																		// las
																		// filas
																		// y
																		// columnas.
		int k = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				nuevaMatriz[j][i] = array[k];
				k++;
			}
		}
		return nuevaMatriz;
	}

	public static int[][] matrizOrdenadaPorFilas(int[][] matriz) {
		int[][] nuevaMatriz = new int[matriz.length][matriz[0].length];//creo un objeto matriz
		
		for (int i = 0; i < nuevaMatriz.length; i++) {
			int[] array = new int[matriz[i].length]; //convierto las filas de la matriz en  en arrays, se crean varias arrays 
			for (int j = 0, k = 0; j < nuevaMatriz[i].length; j++, k++) {
				array[k] = matriz[i][j];
			}
			
			insercion(array);//ordenar
			for (int k = 0, j = 0; k < array.length; k++, j++) {
				nuevaMatriz[i][j] = array[k];
			}
		}
		return nuevaMatriz;
	}

	public static int[][] matrizOrdenadaPorColumnas(int[][] matriz) {
		int i = 0, j = 0, k = 0;
		int[][] nuevaMatriz = new int[matriz.length][matriz[0].length];
		for (j = 0; j < nuevaMatriz[0].length; j++) {
			int[] array = new int[matriz.length];
			for (i = 0, k = 0; i < nuevaMatriz.length; i++, k++) {
				array[k] = matriz[i][j];
			}
			insercion(array);
			for (i = 0, k = 0; k < array.length; i++, k++) {
				nuevaMatriz[i][j] = array[k];
			}
		}
		return nuevaMatriz;
	}
}