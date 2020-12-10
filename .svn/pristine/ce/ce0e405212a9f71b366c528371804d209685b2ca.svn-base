package org.ip.sesion07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaEnterosConExcepcion {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int number1,number2;
		boolean correcto=true;
		System.out.print("Introduzca dos valores enteros: ");
		do{
			try{
				number1 =entrada.nextInt();
				number2 =entrada.nextInt();
				System.out.println("La suma es "+(number1 + number2));
			
			}
			catch(Exception e){
				entrada.nextLine();
				System.out.print("Incorrecto, introduzca dos valores enteros: ");
			}
		}while(correcto);
		}	
	}