package org.ip.sesion10;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OrdenacionBiDimensionalTestJUnit4 {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOrdenacionBiDimensional() {
		int [][] matriz = {{35, 7, 20, 3, 12, 91, 1}, {26, 17, 28, 43, 5, 83, 4}, 
				{16, 77, 33, 10, 37, 8, 69}, {13, 27, 36, 48, 54, 9, 67}, {25, 6, 11, 70, 81, 95, 50}};
		
		String salidaMatriz = OrdenacionBiDimensional.muestraMatriz(matriz);
		String salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "35	7	20	3	12	91	1" + "\n"
				+ "26	17	28	43	5	83	4" + "\n"
				+ "16	77	33	10	37	8	69" + "\n"
				+ "13	27	36	48	54	9	67" + "\n"
				+ "25	6	11	70	81	95	50";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		int [] array = OrdenacionBiDimensional.transformarMatrizEnArray(matriz);
		String salidaArray = OrdenacionBiDimensional.muestraArray(array);
		String salidaEsperadaArray = "Array: [35	7	20	3	12	91	1	26	17	28	43	5	83	4	16	77	33	10	37	8	69	13	27	36	48	54	9	67	25	6	11	70	81	95	50]";
		assertEquals(salidaArray, salidaEsperadaArray);
		
		OrdenacionBiDimensional.insercion(array);
		salidaArray = OrdenacionBiDimensional.muestraArray(array);
		salidaEsperadaArray = "Array: [1	3	4	5	6	7	8	9	10	11	12	13	16	17	20	25	26	27	28	33	35	36	37	43	48	50	54	67	69	70	77	81	83	91	95]";
		assertEquals(salidaArray, salidaEsperadaArray);
		
		int [][] matrizFilas = OrdenacionBiDimensional.transformarArrayOrdenadoEnMatrizFilas(matriz, array);
		salidaMatriz = OrdenacionBiDimensional.muestraMatriz(matrizFilas);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "1	3	4	5	6	7	8" + "\n"
				+ "9	10	11	12	13	16	17" + "\n"
				+ "20	25	26	27	28	33	35" + "\n"
				+ "36	37	43	48	50	54	67" + "\n"
				+ "69	70	77	81	83	91	95";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		int [][] matrizColumnas = OrdenacionBiDimensional.transformarArrayOrdenadoEnMatrizColumnas(matriz, array);
		salidaMatriz = OrdenacionBiDimensional.muestraMatriz(matrizColumnas);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "1	9	20	36	69" + "\n"
				+ "3	10	25	37	70" + "\n"
				+ "4	11	26	43	77" + "\n"
				+ "5	12	27	48	81" + "\n"
				+ "6	13	28	50	83" + "\n"
				+ "7	16	33	54	91" + "\n"
				+ "8	17	35	67	95";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);
		
		int [][] matrizOrdenadaFilas = OrdenacionBiDimensional.matrizOrdenadaPorFilas(matriz);
		salidaMatriz = OrdenacionBiDimensional.muestraMatriz(matrizOrdenadaFilas);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "1	3	7	12	20	35	91" + "\n"
				+ "4	5	17	26	28	43	83" + "\n"
				+ "8	10	16	33	37	69	77" + "\n"
				+ "9	13	27	36	48	54	67" + "\n"
				+ "6	11	25	50	70	81	95";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

		int [][] matrizOrdenadaColumnas = OrdenacionBiDimensional.matrizOrdenadaPorColumnas(matriz);
		salidaMatriz = OrdenacionBiDimensional.muestraMatriz(matrizOrdenadaColumnas);
		salidaEsperadaMatriz = "Matriz:" + "\n"
				+ "13	6	11	3	5	8	1" + "\n"
				+ "16	7	20	10	12	9	4" + "\n"
				+ "25	17	28	43	37	83	50" + "\n"
				+ "26	27	33	48	54	91	67" + "\n"
				+ "35	77	36	70	81	95	69";
		assertEquals(salidaMatriz, salidaEsperadaMatriz);

	}

}
