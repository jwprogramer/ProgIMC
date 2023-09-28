
public class app {
	
	
	public static void main(String[] args) {
		
		Login log = new Login();
		boolean test = log.entrar(0);
		while(!test) {
			CalcIMC imc = new CalcIMC();
			System.out.print(imc.calculaIMC(96.5, 1.90));
			test = true;
		}
			
		//CalcIMC imc = new CalcIMC();
		
		//System.out.print(imc.calculaIMC(96.5, 1.90));
}
}