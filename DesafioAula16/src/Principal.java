import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String verificacao = JOptionPane.showInputDialog(null, ", voc� est� acompanhado(a) por um respons�vel? s/n");
		if(verificacao == "s") {
			boolean verificacaoAcompanhado = true;
		}else if(verificacao){
			verificacaoAcompanhado = false;
		}else {
			System.out.println("deu ruim");
		}
		
		
	}

}
