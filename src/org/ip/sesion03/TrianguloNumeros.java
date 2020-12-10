package org.ip.sesion03;

import java.util.Scanner;

public class TrianguloNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner(System.in);

int numero;
int suma;
	do {System.out.println("Introduce un valor no superior a 20");
		numero = entrada.nextInt();
		} while ((numero <= 0) || (numero > 20));
		
	suma=(1+numero)*numero/2;
	System.out.println("TRIANGULO GENERADO\n");
	for (int fila=1;fila<=numero; fila++) {
		for (int i=1;i<=fila; i++){
			System.out.print(suma+"\t");				
				suma--;
			}	
		System.out.println();
		}
		}
	}