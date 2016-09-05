package ar.edu.unlam.pb2.clase2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	@Test
	public void testingCuadrado() {
		Cuadrado cuadradoPrueba = new Cuadrado();
		cuadradoPrueba.calcularPerimetro((float) 3);
		cuadradoPrueba.calcularArea((float) 3);
		assertEquals(12, cuadradoPrueba.visualizarPerimetro(), 0);
		assertEquals(9, cuadradoPrueba.visualizarArea(), 0);
	}
	
	@Test
	public void testingCirculo() {
		Circulo circuloPrueba = new Circulo();
		circuloPrueba.setRadio(4d);
		Double area,perimetro;
		area = circuloPrueba.calcularArea();
		perimetro = circuloPrueba.calcularPerimetro();
		assertEquals(25.13, perimetro,0.01);
		assertEquals(157.91, area, 0.01);
	}

	@Test
	public void testingTriangulo() {
		Triangulo trianguloPrueba = new Triangulo();
		trianguloPrueba.calcularPerimetro(4, 4, 4);
		trianguloPrueba.calcularArea(10, 5);
		assertEquals(12, trianguloPrueba.visualizarPerimetro(),0);
		assertEquals(25, trianguloPrueba.visualizarArea(), 0);
	}
}
