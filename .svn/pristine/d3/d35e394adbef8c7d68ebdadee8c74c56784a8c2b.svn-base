package org.ip.sesion07;

import java.math.BigInteger;
import java.util.Scanner;


public class DivisoresEntereosGrandes {
	
	public static boolean esDivisible (BigInteger enteroGrande, String divisor){
		return enteroGrande.remainder(new BigInteger(divisor)).equals(BigInteger.ZERO);
	}
	
	public static void main(String[]args){
		Scanner entrada=new Scanner(System.in);
		
		BigInteger eg=new BigInteger("9223372036854775807");
	
		System.out.print("Introduce el primer divisor => ");
		int d1=entrada.nextInt();
		
		System.out.print("Introduce el segundo divisor => ");
		int d2=entrada.nextInt();
		
		String valor1 = Integer.toString(d1);
		String valor2 = Integer.toString(d2);
		
		
		System.out.println("\nLos 5 primeros números mayores de "+Long.MAX_VALUE+" divisibles entre "+d1+" y "+d2+" son:\n");
	
		int contador=1; 
	
		while(contador<=5){
			if(esDivisible(eg,valor1)&&esDivisible(eg,valor2)){
				System.out.println(eg);
				contador++;
			}
			eg = eg.add(new BigInteger("1")); 	
		}
	}		
}