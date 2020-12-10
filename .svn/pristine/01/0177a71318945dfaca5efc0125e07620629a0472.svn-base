package org.ip.sesion06;

public class TestObjetosGeometricos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjGeometrico x = new ObjGeometrico();
		ObjGeometrico y = new ObjGeometrico();

		ObjGeometrico string = new ObjGeometrico();
		ObjGeometrico fechaCreacion = new ObjGeometrico();
		ObjGeometrico color = new ObjGeometrico();
		ObjGeometrico isrelleno = new ObjGeometrico();

	
		CirculoHer radio1 = new CirculoHer(1.0);
		
		
		System.out.print("Un CirculoHer = ");
		System.out.println("x=" + string.toString()+", "+ radio1.toString());
		System.out.println("El color es "+color.getColor());
		System.out.println("El radio es "+radio1.getRadio());
		System.out.println("La fecha de creacion es " +fechaCreacion.getFechaCreacion());
		System.out.println("El area es " + radio1.calcularArea());
		System.out.println("El diametro es " + radio1.calcularDiametro());
		System.out.println("El perimetro es " + radio1.calcularPerimetro());
		
		System.out.println("* Datos del circulo son: ");
		System.out.println("El circulo ha sido creado: "
				+ fechaCreacion.getFechaCreacion() + ",");
		
		System.out.print("es de color " + color.getColor() + ",");
		if (isrelleno.isRelleno() == false) {
			System.out.println(" sin relleno");
		} else {
			System.out.println(" con relleno");
		}
		
		System.out.println("ubicado en (" + x.getX() + ", " + y.getY() + ")"
				+ " y el radio es "+ radio1.getRadio());

		
		
		
		System.out.println("* Datos del circulo modificado son:");
		System.out.println("El circulo ha sido creado: "
				+ fechaCreacion.getFechaCreacion() + ",");
		radio1.setRadio(5.0);
		System.out.print("es de color " + color.getColor() + ",");
		//isrelleno.setRelleno();
		if (isrelleno.isRelleno() == false) {
			System.out.println(" sin relleno,");
		} else {
			System.out.println(" con relleno,");
		}
		
		x.setX(1.0);
		y.setY(2.0);
		System.out.println("ubicado en (" + x.getX() + ", " + y.getY() + ")"
				+ " y el radio es " + radio1.getRadio());
		
		System.out.println("-------------------------------------------------------------------------------");
		
		RectanguloHer recta1 = new RectanguloHer(2.0, 4.0);

		x.setX(0.0);
		y.setY(0.0);
		
		System.out.print("Un RectanguloHer = ");
		System.out.println("x=" + string.toString()+", "+ recta1.toString());
		System.out.println("El area es " + recta1.calcularArea());
		System.out.println("El perimetro es " + recta1.calcularPerimetro());
		
		System.out.println("* Datos del rectangulo son: ");
		System.out.println("El rectangulo ha sido creado: "
				+ fechaCreacion.getFechaCreacion() + ",");
		System.out.print("es de color " + color.getColor() + ",");
		if (isrelleno.isRelleno() == false) {
			System.out.println(" sin relleno");
		} else {
			System.out.println(" con relleno");
		}		
		System.out.println("ubicado en (" + x.getX() + ", " + y.getY() + ")"
				+ "el ancho es"+ recta1.getAncho()+" y el alto es "+recta1.getAlto());

		System.out.println("* Datos del rectangulo modificado son:");
		System.out.println("El rectangulo ha sido creado: "
				+ fechaCreacion.getFechaCreacion() + ",");
		color.setColor("verde");
		System.out.print("es de color " + color.getColor() + ",");
		//isrelleno.setRelleno();
		if (isrelleno.isRelleno() == true) {
			System.out.println(" sin relleno,");
		} else {
			System.out.println(" con relleno,");
		}
		
		x.setX(3.0);
		y.setY(4.0);
		recta1.setAncho(3.0);
		recta1.setAlto(8.0);
		System.out.println("ubicado en (" + x.getX() + ", " + y.getY() + ")"
				+ "el ancho es "+ recta1.getAncho()+" y el alto es "+recta1.getAlto());
		
		
		System.out.println("-------------------------------------------------------------------------------");
		x.setX(0.0);
		y.setY(0.0);
		TrianguloHer tri1 = new TrianguloHer(4.0, 4.0, 6.0);
		System.out.print("Un Triangulo= ");
		System.out.println("x=" + string.toString()+"longitud de lados=" + tri1.toString());


		System.out.println("El area es " + tri1.calcularArea());
		System.out.println("El perimetro es " + tri1.calcularPerimetro());

		System.out.println("* Datos del triangulo son: ");
		System.out.println("El triangulo ha sido creado: "
				+ fechaCreacion.getFechaCreacion() + ",");
		System.out.print("es de color " + color.getColor() + ",");
		if (isrelleno.isRelleno() == false) {
			System.out.print(" sin relleno");
		} else {
			System.out.print(" con relleno");
		}
		
		System.out.println("ubicado en (" + x.getX() + ", " + y.getY() + ")"
				+ " y con longitud de lados " + tri1.toString());

		System.out.println("* Datos del triangulo modificado son:");
		System.out.println("El triangulo ha sido creado: "
				+ fechaCreacion.getFechaCreacion() + ",");
		color.setColor("azul");
		System.out.print("es de color " + color.getColor() + ",");
		isrelleno.setRelleno(true);
		if (isrelleno.isRelleno() == false) {
			System.out.print(" sin relleno,");
		} else {
			System.out.print(" con relleno,");
		}
		
		tri1.setLongitudLado3(2.0);

		System.out.println("ubicado en (" + x.getX() + ", " + y.getY() + ")"
				+ " y con longitud de lados " + tri1.toString());
		System.out.println("El area es " + tri1.calcularArea());
		System.out.println("El perimetro es " + tri1.calcularPerimetro());
}

}
