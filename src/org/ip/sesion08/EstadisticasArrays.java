package org.ip.sesion08;

public class EstadisticasArrays {

	public static double max (double []a) {
		double max = a[0];
		for (int i=1; i<a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	public static double max (double []a, int inferior, int superior) {
		double max = a[inferior];
		for (int i=inferior+1; i<=superior; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	public static int max (int []a) {
		int max = a[0];
		for (int i=1; i<a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	public static int max (int []a, int inferior, int superior) {
		int max = a[inferior];
		for (int i=inferior+1; i<=superior; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	public static double min (double []a) {
		double min = a[0];
		for (int i=1; i<a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}
		return min;
	}
	
	public static double min (double []a, int inferior, int superior) {
		double min = a[inferior];
		for (int i=inferior+1; i<=superior; i++) {
			if (a[i] < min)
				min = a[i];
		}
		return min;
	}
	
	public static int min (int []a) {
		int min = a[0];
		for (int i=1; i<a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}
		return min;
	}
	
	public static int min (int []a, int inferior, int superior) {
		int min = a[inferior];
		for (int i=inferior+1; i<=superior; i++) {
			if (a[i] < min)
				min = a[i];
		}
		return min;
	}
	
	public static double media (double []a) {
		double suma = 0;
		for (int i=0; i<a.length; i++) {
			suma = suma + a[i];
		}
		return suma / a.length;
	}
	
	public static double media (double []a, int inferior, int superior) {
		double suma = 0;
		int cont = 0;
		for (int i=inferior; i<=superior; i++) {
			suma = suma + a[i];
			cont++;
		}
		return suma / cont;
	}
	
	public static double media (int []a) {
		double suma = 0;
		for (int i=0; i<a.length; i++) {
			suma = suma + a[i];
		}
		return suma / a.length;
	}
	
	public static double media (int []a, int inferior, int superior) {
		double suma = 0;
		int cont = 0;
		for (int i=inferior; i<=superior; i++) {
			suma = suma + a[i];
			cont++;
		}
		return suma / cont;
	}
	
	public static double var (double []a) {
		double media = media (a);
		double suma = 0;
		for (int i=0; i<a.length; i++) {
			double diferencia = a[i] - media;
			double potencia = Math.pow(diferencia, 2);
			suma = suma + potencia;
		}
		return suma / (a.length - 1);
	}
	
	public static double var (double []a, int inferior, int superior) {
		double media = media (a, inferior, superior);
		double suma = 0;
		int cont = 0;
		for (int i=inferior; i<=superior; i++) {
			double diferencia = a[i] - media;
			double potencia = Math.pow(diferencia, 2);
			suma = suma + potencia;
			cont++;
		}
		return suma / (cont - 1);
	}
	
	public static double var (int []a) {
		double media = media (a);
		double suma = 0;
		for (int i=0; i<a.length; i++) {
			double diferencia = a[i] - media;
			double potencia = Math.pow(diferencia, 2);
			suma = suma + potencia;
		}
		return suma / (a.length - 1);
	}
	
	public static double var (int []a, int inferior, int superior) {
		double media = media (a, inferior, superior);
		double suma = 0;
		int cont = 0;
		for (int i=inferior; i<=superior; i++) {
			double diferencia = a[i] - media;
			double potencia = Math.pow(diferencia, 2);
			suma = suma + potencia;
			cont++;
		}
		return suma / (cont - 1);
	}
	
	public static double stdDev (double []a) {
		double var = var (a);
		return Math.sqrt(var);
	}
	
	public static double stdDev (double []a, int inferior, int superior) {
		double var = var (a, inferior, superior);
		return Math.sqrt(var);
	}
	
	public static double stdDev (int []a) {
		double var = var (a);
		return Math.sqrt(var);
	}
	
	public static double stdDev (int []a, int inferior, int superior) {
		double var = var (a, inferior, superior);
		return Math.sqrt(var);
	}
	
	public static String mostrarArray (int []a) {
		String cadena;
		cadena = "Array de Enteros: " ;
		for (int i=0; i<a.length; i++) {
			cadena = cadena + a[i];
			if (i < a.length - 1)
				cadena = cadena + "\t";
		}
		return cadena;
	}
	
	public static String mostrarArray (double []a) {
		String cadena;
		cadena = "Array de Reales: " ;
		for (int i=0; i<a.length; i++) {
			cadena = cadena + a[i];
			if (i < a.length - 1)
				cadena = cadena + "\t";
		}
		return cadena;
	}
}