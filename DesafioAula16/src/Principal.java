import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int numero1, numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		
		if(numero1 > numero2) {
			JOptionPane.showMessageDialog(null, "O primeiro n�mero � maior que o segundo!");
		}else if(numero1 < numero2){
			JOptionPane.showMessageDialog(null, "O segundo n�mero � maior que o primeiro!");
		}else {
			JOptionPane.showMessageDialog(null, "Os n�meros s�o iguais");
		}
	}

}
