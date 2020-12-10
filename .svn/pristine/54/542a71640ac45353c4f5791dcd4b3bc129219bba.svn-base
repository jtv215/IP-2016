package org.ip.sesion09;

public class MatricesBinarias {

	public static boolean esBinaria(int[][] m) {
		boolean matriz = true;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if ((m[i][j] != 0) && (m[i][j] != 1))
					matriz = false;
			}
		}
		return matriz;
	}

	public static int[][] transformaBinaria(int[][] m) {
		int[][] mbin = new int[m.length][m.length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				if ((m[i][j] != 0) && (m[i][j] != 1)) {
					if (m[i][j] % 2 != 0)
						m[i][j] = 1;
					else
						m[i][j] = 0;
				} else
					mbin[i][j] = m[i][j];
			}
		}
		return mbin;
	}
	// public static int[][] transformaBinaria(int[][] a){
	// int [][] resultado = new int[a.length][a[0].length];
	// for (int i = 0; i < a.length; i++){
	// for (int j = 0; j < a[i].length; j++){
	// resultado[i][j] = a[i][j]%2;
	// }
	//
	// }
	// return resultado;
	// }
	public static int[] mayorNumeroDeUnos(int[][] a) {
		int[] resultado = new int[2];
		int contador = 0;
		int suma = 0;
		resultado[0] = 0;
		resultado[1] = 0;
		for (int i = 0; i < a.length; i++) {// fila
			contador = 0;
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 1 && i == 0) {
					suma++;
				}
				if (a[i][j] == 1) {// aqui cuenta los 1 de las filas
					contador++;
				}
			}
			if (contador > suma) {
				suma = contador;
				resultado[0] = i;
			}
		}
		contador = 0;
		suma = 0;
		for (int i = 0; i < a[0].length; i++) {
			contador = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j][i] == 1 && i == 0) {
					suma++;
				}
				if (a[j][i] == 1) {
					contador++;
				}
				if (contador > suma) {
					suma = contador;
					resultado[1] = i;
				}
			}
		}
		return resultado;
	}

	public static int[] numeroFilasColumnasMismoValor(int[][] a) {
		int[] resultado = new int[4];
		int contador0 = a.length;
		int contador1 = a.length;
		boolean numCeros = true;
		boolean numUnos = false;

		for (int i = 0; i < a.length; i++) {
			numCeros = true;
			numUnos = true;
			if (numCeros || numUnos) {
				for (int j = 0; j < a[i].length; j++) {
					if (!numCeros && !numUnos) {
						break;
					}
					if (a[i][j] != 0 || a[i][j] != 1) {
						if (a[i][j] != 0) {
							numCeros = false;
						} else if (a[i][j] != 1) {
							numUnos = false;
						}
					}
				}
				if (!numCeros) {
					contador0--;
				}
				if (!numUnos) {
					contador1--;
				}
			}
		}
		resultado[0] = contador0;
		resultado[1] = contador1;

		contador0 = a[0].length;
		contador1 = a[0].length;
		for (int i = 0; i < a[0].length; i++) {
			numCeros = true;
			numUnos = true;
			if (numCeros || numUnos) {
				for (int j = 0; j < a.length; j++) {
					if (!numCeros && !numUnos) {
						break;
					}
					if (a[j][i] != 0 || a[j][i] != 1) {
						if (a[j][i] != 0) {
							numCeros = false;
						} else if (a[j][i] != 1) {
							numUnos = false;
						}
					}
				}
				if (!numCeros) {
					contador0--;
				}
				if (!numUnos) {
					contador1--;
				}
			}
		}
		resultado[2] = contador0;
		resultado[3] = contador1;
		return resultado;
	}

	public static boolean numeroImparUnos(int[][] a) {
		boolean esImpar = false;
		int contador = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 1) {
					contador++;
				}
			}
		}

		if (contador % 2 == 1) {
			esImpar = true;
		} else {
			esImpar = false;
		}

		return esImpar;
	}

	public static int[] valoresColumnasDecimal(int[][] a) {
		int[] resultado = new int[a.length];
		String binario = "";

		for (int j = 0; j < a.length; j++) {
			binario = "";
			for (int i = 0; i < a.length; i++) {
				binario += a[i][j];
				resultado[j] = Integer.parseInt(binario, 2);

			}
		}
		return resultado;
	}

	public static int[] valoresFilasDecimal(int[][] a) {
		int[] resultado = new int[a.length];

		String binario = "";

		for (int i = 0; i < a.length; i++) {
			binario = "";
			for (int j = 0; j < a[i].length; j++) {
				binario += a[i][j];
			}
			resultado[i] = Integer.parseInt(binario, 2);
		}
		return resultado;
	}

	public static String muestraMatriz(int[][] m) {
		String salida = "Matriz Binaria:" + "\n";
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (j != m[i].length - 1)
					salida += m[i][j] + "\t";
				else
					salida += m[i][j];
			}
			if (i != m.length - 1)
				salida += "\n";
		}
		return salida;
	}

	public static String muestraArray(int[] a) {
		String mostrar = "Matriz Array:\n";
		for (int i = 4; i < a.length; i++) {
			if (i < a.length - 1) {
				mostrar += a[i] + "\t";
			} else {
				mostrar += a[i];
			}
		}
		return mostrar;
	}

}
