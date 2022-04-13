import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int numero1, numero2;
		
		JOptionPane.showMessageDialog(null, "JOGO DA ADIVINHAÇÃO");
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		if(numero1 > numero2) {
			JOptionPane.showMessageDialog(null, "Primeiro número é maior que o segundo!");
		}else if(numero1 < numero2){
			JOptionPane.showMessageDialog(null, "O segundo número é o maior!");
		}else {
			JOptionPane.showMessageDialog(null, "Os números são iguais");
		}
		
		
	}

}
