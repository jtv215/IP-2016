package org.ip.sesion04;

import java.util.Scanner;

public class ConjeturaUlam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
	System.out.println("Introduzca un número para generar la conjetura de Ulam");
	int num = entrada.nextInt();
			

	System.out.println("Sucesión de Ulam generada");
	generarUlam(num);
		
		}
		
	public static void generarUlam(int num){
	while (num>1) {
		if ( num%2==0){
		num/=2;
		}else{
	num=num*3+1;}
		System.out.print(num+"\t");
			}
		}
	}