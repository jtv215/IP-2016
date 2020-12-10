package org.ip.sesion03;

import java.util.Scanner;

public class ConjeturaUlam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner entrada = new Scanner(System.in);
	int x;
	do {System.out.println("Introduce un valor entero positivo para comenzar la sucesión de Ulam");
		x = entrada.nextInt();
	} while (x <= 0);
		System.out.println("Sucesion de Ulam generada a partir de " + x +"\n");
	
		if (x == 1) {
			System.out.println(+x);
		}
	while (x>1) {
		if (x%2 == 0) {
		x=x/2;
		} else {
		x=(x*3)+ 1;
		}
		System.out.print(x + "\t");
		}
	}
	}


