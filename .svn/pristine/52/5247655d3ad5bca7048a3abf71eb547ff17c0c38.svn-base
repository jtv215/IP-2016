package org.ip.sesion04;

public class SumaSerie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("i\t  SUMA");
			int i = 10;

			sumaSerie(i);
		}

		static int numero = 1;
		static double suma = 0;
		static double operador = 1;

		public static double sumaSerie(int i) {

			if (i == 0) {
				return 0;
			} else {
				suma = ((operador) / (operador + 1)) + suma;
				System.out.printf(numero + "	%4.6f", suma);
				System.out.println();

				numero++;
				operador++;
				return sumaSerie(i - 1);

			}
		}
	}