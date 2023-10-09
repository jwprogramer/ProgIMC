import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testCadastro {
    
	private Pessoa pessoa;
    private CalcIMC calcIMC;
    private ArrayList<Pessoa> pessoas;
    private double resultado;
	
	
	@BeforeEach
    public void init() {
        pessoa = new Pessoa();
        calcIMC = new CalcIMC();
        pessoas = new ArrayList<>();

        pessoa.setNome("John");
        pessoa.setEmail("john@example.com");
        pessoa.setTelefone(123456789);
        pessoa.setIdade(30);
        pessoa.setPeso(70.0);
        pessoa.setAltura(1.85);
        pessoa.setIMC(20.45288531775018);
        pessoas.add(pessoa);

        resultado = calcIMC.resultadoIMC(pessoa.getPeso(), pessoa.getAltura());
    }
      

	@Test
    public void testCadastroPessoa() {
		assertEquals(resultado, pessoa.getIMC());
      
        assertEquals(1, pessoas.size());
        assertEquals("John", pessoas.get(0).getNome());
    }
}
