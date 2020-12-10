package org.ip.sesion04;

import java.util.Scanner;

public class ValidarFecha {

	public static boolean esBisiesto(int anio) {
		return (anio % 100 != 0 && anio % 4 == 0 || anio % 400 == 0);

	}

	public static boolean esFechaCorrecta(int dia, int mes, int anio) {
		boolean fechaCorrecta = false;
		if (anio > 0) {
			switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (dia >= 1 && dia <= 31)
					fechaCorrecta = true;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia >= 1 && dia <= 30)
					fechaCorrecta = true;
				break;
			case 2:
				if (dia >= 1 && dia <= 28)
					fechaCorrecta = true;
				else if (esBisiesto(anio) && dia == 29)
					fechaCorrecta = true;
				break;
			}
		}
		return fechaCorrecta;
	}

	public static void main(String[] args) {

		while (true) {
			Scanner entrada = new Scanner(System.in);
		
			System.out.println("Introduce un día");
			int dia = entrada.nextInt();
			System.out.println("Introduce un mes");
			int mes = entrada.nextInt();
			System.out.println("Introduce un año");
			int anio = entrada.nextInt();

			if (esFechaCorrecta(dia, mes, anio)) {
				System.out.println("FECHA CORRECTA");
				break;
			} else {
				System.out
						.println("FECHA INCORRECTA, INTRODUCE NUEVOS VALORES");
			}
		}
	}
}
