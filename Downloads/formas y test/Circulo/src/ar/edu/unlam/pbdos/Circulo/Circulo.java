package ar.edu.unlam.pbdos.Circulo;

public class Circulo {
	double radio =0.0;
	double pi = 3.14;
	public Circulo(double d) {
		// TODO Auto-generated constructor stub
		this.radio = d;
	}
	public Double calcularArea() {
		return (this.pi*(this.radio*this.radio));
	}
	
	
	
	public Double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (this.pi*2*this.radio);
	}
	
	
}
