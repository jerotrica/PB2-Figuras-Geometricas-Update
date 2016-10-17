package ar.edu.unlam.pb2.clase2;

//NOMBRE DE LA CLASE
public class Cuadrado extends Figura {
	//DECLARACION DE ATRIBUTOS
	private Double lado;	
	
	//CONSTRUCTOR
	public Cuadrado(Double lado){
		this.lado=lado;
	}
	
	//GETTERS Y SETTERS
	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}
	
	//METODOS
	public Double calcularPerimetro (){
		Double perimetro;
		perimetro= lado *4;
		return perimetro;
	}
	
	public Double calcularArea (){
		Double area;
		area= lado*lado;
		return area;
	}
}