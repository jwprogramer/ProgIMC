import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class testCadastro {
    
	Pessoa pessoa = new Pessoa();
	CalcIMC calcIMC = new CalcIMC();
	ArrayList<Pessoa> pessoas = new ArrayList<>();
	
	@Test
    public void testCadastroPessoa() {
        
        pessoa.setNome("John");
        pessoa.setEmail("john@example.com");
        pessoa.setTelefone(123456789);
        pessoa.setIdade(30);
        pessoa.setPeso(70.0);
        pessoa.setAltura(1.85);
        pessoa.setIMC(20.45288531775018);
        pessoas.add(pessoa);

        double resultado = calcIMC.resultadoIMC(pessoa.getPeso(), pessoa.getAltura());
        assertEquals(resultado, pessoa.getIMC());

        assertEquals(1, pessoas.size());
        assertEquals("John", pessoas.get(0).getNome());
    }
}
