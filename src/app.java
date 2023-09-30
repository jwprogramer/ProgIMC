import java.util.ArrayList;
import java.util.Scanner;

public class app {
	
	
	public static void main(String[] args) {
		boolean logado = true;
		int inicio = 0;
		Scanner scanner = new Scanner(System.in);
		Login log = new Login();
		listagemPessoas lista = new listagemPessoas();
		Pessoa pessoa = new Pessoa();
		CalcIMC calc = new CalcIMC();
		ArrayList<Pessoa> pessoas = new ArrayList<>();

		
        while (true) {
        	
        	if(inicio == 0) {
        		
        		System.out.println("Informe sua senha: ");
                int senha = scanner.nextInt();
                inicio = 1;
      
            if (log.entrar(senha)) {
            	
            	if(logado){
            	System.out.println("Login realizado com sucesso!");
            	System.out.println("Sistema de Gestão de Pessoas");
            	logado = false;
            	}
            	System.out.println("1 - Cadastrar");
                System.out.println("2 - Listar");
                System.out.println("3 - Sair");
                System.out.println("4 - Fechar Sistema");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Cadastrar pessoa");
                        
                        System.out.println("Informe o nome: ");
                        pessoa.setNome(scanner.next());

                        System.out.println("Informe o e-mail: ");
                        pessoa.setEmail(scanner.next());

                        System.out.println("Informe o telefone: ");
                        pessoa.setTelefone(scanner.nextInt());

                        System.out.println("Informe a idade: ");
                        pessoa.setIdade(scanner.nextInt());

                        System.out.println("Informe o peso: ");
                        pessoa.setPeso(scanner.nextDouble());

                        System.out.println("Informe a altura: ");
                        pessoa.setAltura(scanner.nextDouble());;
                        
                        double calcIMC = calc.resultadoIMC(pessoa.getPeso(), pessoa.getAltura());
                        
                        pessoa.setIMC(calcIMC);
                        System.out.println(calc.calculaIMC(pessoa.getIMC()));
                        pessoa.setAlertaIMC("Sim");
                        
                        pessoas.add(pessoa);
                        break;
                    case 2:
                        System.out.println("Listar pessoas");
                        System.out.println("Pessoas cadastradas:");
                        for (Pessoa p : pessoas) {
                            System.out.println(p);
                        }
                        break;
                    case 3:
                        System.out.println("Logout...");
                        logado = false;
                        senha = 0;
                        inicio = 0;
                        break;
                    case 4:
                        System.out.println("Fechando o Sistema...");
                        return;
               
            } 
            
            }else {
            	System.out.println("Senha incorreta! Tente novamente...");
            	System.out.println("Informe sua senha: ");
                senha = scanner.nextInt();
                inicio = 0;
            }
        	}	
        }
    }

    

}