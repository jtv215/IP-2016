package org.ip.sesion03;

import java.util.Scanner;

public class BucleCentinela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada=new Scanner(System.in);
int valores=0;
int numeroPositivos=0;
int numeroNegativos=0;
int sumaPositivos=0;
int sumaNegativos=0;		
int contador=0;
double numeroTotal=0;
	System.out.println("Introduce valores enteros, el programa termina si la entrada es 0");
	
	do {   valores = entrada.nextInt();
	 if (valores>0){
	numeroPositivos++;
	sumaPositivos=sumaPositivos+valores;
	contador++;
			
	}else if (valores<0)  {
	numeroNegativos++;
	sumaNegativos=sumaNegativos+valores;
	contador++;
	}
	   
	numeroTotal=sumaPositivos+sumaNegativos;
	}while (valores !=0);

System.out.println("El número de positivos es " +numeroPositivos);
System.out.println("El número de negativos es " +numeroNegativos);
System.out.println("El número total de valores leidos es "+contador);
System.out.println("La suma de positivo es  "+sumaPositivos);
System.out.println("La suma de negativos es  "+sumaNegativos);
System.out.println("La media de los valores es  "+numeroTotal/contador);

}
	}