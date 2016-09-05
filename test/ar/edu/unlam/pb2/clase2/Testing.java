package ar.edu.unlam.pb2.clase2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	@Test
	public void testingCuadrado() {
		Cuadrado cuadradoPrueba = new Cuadrado(5d);
		Double area,perimetro;
		area=cuadradoPrueba.calcularArea();
		perimetro=cuadradoPrueba.calcularPerimetro();
		assertEquals(25, area, 0.01);
		assertEquals(20, perimetro, 0.01);
	}
	
	@Test
	public void testingCirculo() {
		Circulo circuloPrueba = new Circulo(4d);
		//circuloPrueba.setRadio(4d);
		Double area,perimetro;
		area = circuloPrueba.calcularArea();
		perimetro = circuloPrueba.calcularPerimetro();
		assertEquals(25.13, perimetro,0.01);
		assertEquals(157.91, area, 0.01);
	}

	@Test
	public void testingTriangulo() {
		Triangulo miTriangulo= new Triangulo(4d,2d,2.0,3d,5d);
		/*miTriangulo.setLado1Triangulo(3.0);
		miTriangulo.setLado2Triangulo(3d);
		miTriangulo.setLado3Triangulo(5d);
		miTriangulo.setBase(4d);
		miTriangulo.setAltura(2d);*/
		Double perimetro, area;
		perimetro= miTriangulo.calcularPerimetro();
		area=miTriangulo.calcularArea();
		assertEquals(10, perimetro, 0.01);
		assertEquals(4, area, 0.01);

	}
}
