import javax.swing.JOptionPane;

public class EmpregoNovo {

	public static void main(String[] args) {
		
		/*
		 * Para novo emprego precisa:
		 * Ter carteira de motorista A ou B
		 * Ter mais que 18 anos
		 */
		
		int carteiraA, carteiraB, idade, aprovado;
			
		carteiraA = Integer.parseInt(JOptionPane.showInputDialog("Tem carteira A? Sim=1/N�o=0"));
		carteiraB = Integer.parseInt(JOptionPane.showInputDialog("Tem carteira B? Sim=1/N�o=0"));
		idade = Integer.parseInt(JOptionPane.showInputDialog("� maior de idade? Sim=1/N�o=0"));
		
		aprovado = (carteiraA + carteiraB) * idade;
		
		JOptionPane.showMessageDialog(null, "Passou=1/Reprovou=0 \nSitua��o: " + aprovado);
	}

}
