import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String verificacao = JOptionPane.showInputDialog(null, ", você está acompanhado(a) por um responsável? s/n");
		if(verificacao == "s") {
			boolean verificacaoAcompanhado = true;
		}else if(verificacao){
			verificacaoAcompanhado = false;
		}else {
			System.out.println("deu ruim");
		}
		
		
	}

}
