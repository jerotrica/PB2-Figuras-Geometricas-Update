package ar.edu.unlam.pb2.clase2;

//NOMBRE DE LA CLASE
public class Triangulo {

	// DECLARACION DE ATRIBUTOS
	private Double lado1, lado2, lado3, base, altura;

	// CONSTRUCTORES
	public Triangulo(Double lado1, Double lado2, Double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public Triangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;

	}

	public Triangulo(Double base, Double altura, Double lado1, Double lado2,
			Double lado3) {
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;

	}

	// GETTERS Y SETTERS
	public Double getLado1Triangulo() {
		return lado1;
	}

	public void setLado1Triangulo(Double lado1Triangulo) {
		this.lado1 = lado1Triangulo;
	}

	public Double getLado2Triangulo() {
		return lado2;
	}

	public void setLado2Triangulo(Double lado2Triangulo) {
		this.lado2 = lado2Triangulo;
	}

	public Double getLado3Triangulo() {
		return lado3;
	}

	public void setLado3Triangulo(Double lado3Triangulo) {
		this.lado3 = lado3Triangulo;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	// METODOS
	public Double calcularPerimetro() {
		Double perimetro;
		perimetro = lado1 + lado2 + lado3;
		return perimetro;
	}

	public Double calcularArea() {
		Double area;
		area = (base * altura) / 2;
		return area;
	}

}