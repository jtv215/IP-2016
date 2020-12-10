package org.ip.sesion09;
import java.util.Arrays;

public class OperacionesMatricesCuadradas {

	public static boolean esSimetrica(int[][] a){
		boolean simetria = true;
		for (int i = 0; i < a.length - 1 && simetria; i++) {
			for (int j = 1; j < a[0].length && simetria; j++){
				if (a[i][j] != a[j][i])
					simetria = false;
			}
		}
		return simetria;
	}
	
	public static int sumaDiagonal(int[][] a){
		int suma = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				if(i == j)
					suma += a[i][j];
			}
		}
		return suma;
	}
	
	public static int[][] suma(int[][] a, int[][] b){
		if(a.length != b.length) throw new RuntimeException("Las dimensiones Las dimensiones no coinciden, "
				+ "no se puede realizar la operaci�n");
		int[][] resultado = new int[a.length][b.length];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				resultado[i][j] = a[i][j] + b[i][j];
			}
		}
		return resultado;
	}
	
	public static int[][] resta(int[][] a, int[][] b){
		if(a.length != b.length) throw new RuntimeException("Las dimensiones Las dimensiones no coinciden, "
				+ "no se puede realizar la operaci�n");
		int[][] resultado = new int[a.length][b.length];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				resultado[i][j] = a[i][j] - b[i][j];
			}
		}
		return resultado;
	}
	
	public static int[][] producto(int[][] a, int[][] b) {
		int[][] c = new int[a.length][b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = 0;
				for (int k = 0; k < b.length; k++){
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
	
	public static int[][] producto(int[][] a, int d) {
		int[][] b = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++) {
				b[i][j] = a[i][j] * d;
			}
		}
		return b;
	}
	
	public static int[][] transpuesta(int[][] a) {
		int[][] b = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[j][i] = a[i][j];
			}
		}
		return b;
	}
	
	public static int[] sumaFilas(int[][] a) {
		int[] b = new int[a.length];
		int suma;
		for(int i = 0; i < a.length; i++) {
			suma = 0;
			for (int j = 0; j < a[i].length; j++) {
				suma += a[i][j];
			}
			b[i] = suma;
		}
		return b;
	}
	
	public static int[] sumaColumnas(int[][] a) {
		int[] b = new int[a[0].length];
		int suma;
		for (int i = 0; i <a.length; i++) {
			suma = 0;
			for (int j = 0; j < a[i].length; j++) {
				suma += a[j][i];
			}
			b[i] = suma;
		}
		return b;		
	}
	
	public static int[] elementoMenor(int[][] a) {
		int menorValor = a[0][0];
		int[] b = {0, 0, menorValor};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < menorValor) {
					menorValor = a[i][j];
					b[0] = i;
					b[1] = j;
					b[2] = menorValor;
				}
			}
		}
		return b;
	}
	
	public static int[] elementoMayor(int[][] a) {
		int mayorValor = a[0][0];
		int[] b = {0, 0, mayorValor};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > mayorValor) {
					mayorValor = a[i][j];
					b[0] = i;
					b[1] = j;
					b[2] = mayorValor;
				}
			}
		}
		return b;
	}
	
	public static boolean equals(int[][] a, int[][] b) {
		boolean iguales = true;
		for (int i = 0; i < a.length && iguales; i++) {
			for (int j = 0; j < a[i].length && iguales; j++) {
				if(a[i][j] != b[i][j])
					iguales = false;
			}
		}
		return iguales;
	}
	
	public static String muestraMatriz(int[][] a){
		String salida = "Matriz:" + "\n";
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				if(j != a[i].length - 1)
					salida += a[i][j] + "\t";
				else
					salida += a[i][j];
			}
			if(i != a.length - 1)
				salida += "\n";
		}
		return salida;
	}
	
	public static String muestraArray(int[] a) {
		String salida = "Array: [";
		for (int i = 0; i < a.length; i++) {
				if(i != a.length - 1)
					salida += a[i] + "\t";
				else
					salida += a[i] + "]";
		}
		return salida;
	}
	}