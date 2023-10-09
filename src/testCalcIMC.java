import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testCalcIMC {

	
	private CalcIMC calcIMC;
	private double resultado, altura, peso;

	@BeforeEach
	public void init() {
	calcIMC = new CalcIMC();
	peso = 98.0;
	altura = 1.90;
    resultado = calcIMC.resultadoIMC(peso, altura);
    
	}
	@Test
    public void testResultadoIMC() {
       assertEquals(27.146814404432135, resultado);
    }
}
