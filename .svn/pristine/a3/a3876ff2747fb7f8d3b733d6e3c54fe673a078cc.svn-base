package org.ip.sesion04;

import java.util.Scanner;

public class Sumatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner entrada = new Scanner(System.in);
	System.out.println("Introduzca el número de terminos que desea sumar");
	int x = entrada.nextInt();
			
	if(true){
	System.out.println("\nLa suma usando el método iterativo de los "+x+" primeros números es "+sumaIterativa(x));
	System.out.println("La suma usando el método directo de los "+x+" primeros números es "+sumaDirecta(x));
	System.out.println("La suma usando el método recursivo de los "+x+" primeros números es "+sumaRecursiva(x));
		
	if (  (sumaIterativa(x) == sumaDirecta(x) ) && ( (sumaDirecta(x) == sumaRecursiva(x) ))){
		System.out.println("\nFuncionamiento correcto");
	}else {
		System.out.println("Funcionamiento Incorrecto");
	}	
	}	
		}

		public static int sumaIterativa(int x){
			 int suma = 0;
	         for(int i = 1; i <= x; i++)
	            suma += i;
	         return suma;
		}
		public static int sumaDirecta(int x){
			int suma = x*(x + 1) / 2;
			return suma;
		}
		public static int sumaRecursiva(int x){
			 if(x == 1)
		            return 1;
		         else      
		            return x + sumaRecursiva(x-1);
		}
		
	}
		
		
		
		
		
		
		
