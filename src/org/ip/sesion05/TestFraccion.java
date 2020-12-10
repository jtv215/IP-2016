package org.ip.sesion05;

public class TestFraccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Fraccion x = new Fraccion(1, 5);
			Fraccion y = new Fraccion(4, 5);   //creacion de objeto
			Fraccion z = new Fraccion(-11, 22);

			System.out.println("LAS FRACCIONES CREADAS SON");
			System.out.println();
			System.out.println("PRIMERA FRACCI�N => " + x.toString());
			System.out.println("SEGUNDA FRACCI�N => " + y.toString());
			System.out.println("TERCERA FRACCI�N => " + z.toString());
			System.out.println();
			System.out.println("El n�mero de fracciones creadas es "
					+ Fraccion.getNumFracciones());
			if (x.equals(y)){
				System.out.println("La primera fracci�n ES IGUAL a la segunda");
			}
			else{
				System.out.println("La primera fracci�n NO ES IGUAL a la segunda");
			}
			
			System.out.println("El numerador de la tercera fracci�n es => "
					+ z.getNumerador());
			System.out.println("El denominador de la primera fracci�n es => "
					+ x.getDenominador());
			System.out.println("La suma, utilizando el m�todo de clase de "
					+ x.toString() + " + " + y.toString() + " es "
					+ Fraccion.sumar(x, y));//llama al metodo estatico sumar
			System.out.println("La suma, utilizando el m�todo de objeto de "
					+ x.toString() + " + " + y.toString() + " es " + x.sumar(y)
					+ " simplificada " + x.sumar(y).simplificar());//le aplicamos un metodo que es el simplificar
			System.out.println("La resta de " + x.toString() + " - " + y.toString()
					+ " es " + x.restar(y) + " simplificada "
					+ (x.restar(y)).simplificar());
			System.out.println("El producto " + x.toString() + " x " + y.toString()
					+ " es " + x.multiplicar(y));
			System.out.println("La divisi�n de " + x.toString() + " / "
					+ z.toString() + " es " + x.dividir(z));
			System.out.println("La inversa de la primera fracci�n " + x.toString()
					+ " es " + x.inversa());
			System.out.println("La fraccion " + z.toString() + " simplificada es "
					+ z.simplificar());
		//	Fraccion z1 = z.simplificar();
		//	System.out.println("Fracci�n z = "+z.toString());
		//	System.out.println("Fraccion z1 = "+z1.toString());
			System.out.println("El n�mero de fracciones creadas es "
					+ Fraccion.getNumFracciones());
		}
	}