package org.ip.sesion02;

public class DiaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d=29;
		int m=2;
		int y=2016;
		
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		
		System.out.println("El día de la semana correspondiente al "+d+"/"+m+"/"+y+ " es: \n ");
	
	
		if (d0==0) {
		System.out.println("DOOMINGO");
		}else if (d0==1){ 
			System.out.println("LUNES");
		}else if (d0==2){ 
			System.out.println("MARTES");
		}else if (d0==3){ 
			System.out.println("MIÉRCOLES");
		}else if (d0==4){ 
			System.out.println("JUEVES");
		}else if (d0==5){ 
			System.out.println("VIERNES");
		}else if (d0==6){ 
			System.out.println("SÁBADO");
	}
		
		
	}

}
