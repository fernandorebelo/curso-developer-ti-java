import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 * ESTRUTURA DE REPETI��O: DO WHILE
		 * perguntar ao usu�rio at� que a palavra seja fim ou sair
		 * ao final, exibir a �ltima palavra que o usu�rio digitou
		 */
		
		String palavra;
		
		do {
			palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		}while(!palavra.equalsIgnoreCase("fim") && !palavra.equalsIgnoreCase("sair"));
		
		JOptionPane.showMessageDialog(null, palavra);		
	}

}
