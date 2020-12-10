package org.ip.sesion06;
import java.util.Locale;
import java.util.Scanner;

public class TestComplejo {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		entrada.useLocale(Locale.ENGLISH);

		System.out.println("PRIMER COMPLEJO");
		System.out.println("Introduce la parte real");
		double a = entrada.nextDouble();
		System.out.println("Introduce la parte imaginaria");
		double b = entrada.nextDouble();
		Complejo c1 = new Complejo(a, b);

		System.out.println("SEGUNDO COMPLEJO");
		System.out.println("Introduce la parte real");
		double c = entrada.nextDouble();
		System.out.println("Introduce la parte imaginaria");
		double d = entrada.nextDouble();
		Complejo c2 = new Complejo(c, d);

		System.out.println("RESULTADOS DE LAS OPERACIONES");
		Complejo complejoSuma = c1.sumar(c2);
		System.out.println("(" + c1.toString() + ") + (" + c2.toString() + ") = " + complejoSuma.toString());

		Complejo complejoResta = c1.restar(c2);
		System.out.println("(" + c1.toString() + ") - (" + c2.toString() + ") = " + complejoResta.toString());

		Complejo complejoMultiplicacion = c1.multiplicar(c2);
		System.out.println("(" + c1.toString() + ") * (" + c2.toString() + ") = " + complejoMultiplicacion.toString());

		Complejo complejoDivision = c1.dividir(c2);
		System.out.println("(" + c1.toString() + ") / (" + c2.toString() + ") = " + complejoDivision.toString()); // MAL

		Complejo complejoValorAbsoluto = c1.abs();
		System.out.println("|" + c1.toString() + "| = " + complejoValorAbsoluto.toString());

		Complejo complejoFase = c1.fase();
		System.out.println("La fase del primer complejo es " + complejoFase.toString() + " radianes");

	}
}