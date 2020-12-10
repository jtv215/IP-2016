package org.ip.sesion02;

public class TarifaTaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int recorridos=101;			
		float precioFijo=18.00f;			
		int kmMin=30; 
		int kmMax=100;
		float precio1= 0.85f;
		float precio2= 0.65f;
		float kmExceso1=recorridos-kmMin;
		float kmExceso2=recorridos-100;
						
		System.out.println("CÁLCULO TARIFA TAXI \n");
		System.out.println("Kilometros reccoridos => " +recorridos);
		
		if (recorridos<=kmMin) {
			float pagas= precioFijo;
			System.out.println("El importe total a pagar es " +pagas+ " €");
		
		}else if ((recorridos>kmMin) && (recorridos<kmMax)){
			float pagas= (float)(precioFijo)+(precio1*kmExceso1);
			System.out.println("El importe total a pagar es " +pagas+ " €");
			
		}else if
			(recorridos>= kmMax) {
			float pagas=(float) (precioFijo)+(precio1*70)+(precio2*kmExceso2); //100-30=70km que son los que paga fijo.
			System.out.println("El importe total a pagar es " +pagas+ " €");
		}
	
	}
				
	}

