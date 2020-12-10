package org.ip.sesion01;

public class Distancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*4. Haz un programa que muestre la distancia de un punto (x, y) al origen (0, 0), donde x e y son enteros. 
Comprueba con distintas ejecuciones las distancias que se indican a continuación. 
Distancia de (3, 4) a (0, 0) = 5.0, 
distancia de (5, 12) a (0, 0) = 13.0,
 distancia de (2, 1) a (0, 0) = 2.23606797749979.
 Utiliza la clase Math.1 (Distancia)
*/
		//formula d(p1;p2)=raiz de (x1-x2)^2 +(y1-y2)^2
		
		int x1;
		int y1;
		
		x1=2;
		y1=1;
		
		final int x2=0;
		final int y2=0;
	
		int operacion1=(x1-x2);
		int operacionalcuadrado1= (int)Math.pow(operacion1,2);
		int operacion2=(y1-y2);
		
		int operacionalcuadrado2=(int)Math.pow(operacion2,2);
		
		int suma=operacionalcuadrado1+operacionalcuadrado2;
		double resultado = Math.sqrt(suma);
		
			
		System.out.println("La distancia del punto"+ "("+x1+","+y1+")" +" al punto("+x2+"," +y2+ ")es  " + resultado);
		
		
		
	}

}
