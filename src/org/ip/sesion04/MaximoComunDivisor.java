package org.ip.sesion04;

import java.util.Scanner;

public class MaximoComunDivisor {


		static Scanner entrada = new Scanner(System.in);

		public static void main(String[] args) {
		
			System.out.println("Introduce primer valor ");
			int n = entrada.nextInt();

			System.out.println("Introduce segundo valor");
			int m = entrada.nextInt();

			System.out.print("El máximo común divisor entre " + n + " y " + m
					+ " es " + mcdRecursivo(n, m));
		}

		public static int mcdRecursivo(int m, int n) {
			if (m % n == 0) {
				return n;
			} else {
				return mcdRecursivo(n, m % n);
			}
		}
	}