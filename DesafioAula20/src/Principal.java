import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Tomar decis�o se � vogal ou consoante (switch)
		 * Usu�rio digita uma letra do alfabeto
		 * De acordo com a letra retornar se ela � vogal ou consoante
		 * Retornar: "Voc� digitou uma vogal(i)"
		 */
		String letra;
		
		letra = JOptionPane.showInputDialog("Digite uma letra do alfabeto:");
		
		switch (letra) {
		case "a","e","i","o","u":
			JOptionPane.showMessageDialog(null, "Voc� digitou uma vogal: " + letra);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Voc� digitou uma consoante: " + letra);
			break;
		}
	}

}
