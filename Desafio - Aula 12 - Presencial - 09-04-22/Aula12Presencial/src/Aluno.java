import javax.swing.JOptionPane;

public class Aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declara��o de vari�veis 		
		String nome;
		double media, frequencia;
		
		
		//Leitura das informa��es
		nome = JOptionPane.showInputDialog(null, "Solicitar nome do aluno: ");		
		String mediaString = JOptionPane.showInputDialog("M�dia: ");
		String freqString = JOptionPane.showInputDialog("Frequencia: ");
		
		//Convers�o dos valores
		media = Double.parseDouble(mediaString);
		frequencia = Double.parseDouble(freqString);
		
		System.out.println("SITUA��O DO ALUNO");
		System.out.println("Nome: " + nome);
		System.out.println("Sua m�dia �: " + media);
		System.out.println("Sua frequ�ncia �: " + frequencia);
		
		
	}

}
