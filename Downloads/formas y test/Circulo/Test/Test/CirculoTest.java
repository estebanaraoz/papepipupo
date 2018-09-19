package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pbdos.Triangulo.Triangulo;
import ar.edu.unlam.pbdos.Circulo.Circulo;

public class CirculoTest {
	
	@Test
    public void sePuedenCrearTriangulo(){
        
		Circulo unCirculo;
        unCirculo = new Circulo(3.0);
        assertNotNull(unCirculo);
        
        Circulo otroCirculo;
        otroCirculo = new Circulo(4.0);
        assertNotNull(otroCirculo);}
	@Test
	public void elAreaDeUnCirculoDebeSerPiPorRadioAlCuadrado(){
    	Circulo unCirculo = new Circulo(8.0);
        Double esperado = 200.96;
        Double actual = unCirculo.calcularArea();
        assertEquals(esperado, actual);
    }
	@Test
public void elPerimetroDeUnCirculoDebeSerPiPorDosPorElRadio(){
        
		Circulo unCirculo = new Circulo(8.0);
        Double esperado = 50.24;
        Double actual = unCirculo.calcularPerimetro();
        assertEquals(esperado, actual);
        }
	
	
}
