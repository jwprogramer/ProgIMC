
public class CalcIMC {

	public double resultadoIMC(double peso, double altura) {
		return peso / (altura * altura);
	}

	public String calculaIMC(double imc) {
 		
		String resultado = "";
		
		if (imc < 18.5) {
		    resultado = "Seu IMC � " + imc + " e voc� est� abaixo do peso.";
		  } else if (imc >= 18.5 && imc < 25) {
		    resultado = "Seu IMC � " + imc + " e voc� est� com o peso normal.";
		  } else if (imc >= 25 && imc < 30) {
		    resultado = "Seu IMC � " + imc + " e voc� est� acima do peso.";
		  } else {
		    resultado = "Seu IMC � " + imc + " e voc� est� obeso.";
		  }
	
		return resultado;
	}
}

