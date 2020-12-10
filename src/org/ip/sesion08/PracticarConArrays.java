package org.ip.sesion08;

public class PracticarConArrays {

	public static String mostrarArray(int[] arrayEnteros) {

		String cadena;
		cadena = "Array de Enteros: ";
		for (int i = 0; i < arrayEnteros.length; i++) {
			cadena = cadena + arrayEnteros[i];
			if (i < arrayEnteros.length - 1)
				cadena = cadena + "\t";
		}
		return cadena;
	}

	public static int indiceMinimoValor(int[] arrayEnteros) {
		int min = arrayEnteros[0];
		int posicion=0;
		for (int i = 1; i < arrayEnteros.length; i++) {
			if (arrayEnteros[i] < min){
				min = arrayEnteros[i];
			
					posicion=i;
				}
		}
		return posicion;
	}

	public static int indiceMaximoValor(int[] arrayEnteros) {
		int max = arrayEnteros[0];
		int posicion=0;
		for (int i = 1; i < arrayEnteros.length; i++) {
			if (arrayEnteros[i] > max){
				max = arrayEnteros[i];
			posicion=i;}
		}
		return posicion;
	}

	public static int[] invertir(int[] arrayEnteros) {
		int[] invertido = new int[arrayEnteros.length];
		for (int i = 0; i < arrayEnteros.length; i++) {
			invertido[i] = arrayEnteros[arrayEnteros.length - 1 - i];
		}
		return invertido;
	}

	public static void desplazar(int[] arrayEnteros) {
		int temp = arrayEnteros[0];
		for (int i = 1; i < arrayEnteros.length; i++) {
			arrayEnteros[i - 1] = arrayEnteros[i];
		}
		arrayEnteros[arrayEnteros.length - 1] = temp;
	}

	public static int[] eliminarDuplicados(int[] arrayEnteros) {
		int fin = arrayEnteros.length;
		for (int i = 0; i < fin; i++) {
			for (int j = i + 1; j < fin; j++) {
				if (arrayEnteros[i] == arrayEnteros[j]) {
					int aLaIzquierda = j;
					for (int k = j + 1; k < fin; k++, aLaIzquierda++) {
						arrayEnteros[aLaIzquierda] = arrayEnteros[k];
					}
					fin--;
					j--;
				}
			}
		}
		int[] sinRep = new int[fin];
		
		for (int i = 0; i < fin; i++) {
			sinRep[i] = arrayEnteros[i];
		}
		return sinRep;
	}
}