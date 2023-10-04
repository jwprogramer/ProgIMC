import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testCalcIMC {

	
	CalcIMC calcIMC = new CalcIMC();
	
	@Test
    public void testResultadoIMC() {
        double peso = 98.0;
        double altura = 1.90;
        double resultado = calcIMC.resultadoIMC(peso, altura);

        assertEquals(27.146814404432135, resultado);
    }
}
