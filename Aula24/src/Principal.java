import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 * ESTRUTURA DE REPETI��O: WHILE
		 * perguntar n�meros enquanto o n�mero digitado for menor que 100
		 */
		
		int numero = 0;
		
		while(numero < 100) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		}
		
		JOptionPane.showMessageDialog(null, "Fim!");
	}

}
