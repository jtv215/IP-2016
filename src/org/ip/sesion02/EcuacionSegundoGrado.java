package org.ip.sesion02;

public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ax^2+bx+c=0
		
		double a,b,c;
		
		a=1;
		b=-3;
		c=2;
		
		double resultadoRaiz= Math.sqrt((float) Math.pow(b,2)-(4*a*c));
		double raiz= Math.pow(b,2)-(4*a*c);
		double sumaEnFraccion= (-(b)+(resultadoRaiz))/(2*a);
		double restaEnFraccion=  (-(b)-(resultadoRaiz))/(2*a);
		//System.out.println(+restaEnFraccion);
		//System.out.println(+sumaEnFraccion);
		
		System.out.println("SOLUCIÓN DE UNA ECUACIÓN DE 2º GRADO \n");
		System.out.println("Valores de los coeficientes \n");
		System.out.println("a= " +(int) +a+ ", b = " +(int) +b+", c = " +(int) +c);
			
					
		if (raiz<0 ){ 
			System.out.println("\nNo tiene solución real");
		}else if (a==0 ){
		 System.out.println("\nNo es una ecuación de 2ºgrado");
		}else if (sumaEnFraccion==restaEnFraccion ){
			 System.out.println("\nUna única raiz de valor doble");
			 System.out.println("x = "+sumaEnFraccion);
		}else if (resultadoRaiz>0){
		 System.out.println("\nDos raíces de valores");
		System.out.println("x1= "+sumaEnFraccion);
		System.out.println("x2= "+restaEnFraccion);
			
}
				
	}
}
