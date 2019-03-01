package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Exceptions.IncorrectInformation;

class CuadradoMagicoTest {
	
	private CuadradoMagico cuadro;
	
	
	private void setupEscenario1() throws IncorrectInformation {
		
		try {
			cuadro = new CuadradoMagico("3", "a", "NE");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void setupEscenario2() {
		
		try {
			cuadro = new CuadradoMagico("3", "b", "NO");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void setupEscenario3() {
		try {
			cuadro = new CuadradoMagico("3", "c", "SE");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void setupEscenario4() {
		try {
			cuadro = new CuadradoMagico("3", "d", "SO");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void setupEscenario5() {
		try {
			cuadro = new CuadradoMagico("0", "a", "SE");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void setupEscenario6() {
		try {
			cuadro = new CuadradoMagico("3", "9", "SE");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void setupEscenario7() {
		try {
			cuadro = new CuadradoMagico("5", "a", "*");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void setupEscenario8() {
		try {
			cuadro = new CuadradoMagico(" ", " ", " ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void setupEscenario9() {
		try {
			cuadro = new CuadradoMagico("", "", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Test
	void testCuadrado() throws IncorrectInformation {
		setupEscenario1();
		int[][] expected1 = { {8, 1, 6}, {3, 5, 7}, {4, 9, 2} };
		int[][] actual1 = cuadro.cuadrado();
		assertArrayEquals(expected1, actual1);
		
		setupEscenario2();
		int[][] expected2 = { {9, 4, 2}, {1, 8, 6}, {5, 3, 7} };
		int[][] actual2 = cuadro.cuadrado();
		assertArrayEquals(expected2, actual2);
		
		setupEscenario3();
		int[][] expected3 = { {7, 3, 5}, {6, 8, 1}, {2, 4, 9} };
		int[][] actual3 = cuadro.cuadrado();
		assertArrayEquals(expected3, actual3);
		
		setupEscenario4();
		int[][] expected4 = { {2, 9, 4}, {7, 5, 3}, {6, 1, 8} };
		int[][] actual4 = cuadro.cuadrado();
		assertArrayEquals(expected4, actual4);
		
	}
	
	@Test
	void testGetRight() {
		
		setupEscenario2();
		assertTrue(cuadro.getRight());
		
		setupEscenario5();
		assertFalse(cuadro.getRight());
		
		setupEscenario6();
		assertFalse(cuadro.getRight());
		
		setupEscenario7();
		assertFalse(cuadro.getRight());
		
		setupEscenario8();
		assertFalse(cuadro.getRight());
		
		setupEscenario9();
		assertFalse(cuadro.getRight());
	}

}
