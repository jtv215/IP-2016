package org.ip.sesion10;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.ip.sesion06.Fraccion;
import org.junit.Before;
import org.junit.Test;

public class OrdenacionTestJUnit4 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOrdenacion() {
		int[] arrayEnteros = {20, 6, -30, 8, 1, 30, -2};
		int[] otroArrayEnteros = {5, 10, -15, 2, -4, 23, 7, -13, 8, 17, 27, 0};
 		Integer[] arrayIntegers = {24, 13, 7, 0, -5, 5, -1};
		Fraccion[] arrayFracciones = {new Fraccion(-1, 4), new Fraccion(1, 4),
				new Fraccion(2, 3), new Fraccion(1, 5), new Fraccion(3, 7),
				new Fraccion(-7, 21), new Fraccion(1, 7)};

		String[] arrayApellidos = {"Garcia", "Perez", "Amat", "Gimenez", "Abab",
				"Torres", "Sanchez"};

		String salidaArray = Arrays.toString(arrayEnteros);
		String salidaEsperadaArray = "[20, 6, -30, 8, 1, 30, -2]";
		assertEquals(salidaArray, salidaEsperadaArray);
		assertTrue(arrayEnteros.length == 7);

		salidaArray = Arrays.toString(otroArrayEnteros);
		salidaEsperadaArray = "[5, 10, -15, 2, -4, 23, 7, -13, 8, 17, 27, 0]";
		assertEquals(salidaArray, salidaEsperadaArray);
		assertTrue(otroArrayEnteros.length == 12);

		salidaArray = Arrays.toString(arrayIntegers);
		salidaEsperadaArray = "[24, 13, 7, 0, -5, 5, -1]";
		assertEquals(salidaArray, salidaEsperadaArray);
		assertTrue(arrayIntegers.length == 7);

		salidaArray = Arrays.toString(arrayFracciones);
		salidaEsperadaArray = "[-1/4, 1/4, 2/3, 1/5, 3/7, -7/21, 1/7]";
		assertEquals(salidaArray, salidaEsperadaArray);
		assertTrue(arrayFracciones.length == 7);

		salidaArray = Arrays.toString(arrayApellidos);
		salidaEsperadaArray = "[Garcia, Perez, Amat, Gimenez, Abab, Torres, Sanchez]";
		assertEquals(salidaArray, salidaEsperadaArray);
		assertTrue(arrayApellidos.length == 7);

		Ordenacion.burbuja(arrayEnteros);
		salidaArray = Arrays.toString(arrayEnteros);
		salidaEsperadaArray = "[-30, -2, 1, 6, 8, 20, 30]";
		assertEquals(salidaArray, salidaEsperadaArray);

		Ordenacion.burbujaMejorada(otroArrayEnteros);
		salidaArray = Arrays.toString(otroArrayEnteros);
		salidaEsperadaArray = "[-15, -13, -4, 0, 2, 5, 7, 8, 10, 17, 23, 27]";
		assertEquals(salidaArray, salidaEsperadaArray);

		// Reverse 'otroArrayEnteros'
		int n = otroArrayEnteros.length;
		int temp;
		for (int i = 0; i < n / 2; i++) {
			temp = otroArrayEnteros[i];
			otroArrayEnteros[i] = otroArrayEnteros[n - i - 1];
			otroArrayEnteros[n - i - 1] = temp;
		}

		salidaArray = Arrays.toString(otroArrayEnteros);
		salidaEsperadaArray = "[27, 23, 17, 10, 8, 7, 5, 2, 0, -4, -13, -15]";
		assertEquals(salidaArray, salidaEsperadaArray);

		Ordenacion.insercion(otroArrayEnteros);
		salidaArray = Arrays.toString(otroArrayEnteros);
		salidaEsperadaArray = "[-15, -13, -4, 0, 2, 5, 7, 8, 10, 17, 23, 27]";
		assertEquals(salidaArray, salidaEsperadaArray);

		// Some swaps
		temp = otroArrayEnteros[0];
		otroArrayEnteros[0] = otroArrayEnteros[3];
		otroArrayEnteros[3] = temp;
		temp = otroArrayEnteros[5];
		otroArrayEnteros[5] = otroArrayEnteros[10];
		otroArrayEnteros[10] = temp;
		temp = otroArrayEnteros[7];
		otroArrayEnteros[7] = otroArrayEnteros[11];
		otroArrayEnteros[11] = temp;

		salidaArray = Arrays.toString(otroArrayEnteros);
		salidaEsperadaArray = "[0, -13, -4, -15, 2, 23, 7, 27, 10, 17, 5, 8]";
		assertEquals(salidaArray, salidaEsperadaArray);

		Ordenacion.seleccion(otroArrayEnteros);
		salidaArray = Arrays.toString(otroArrayEnteros);
		salidaEsperadaArray = "[-15, -13, -4, 0, 2, 5, 7, 8, 10, 17, 23, 27]";
		assertEquals(salidaArray, salidaEsperadaArray);

		
		Ordenacion.burbujaMejorada(arrayIntegers);
		salidaArray = Arrays.toString(arrayIntegers);
		salidaEsperadaArray = "[-5, -1, 0, 5, 7, 13, 24]";
		assertEquals(salidaArray, salidaEsperadaArray);

		Ordenacion.insercion(arrayFracciones);
		salidaArray = Arrays.toString(arrayFracciones);
		salidaEsperadaArray = "[-7/21, -1/4, 1/7, 1/5, 1/4, 3/7, 2/3]";
		assertEquals(salidaArray, salidaEsperadaArray);

		Ordenacion.seleccion(arrayApellidos);
		salidaArray = Arrays.toString(arrayApellidos);
		salidaEsperadaArray = "[Abab, Amat, Garcia, Gimenez, Perez, Sanchez, Torres]";
		assertEquals(salidaArray, salidaEsperadaArray);
	}

}
