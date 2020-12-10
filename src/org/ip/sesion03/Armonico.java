package org.ip.sesion03;

import java.util.Scanner;

public class Armonico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);
	
	int numero;
	do {System.out.println("Introduce un número para mostrar el Número Armónico");
		numero = entrada.nextInt();
		}while (numero <= 0);
		
	double hn=0;
	for (int i = 1; i<=numero;i++){
		hn= hn+(1.0/i);
	}
		
		System.out.println("El Valor del Número Armónico es " + hn);		
	}	
	}