import javax.swing.JOptionPane;

public class Aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaração de variáveis 		
		String nome;
		double media, frequencia;
		
		
		//Leitura das informações
		nome = JOptionPane.showInputDialog(null, "Solicitar nome do aluno: ");		
		String mediaString = JOptionPane.showInputDialog("Média: ");
		String freqString = JOptionPane.showInputDialog("Frequencia: ");
		
		//Conversão dos valores
		media = Double.parseDouble(mediaString);
		frequencia = Double.parseDouble(freqString);
		
		System.out.println("SITUAÇÃO DO ALUNO");
		System.out.println("Nome: " + nome);
		System.out.println("Sua média é: " + media);
		System.out.println("Sua frequência é: " + frequencia);
		
		
	}

}
