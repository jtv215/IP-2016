package org.ip.sesion03;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
	int n;
	
	System.out.println("Indica cuántos términos quieres mostrar de la serie de Fibonacci");
		do {
			n=entrada.nextInt();
			} while (n <= 0);
		int f0=0;
		int f1=1;


		if(n==1){
			System.out.println(f0);
		}else if (n==2){
			System.out.print(f0 +"       " +f1);
			
		}else{
			System.out.print(f0+"  ");
			for (int i=2; i<=n;i++){
			System.out.print(f1+ "    ");
			f1=f1+f0;
			f0=f1-f0;
			}	
		}
	}

}