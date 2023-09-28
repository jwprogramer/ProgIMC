
public class CalcIMC {

	public static void calcular(double d) {
        if (d < 18.5)
            System.out.println ("Abaixo do peso ideal");
        else
            if ((d > 18.5) &&(d <24.9))
                System.out.println ("Voce esta no peso ideal");
        else
                if ((d > 25.0)&& (d <29.9))
                    System.out.println("Voce está com excesso de peso");
        else
                    if ((d > 30.0) && (d <34.9))
                    System.out.println("Obesidade Classe I");
        else
                        if ((d > 35.0) && (d <39.9))
                            System.out.println ("Obesidade Classe II");
        else 
                            if (d >= 40)
                                System.out.println ("Obesidade Classe III");
                                  
    }
	
}
