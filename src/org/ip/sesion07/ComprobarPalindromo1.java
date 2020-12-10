package org.ip.sesion07;

import java.util.Scanner;

public class ComprobarPalindromo1 {
	
	private static Scanner input;	
	
	public static void main (String [] args){
		
		System.out.print("Introduzca una cadena ");
		input = new Scanner (System.in);
		String s=input.nextLine();
		if(esPalindromo(s)){
			System.out.println(s+" es palindromo");
		}else{
			System.out.println(s+" no es palindromo");
		}
	}
	
	public static boolean esPalindromo(String s){
		
		int inicio = 0;
		int fin = s.length()-1;
		
		while (inicio<fin){
			
			if(s.charAt(inicio)==s.charAt(fin)){
				inicio++;
				fin--;
			}
			else
				return false;
		}
		return true;
		
	}
}
