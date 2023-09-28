
public class Login {

	static boolean verifica = false;
	public static boolean entrar(int valor) {
		
		while(verifica = false) {
			if(valor == 123) {
				verifica =  true;
			}
			
			System.out.printf("Tente novamente!");
			
	    }
		return verifica;
	}
	public void sair() {
		verifica = false;
	}
	
	public static void main(String[] args) {
			
			entrar(222);	
	}
}
