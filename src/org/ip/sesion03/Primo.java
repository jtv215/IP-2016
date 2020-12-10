package org.ip.sesion03;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
	int dato;
	boolean primo=true;
	
	do {System.out.println("Introduce un número (>1) para saber si primo");
		dato = entrada.nextInt();
		} while (dato <= 1);
					
	int divisor=(int)Math.sqrt(dato);	
	if(dato %2 == 0){
		primo=false;
	}else{
		
	while(primo && divisor >2){
	if (dato % divisor ==0) {
		primo =false;
	}
	divisor--;	
	}
	}
	if (primo){
		System.out.println("El número es Primo");
	}else {
		System.out.println("NO ES PRIMO");		
	}	}
	}
