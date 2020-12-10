package org.ip.sesion01;

public class EnfriamientoViento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*7. Dada la temperatura t (en grados Fahrenheit)
 *  y la velocidad del viento v (en millas por hora),
 *   haz un programa (EnfriamientoViento) que permita calcular el enfriamiento del viento,
 *    w (en grados Fahrenheit), usando la fórmula del National Weather Service :
			w = 35.74 + 0.6215t + (0.4275t - 35.75) v 0.16.
			
*/
		
		
		float temperatura= 40.00f;
		float velocidad= 30.00f;
	
		final float parteA=35.74f ;
		final float parteB=0.6215f ;
		final float parteC=0.4275f ;
		final float parteD=35.75f ;
		//w = 35.74 + 0.6215t + (0.4275t - 35.75) v 0.16.
		
		float operacion= (float) (parteA+(parteB*temperatura)+(((parteC*temperatura)-parteD) * Math.pow(velocidad,0.16)));
		
		
		System.out.println("Temperatura = " +temperatura+ " (grados Fahrenheit)");
		System.out.println("Temperatura del viento = " +velocidad+ " (millas por hora)\n");
		System.out.println("Enfriamiento del viento = " +operacion+ " (grados Fahrenheit)");
		
		
		
		
	}

}
