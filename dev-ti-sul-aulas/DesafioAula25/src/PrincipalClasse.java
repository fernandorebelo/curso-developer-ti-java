import javax.swing.JOptionPane;

public class PrincipalClasse {

	public static void main(String[] args) {
		/*
		 * Pedir ao usu�rio digitar os meses do ano
		 * Caso o m�s seja inv�lido exibir na tela o que ele digitou
		 * retornando como mensagem que � inv�lido
		 * Ap�s isso encerrar o programa
		 * Utilizar apenas DO WHILE
		 */
		
		String mes;
		
		do {
			mes = JOptionPane.showInputDialog("Digite um m�s: ");
		}while(
			mes.equalsIgnoreCase("janeiro") ||
			mes.equalsIgnoreCase("fevereiro") ||
			mes.equalsIgnoreCase("mar�o") ||
			mes.equalsIgnoreCase("abril") ||
			mes.equalsIgnoreCase("maio") ||
			mes.equalsIgnoreCase("junho") ||
			mes.equalsIgnoreCase("julho") ||
			mes.equalsIgnoreCase("agosto") ||
			mes.equalsIgnoreCase("setembro") ||
			mes.equalsIgnoreCase("outubro") ||
			mes.equalsIgnoreCase("novembro") ||
			mes.equalsIgnoreCase("dezembro")				
			);
		
		JOptionPane.showMessageDialog(null, mes);
	}

}
