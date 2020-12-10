package org.ip.sesion06;

public class Fraccion implements Comparable<Object> {

	private int numerador;
	private int denominador;

	/** construcor por defecto */
	public Fraccion() {
		numerador = 0;
		denominador = 1;
	}

	/**
	 * crea los objetos y lo inicializa
	 */
	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;

	}

	/**
	 * Equals, compara si los valores son iguales.
	 */
	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Fraccion))
			return false;
		Fraccion otro = (Fraccion) obj;
		if (denominador != otro.denominador)
			return false;
		if (numerador != otro.numerador)
			return false;
		return true;
	}

	/** Devuelve el numerador de la fraccion */
	public int getNumerador() {
		return numerador;
	}

	/** Devuelve el denomindor de la fraccion */
	public int getDenominador() {
		return denominador;
	}

	/** Describe la fraccion */
	@Override
	public String toString() {
		if (denominador == 1) {
			return numerador + "";
		} else {
			return numerador + "/" + denominador;
		}
	}

	/** Suma una fracciones pasada por parametro a la creada por defecto */
	public Fraccion sumar(Fraccion b) {
		int num = numerador * b.getDenominador() + denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);

	}

	/** Suma dos fracciones pasadas por parametros */
	public static Fraccion sumar(Fraccion a, Fraccion b) {
		int num = a.getNumerador() * b.getDenominador() + b.getNumerador() * a.getDenominador();
		int den = a.getDenominador() * b.getDenominador();
		return new Fraccion(num, den);
	}

	/** Resta una fracciones pasada por parametro a la creada por defecto */
	public Fraccion restar(Fraccion b) {
		int num = numerador * b.getDenominador() - denominador * b.getNumerador();
		int den = denominador * b.getDenominador();
		return new Fraccion(num, den);
	}

	/** Multiplica una fraccion pasada por parametro y la creada por defecto */
	public Fraccion multiplicar(Fraccion b) {
		return new Fraccion(numerador * b.getNumerador(), denominador * b.getDenominador());
	}

	/** Divide una fraccion pasada por parametro y la creada por defecto */
	public Fraccion dividir(Fraccion b) {
		return new Fraccion(numerador * b.getDenominador(), denominador * b.getNumerador());
	}

	/** Maximo comun divisor mediante euclides */
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

	/** Simplifica fracciones */
	public Fraccion simplificar() {
		int dividir = mcd(numerador, denominador);
		numerador /= dividir;
		denominador /= dividir;
		return this;
	}

	/** Compara la fraccion pasada por parametro con la creada por defecto */
	public int compareTo(Object o) {

		Fraccion b = (Fraccion) o;
		int t = this.getNumerador() * b.getDenominador();
		int f = b.getNumerador() * this.getDenominador();
		int result = 0;
		if (t > f) {
			result = 1;
		} else if (f > t) {
			result = -1;
		}
		return result;
	}
}