package test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pbdos.Rectangulo.Rectangulo;

public class RectanguloTest {

	@Test
    public void sePuedenCrearRectangulos(){
        
        Rectangulo unRectangulo = new Rectangulo(1.0,2.0);
        assertNotNull(unRectangulo);
        
        Rectangulo otroRectangulo;
        otroRectangulo = new Rectangulo(4.0,5.0);
        assertNotNull(otroRectangulo);
		
	}    
    
    @Test
    public void elAreaUnRectanguloDeUnRectanguloDebeSerLaBasePorSuAltura(){
    	Rectangulo unRectangulo = new Rectangulo (4.0,5.0);
        Double expected = 20.0;
        Double actual = unRectangulo.calcularArea();
        assertEquals(expected, actual);
    }
	
     @Test
    public void elPerimetroDebeSerLaSumaDeSusLados(){
        Rectangulo unRectangulo = new Rectangulo (4.0,5.0);
        Double expected = 18.0;
        Double actual = unRectangulo.calcularPerimetro();
        assertEquals(expected, actual);
    }

}
