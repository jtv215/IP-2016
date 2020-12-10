package org.ip.sesion04;

public class SumarDigitosEntero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Sumar digitos de enteros grandes  \n");
	
	int numero2=1234567890;
	int numero3=987654321;
	int numero=1;
	
	
	System.out.println("SumarDigitos("+numero2+ ") =  "+sumarDigitos(numero2)); 
	System.out.println("SumarDigitos("+numero3+ ") =  "+sumarDigitos(numero3)); ;

	while (numero<=1048577){				
	System.out.println("SumarDigitos("+numero+ ") =  "+ sumarDigitos(numero));;	
	numero=numero*4;
	}	
	}

public static long sumarDigitos( long numero){
	
	   int resultado = 0;
	        
		while (numero > 0){
	            resultado += numero % 10;
	            numero = numero / 10;
	        }
		return resultado;
		 } 
}