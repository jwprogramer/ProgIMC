public class Pessoa {

	
	private String Nome;
	private String Email;
	private int Telefone;
	private int Idade;
	private double Peso;
	private double Altura;
	private double IMC;
	private String AlertaIMC;
	
		
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	
	public double getIMC() {
		return IMC;
	}

	public void setIMC(double imc) {
		IMC = imc;
	}

	public String getAlertaIMC() {
		return AlertaIMC;
	}
	public void setAlertaIMC(String alertaIMC) {
		AlertaIMC = alertaIMC;
	}
	
	@Override
    public String toString() {
        return "Nome: " + getNome() + "\nE-mail: " + getEmail() + "\nTelefone: " + getTelefone() + "\nIdade: " + getIdade() 
        		+ "\nPeso: " + getPeso() + "\nAltura: " + getAltura() + "\nIMC: " + getIMC() + "\nAlerta: " + getAlertaIMC()
        		+ "\n--------------------------------------------";
	}
}
