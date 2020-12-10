package org.ip.sesion06;

public class Complejo {
	private double real;
	private double imaginaria;

	public Complejo(double real, double imaginaria) {
		super();
		this.real = real;
		this.imaginaria = imaginaria;
	}

	public Complejo(double real) {
		super();
		this.real = real;
	}

	public double getReal() {
		return real;
	}

	public double getImaginaria() {
		return imaginaria;
	}

	@Override
	public String toString() {
		if (imaginaria == 0.0)
			return real + "";
		if (real == 0.0)
			return imaginaria + "i";
		if (imaginaria < 0.0)
			return real + " " + imaginaria + "i";
		else
			return real + " + " + imaginaria + "i";
	}

	public Complejo sumar(Complejo b) {
		double parteReal = this.real + b.getReal();
		double parteImaginaria = this.imaginaria + b.getImaginaria();
		return new Complejo(parteReal, parteImaginaria);
	}

	public Complejo restar(Complejo b) {
		double parteReal = this.real - b.getReal();
		double parteImaginaria = this.imaginaria - b.getImaginaria();
		return new Complejo(parteReal, parteImaginaria);
	}

	public Complejo multiplicar(Complejo b) {
		if (imaginaria > 0) {
			double parteReal = (this.real * b.getReal()) - (this.imaginaria * b.getImaginaria());
			double parteImaginaria = (this.real * b.getImaginaria()) + (this.imaginaria * b.getReal());
			return new Complejo(parteReal, parteImaginaria);
		} else {
			double parteReal = (this.real * b.getReal()) + (this.imaginaria * b.getImaginaria());
			double parteImaginaria = (this.real * b.getImaginaria()) + (this.imaginaria * b.getReal());
			return new Complejo(parteReal, parteImaginaria);
		}
	}

	public Complejo dividir(Complejo b) {
		// (a + bi) / (c + di) = (ac + bd) / (c² + d²) + (bc – ad)i / (c² + d²)

		double parteReal = (((this.real * b.getReal()) + (this.imaginaria * b.getImaginaria()))
				/ (Math.pow(b.getReal(), 2) + (Math.pow(b.getImaginaria(), 2))));

		double parteImaginaria = (((this.imaginaria * b.getReal()) - (this.real * b.getImaginaria()))
				/ ((Math.pow(b.getReal(), 2) + (Math.pow(b.getImaginaria(), 2)))));

		return new Complejo(parteReal, parteImaginaria);
	}

	public Complejo abs() {

		double valorAbsoluto = Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginaria, 2));
		return new Complejo(valorAbsoluto);
	}

	public Complejo fase() {

		double fase = Math.atan(this.imaginaria / this.real);
		return new Complejo(fase);
	}

}