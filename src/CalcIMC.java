
public class CalcIMC {

	public String calculaIMC(double peso, double altura) {
		 
		double imc = peso / (altura * altura);
		
		String resultado = "";
		
		if (imc < 18.5) {
		    resultado = "Seu IMC é " + imc + " e você está abaixo do peso.";
		  } else if (imc >= 18.5 && imc < 25) {
		    resultado = "Seu IMC é " + imc + " e você está com o peso normal.";
		  } else if (imc >= 25 && imc < 30) {
		    resultado = "Seu IMC é " + imc + " e você está acima do peso.";
		  } else {
		    resultado = "Seu IMC é " + imc + " e você está obeso.";
		  }
	
		return resultado;
	}
	
	
}

