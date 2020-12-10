package org.ip.sesion05;

public class Fraccion {

	private int numerador;
	private int denominador;
	private static int numFracciones = 0;

	public Fraccion() { // construcor por defecto
		numerador = 0;
		denominador = 1;
		numFracciones++;
	}

	public Fraccion(int numerador, int denominador) { // crea los objetos y lo
														// inicializa
		super();
		this.numerador = numerador;
		this.denominador = denominador;
		numFracciones++;

	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Fraccion)) // object es cualquier objeto ,no hay
										// instancia de de fraccion
			return false;
		Fraccion otro = (Fraccion) obj; // compara
		if (denominador != otro.denominador)
			return false;
		if (numerador != otro.numerador)
			return false;
		return true;
	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public static int getNumFracciones() {
		return numFracciones;
	}

	@Override
	public String toString() { // escriba siguien un determinado formato
		if (denominador == 1) {
			return numerador + "";
		} else {
			return numerador + "/" + denominador;
		}
	}

	/*
	 * otro toString
	 * 
	 * @Override public String toString() { if (den == 1) return num + ""; else
	 * return num + "/" + den; }
	 */
	public Fraccion sumar(Fraccion b) {
		int num = numerador * b.getDenominador() + denominador
				* b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);

	}

	/*
	 * public static Fraccion sumar(Fraccion a, Fraccion b) { Fraccion c = new
	 * Fraccion(); c.num = a.num * b.den + b.num * a.den; c.den = a.den * b.den;
	 * return c; }
	 */
	/**
	 * Método de clase que permite sumar dos fracciones
	 * 
	 * @param a
	 * @param b
	 * @return suma a + b
	 */
	public static Fraccion sumar(Fraccion a, Fraccion b) {
		int num = a.getNumerador() * b.getDenominador() + b.getNumerador()
				* a.getDenominador();
		int den = a.getDenominador() * b.getDenominador();
		return new Fraccion(num, den);
	}

	public Fraccion restar(Fraccion b) {
		int num = numerador * b.getDenominador() - denominador
				* b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);
	}

	public Fraccion multiplicar(Fraccion b) {
		return new Fraccion(numerador * b.getNumerador(), denominador
				* b.getDenominador());
	}

	public Fraccion dividir(Fraccion b) {
		return new Fraccion(numerador * b.getDenominador(), denominador
				* b.getNumerador());
	}

	public Fraccion inversa() {
		return new Fraccion(denominador, numerador);
	}

	private static int mcd(int u, int v) {
		u = Math.abs(u);
		v = Math.abs(v);
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}

	public Fraccion simplificar() {
		int dividir = mcd(numerador, denominador);
		numerador /= dividir;
		denominador /= dividir;
		return this;
	}

	/*
	 * public Fraccion simplificar() { int dividir = mcd(numerador,
	 * denominador); int num = numerador / dividir; int den = denominador /
	 * dividir; return new Fraccion(num, den); }
	 */

}
