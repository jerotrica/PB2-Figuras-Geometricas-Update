package ar.edu.unlam.pb2.clase2;

public class Triangulo {
	/*private Integer baseTriangulo, alturaTriangulo, lado1Triangulo, lado2Triangulo, lado3Triangulo;*/
	private Integer perimetroTriangulo, areaTriangulo;
// VOY A SIMULAR QUE ES EQUILATERO, POR QUE NO ME DEJA CARGAR MAS DE UN LADO EN 

	
	public void calcularPerimetro (Integer lado1Triangulo, Integer lado2Triangulo, Integer lado3Triangulo){
		perimetroTriangulo =lado1Triangulo+ lado2Triangulo+ lado3Triangulo;
	}
	
	public void calcularArea (Integer baseTriangulo, Integer alturaTriangulo ){
		areaTriangulo =(baseTriangulo * alturaTriangulo)/2;
	}
	
	public float visualizarPerimetro(){
		return this.perimetroTriangulo;
	}
	
	public float visualizarArea(){
		return this.areaTriangulo;
	}
}