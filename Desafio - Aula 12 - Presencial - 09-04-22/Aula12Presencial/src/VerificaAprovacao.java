import javax.swing.JOptionPane;

public class VerificaAprovacao {

	public static void main(String[] args) {
		String nome;
		boolean media_atingida;
		boolean frequenciaAlcancada;
		
		nome = "Fernando";
		media_atingida = true;
		frequenciaAlcancada = false;
		
		String resultado = "Nome: " + nome + "\n";
		resultado += "M�dia atingida: " + media_atingida + "\n";
		resultado += "Frequ�ncia alcan�ada: " + frequenciaAlcancada + "\n";
		resultado += "Aprova��o (E): " + (media_atingida && frequenciaAlcancada) + "\n";
		resultado += "Aprova��o (OU): " + (media_atingida || frequenciaAlcancada)+ "\n";
		
		JOptionPane.showMessageDialog(null, resultado);

		
	}

}
