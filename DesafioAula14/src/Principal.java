import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		boolean nota, frequencia, aprovado;
		String nome, sistema;
				
		nota = true;
		frequencia = false;
		
		aprovado = nota & frequencia;
		
		JOptionPane.showMessageDialog(null, "COL�GIO UNISUL" + "\n" + "Pressione Enter para continuar");
		nome = JOptionPane.showInputDialog("Qual nome do aluno? ");
		
		sistema = "DADOS DO ALUNO" + "\n";
		sistema += "Seja bem vindo, " + nome + "!\n";
		sistema += "Nota: " + nota + "\n";
		sistema += "Frequ�ncia: " + frequencia + "\n";
		sistema += "Aprova��o: " + aprovado;
		
		JOptionPane.showMessageDialog(null, "PESQUISANDO NO SISTEMA...");
		JOptionPane.showMessageDialog(null, sistema);
	}

}
