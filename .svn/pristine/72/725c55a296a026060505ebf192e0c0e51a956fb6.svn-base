package org.ip.sesion02;

public class EcuacionRecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1 = 0, y1 = 1; // Puntos A

		double x2 = 1, y2 = 4; // Punto B

		double a = ((y2 - y1) / (x2 - x1));
		double b = ((y1)-((a)*(x1)));
		// System.out.println(+a);
		// System.out.println(+b);

		System.out
				.println("CÁLCULO DE LA ECUACIÓN DE LA RECTA QUE PASA POR DOS PUNTOS \n");
		//(1,2) y (1,2)
		if ((x1 == x2) && (y1 == y2)) {
			System.out.println("Los dos puntos " + "(" +(int) x1 + "," +(int) y1 + ")"
					+ " y " + "(" +(int) x2 + "," +(int) y2 + ")" + " COINCIDEN, "
					+ "no se puede obtener la ecuación de la recta");
		//(1,2) y (1,1)
		} else if (x1 == x2){
			System.out
					.println("Ecuación de la recta que pasa por " + "(" +(int) x1
							+ "," +(int) y1 + ")" + " y " + "(" +(int) x2 + "," +(int) y2
							+ ")\n");
			System.out.println("x = " +(int) x1);
		//(1,2) y (2,2)
		} else if (y1 == y2) {
			System.out
					.println("Ecuación de la recta que pasa por " + "(" +(int) x1
							+ "," +(int) y1 + ")" + " y " + "(" +(int) x2 + "," +(int) y2
							+ ")\n");
			System.out.println("y = " +(int) y2);
		//(1,2) y (2,4)
		} else if (b == 0) {
			System.out
					.println("Ecuación de la recta que pasa por " + "(" +(int) x1
							+ "," +(int) y1 + ")" + " y " + "(" +(int) x2 + "," +(int) y2
							+ ")\n");
			System.out.println("y = " + a + "x");
		//(1,1) y (2,4)
		} else if (b < 0) {
			System.out
					.println("Ecuación de la recta que pasa por " + "(" +(int) x1
							+ "," +(int) y1 + ")" + " y " + "(" +(int) x2 + "," +(int) y2
							+ ")\n");
			System.out.println("y = " + a + "x " + b);
		//(0,1) y (1,4)
		} else if  (b > 0){
			System.out
					.println("Ecuación de la recta que pasa por " + "(" +(int) x1
							+ "," +(int) y1 + ")" + " y " + "(" +(int) x2 + "," +(int) y2
							+ ")\n");
			System.out.println("y = " + a + "x + " + b);

		}

	}

}
