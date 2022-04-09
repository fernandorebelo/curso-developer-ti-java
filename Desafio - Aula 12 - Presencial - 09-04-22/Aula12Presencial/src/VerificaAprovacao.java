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
		resultado += "Média atingida: " + media_atingida + "\n";
		resultado += "Frequência alcançada: " + frequenciaAlcancada + "\n";
		resultado += "Aprovação (E): " + (media_atingida && frequenciaAlcancada) + "\n";
		resultado += "Aprovação (OU): " + (media_atingida || frequenciaAlcancada)+ "\n";
		
		JOptionPane.showMessageDialog(null, resultado);

		
	}

}
