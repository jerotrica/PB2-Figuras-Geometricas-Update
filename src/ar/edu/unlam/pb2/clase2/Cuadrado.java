package ar.edu.unlam.pb2.clase2;

public class Cuadrado {
	@SuppressWarnings("unused")
	private Float ladoCuadrado, perimetroCuadrado,areaCuadrado;	
	

	public void calcularPerimetro (Float ladoCuadrado){
		perimetroCuadrado =ladoCuadrado *4;
	}
	
	public void calcularArea (Float ladoCuadrado){
		areaCuadrado =ladoCuadrado *ladoCuadrado;
	}
	
	public float visualizarPerimetro(){
		return this.perimetroCuadrado;
	}
	
	public float visualizarArea(){
		return this.areaCuadrado;
	}
}