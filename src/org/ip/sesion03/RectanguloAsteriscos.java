package org.ip.sesion03;

public class RectanguloAsteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
 int base=5 ;
 int altura=3;
 System.out.println("Rectangulo de asteriscos de base " +base+" altura "+altura+ "\n");
	    
  if(base>altura){
    for (int i = 1; i <= altura; i++) {	                   
	  for (int j = 1; j <= base; j++) {
		  System.out.print("* ");
		}
	  System.out.println();
    }
    }else{
	    System.out.println("Introduce dos numeros mayores que cero, tal que base > altura");
    }
	 
	}}
