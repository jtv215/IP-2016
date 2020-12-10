package org.ip.sesion06;

import java.util.Scanner;

public class TestFraccion {
static Scanner entrada=new Scanner (System.in) ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("¿Cuántas comparaciones de fracciones deseas hacer?");
		int x=entrada.nextInt();
		
		
		for(int i=1; i<=x;i++){
		
		System.out.println("Comparación "+ i);
		System.out.println("Introduce numerador y denominador de la primera fracción");
		int a=entrada.nextInt();
		int b=entrada.nextInt();
		
		Fraccion frac1 = new Fraccion(a, b);
		
		System.out.println("Introduce numerador y denominador de la segunda fracción");
		int c=entrada.nextInt();
		int d=entrada.nextInt();
		
		Fraccion frac2 = new Fraccion(c, d);
	
		
		if(frac1.compareTo(frac2)==0){
			System.out.println(frac1.toString() +" es igual que "+frac2.toString()+"\n");
		}else if((frac1.compareTo(frac2)==-1)){
			System.out.println(frac1.toString() +" es menor que "+frac2.toString()+"\n");
		}else if((frac1.compareTo(frac2)==1)){
			System.out.println(frac1.toString() +" es mayor que "+frac2.toString()+"\n");
		
		}
		
		}
		
		
		
		
	}

}
