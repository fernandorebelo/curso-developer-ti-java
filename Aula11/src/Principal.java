import javax.swing.JOptionPane;


public class Principal {
	public static void main(String[] args) {
		String nome;
		int atingiuMedia;
		int alcancouFrequencia;
		int situacao;
		
		nome = JOptionPane.showInputDialog("Digite seu nome:");
		atingiuMedia = Integer.parseInt(JOptionPane.showInputDialog("Voc� atingiu a m�dia? Sim=1 | N�o=0"));
		alcancouFrequencia = Integer.parseInt(JOptionPane.showInputDialog("Voc� alcan�ou sua frequ�ncia? Sim=1 | N�o=0"));
		situacao = atingiuMedia * alcancouFrequencia;
		
		System.out.println("Nome: " + nome);
		System.out.println("Atingiu a m�dia? " + atingiuMedia);
		System.out.println("Alcan�ou frequ�ncia? " + alcancouFrequencia);
		System.out.println("Resultado: Passou = 1 | Reprovou = 0");
		System.out.println("Situa��o: " + situacao);
	}

}
