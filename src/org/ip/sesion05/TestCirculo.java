package org.ip.sesion05;

import java.util.Locale;
import java.util.Scanner;

public class TestCirculo {
	 static Scanner entrada=new Scanner (System.in) ;

	public static void main(String[] args) {
		entrada.useLocale(Locale.ENGLISH);
		Circulo circ1 = new Circulo(1.0, 1.0, 1.0);
		Circulo circ2 = new Circulo();
		Circulo circ3 = new Circulo(0.0, 0.0);
		Circulo circ4 = new Circulo(circ3);
		System.out.println("*** Programa que permita trabajar con circulos ***");
		System.out.println();
		System.out.println("Circulo 1 " + circ1.toString());
		System.out.println("Circulo 2 " + circ2.toString());
		System.out.println("Circulo 3 " + circ3.toString());
		System.out.println("Circulo 4 " + circ4.toString());
		if (circ1.equals(circ2)) {
			System.out.println("Circulos 1 y 2 son iguales");
		} else {
			System.out.println("Circulos 1 y 2 son distintos");
		}
		if (circ2.equals(circ3) && circ3.equals(circ4)) {
			System.out.println("Ciculos 2,3 y 4 son iguales");
		} else {
			System.out.println("Los circulos 2,3 y 4 no son iguales");
		}
		System.out.println("El numero de circulos creados son " + (int) Circulo.getNumCirculos());
		circ4.setRadio(1.0);
		circ4.desplazar(1.0, 1.0);
		if (circ1.equals(circ4)) {
			System.out.println("Circulos 1 y 4 son iguales");
		} else {
			System.out.println("Circulos 1 y 4 no son iguales");
		}
		if (circ1.calcularArea() > circ2.calcularArea()) {
			System.out.println("Circulo 1 es mas grande que el circulo 2 en area");
		} else {
			System.out.println("Circulo 1 no es mas grande que el circulo 2 en area");
		}
		circ1.setRadio(2.5);
		System.out.println("Circulo 1 => " + circ1.calcularArea() + " , " + circ1.calcularDiametro() + " , "
				+ circ1.calcularLongitud());
		double x = 1.0;
		double y = 2.0;
		if (circ1.estarDentro(x, y)) {
			System.out.println("El punto (1.0,2.0) esta dentro del circulo 1 " + circ1.toString());
		} else {
			System.out.println("El punto (1.0,2.0) no esta dentro del circulo 1");
		}
		System.out.println("Indica las coordenadas del punto P (x,y) centro de un nuevo circulo");
		double x1=entrada.nextDouble();
		double y1=entrada.nextDouble();
		
//		double x1 = 2.5;
//		double y1 = 3.5;
//		System.out.println(x1);
//		System.out.println(y1);
		System.out.println("Introduce el valor del radio del nuevo circulo");
		double r=entrada.nextDouble();
//		double r = 2.0;
//		System.out.println(r);
		Circulo circ5 = new Circulo(x1, y1, r);
		System.out.println("Circulo 5 " + circ5.toString());
		System.out.println("Circulo 5 => " + circ5.calcularArea() + " , " + circ5.calcularDiametro() + " , "
				+ circ5.calcularLongitud());
		System.out.println("El numero de circulos creados son " + Circulo.getNumCirculos());
		Circulo circ6 = new Circulo(2.0, 2.0, 5.0);
		Circulo circ7 = new Circulo(3.0, 3.0, 1.0);
		System.out.println("Circulo 5 " + circ6.toString());
		System.out.println("Circulo 5 " + circ7.toString());
		if (circ6.contiene(circ7)) {
			System.out.println("El circulo 6 " + circ6.toString() + " contiene al circulo 7 " + circ7.toString());

		} else {
			System.out.println("El circulo 6 " + circ6.toString() + " no contiene al circulo 7 " + circ7.toString());
		}
		if (circ1.solapa(circ7)) {
			System.out.println("El circulo 1 " + circ1.toString() + " solapa con el circulo 7 " + circ7.toString());
		} else {
			System.out.println("El circulo 1 " + circ1.toString() + "solapa con el circulo 7 " + circ7.toString());
		}
		if (circ4.sonDisjuntos(circ7)) {
			System.out.println(
					"El circulo 4 " + circ4.toString() + " y el circulo 7 " + circ7.toString() + " son disjuntos ");
		} else {
			System.out.println("Los circulos no son disjuntos");
		}
		System.out.println("El numero de circulos creados son " +(int) Circulo.getNumCirculos());
	}
}