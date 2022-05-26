package classes;

public class Calculadora {

	private double resultado;
	
	public void adicao(double numero1, double numero2) {
		resultado = numero1 + numero2;
	}
	
	public void subtracao(double numero1, double numero2) {
		resultado = numero1 - numero2;
	}
	
	public void multiplicacao(double numero1, double numero2) {
		resultado = numero1 * numero2;
	}
	
	public void divisao (double numero1, double numero2) {
		resultado = numero1 / numero2;
	}
	
	public double exibirResultado() {
		return resultado;
	}
}
