import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 * ESTRUTURA DE REPETI��O: WHILE
		 * Iniciar uma vari�vel soma com valor de 0
		 * Pedir um n�mero ao usu�rio e somar � vari�vel soma
		 * enquanto a soma for menor ou igual a 114, continuar pedindo para o usu�rio digitar outro n�mero
		 */
		
		int soma = 0;
				
		while(soma <= 114) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
			soma += numero;
		}
		JOptionPane.showMessageDialog(null, "Passou! A soma foi de " + soma);
	}

}
