package ar.edu.unlam.pbdos.Rectangulo;

public class Rectangulo {
	private Double altura = 0.0, base = 0.0;

	public Rectangulo(double d, double e) {
		this.base = d;
		this.altura = e;
	}
  
	public Double calcularArea(){
		return (this.base*this.altura);
		
	}
	
	public Double calcularPerimetro(){
		return (this.base + this.altura)*2;
	}

}
