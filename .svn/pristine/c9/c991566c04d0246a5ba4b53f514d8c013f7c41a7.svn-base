package org.ip.sesion04;

public class GenerarPrimos {
	//genera los 50 numeros  primos, mostrando 10 por linea.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 2;
		int contador = 0;
		int columnas = 0;
		int finalizando =50;
		System.out.print("Los primeros 50 números primos son \n \n" );
	
		while(contador < finalizando ){
			boolean primo = esPrimo(numero);
			if(primo == true){
				contador++;
				System.out.print("  "+numero +"\t");
				columnas++;
				if(columnas == 10){
					System.out.print("\n");
					columnas = 0;
				}
			}
			numero++;
		}
	}
//método comprueba si un numero es primo para n , return verdadero si n es primo.
	
	public static boolean esPrimo(int n){

		boolean primo=true;				
		for(int divisor=2; divisor<n;divisor++){ 					
			if (n% divisor==0)
				primo=false;
		}
//		if (primo) {
//		
//		}	
//		
		return primo;
		}
}
	