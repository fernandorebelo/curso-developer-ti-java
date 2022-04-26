import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Verificar se uma pessoa pode entrar no evento!
		 * Para poder entrar: ser maior de idade ou estar acompanhado
		 * Perguntar ao usu�rio:
		 * Nome?
		 * Idade?
		 * Se a idade for menor que 18 anos, perguntar:
		 * Est� acompanhado?
		 * Retornar na tela:
		 * "Acesso liberado para o evento!"
		 * "Acesso recusado para o evento!"
		 */
		int idade;
		String nome;
		boolean acompanhado;
		
		nome = JOptionPane.showInputDialog("Qual seu nome?");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));		
		
		if(idade >= 18) {
			String informacoes = "INFORMA��ES DO CLIENTE" + "\n";
			informacoes += "Nome: " + nome + "\n";
			informacoes += "Idade: " + idade + "\n";
			informacoes += "Acesso LIBERADO ao evento!";
			JOptionPane.showMessageDialog(null, informacoes);
		}else if(idade < 18) {
			acompanhado = Boolean.parseBoolean(JOptionPane.showInputDialog("Voc� est� acompanhado? Sim/N�o").toLowerCase().replace("sim", "true"));
			if(idade < 18 && acompanhado) {
				String informacoes = "INFORMA��ES DO CLIENTE" + "\n";
				informacoes += "Nome: " + nome + "\n";
				informacoes += "Idade: " + idade + "\n";
				informacoes += "Acompanhante: " + acompanhado + "\n";
				informacoes += "Acesso LIBERADO ao evento COM acompanhante!";
				JOptionPane.showMessageDialog(null, informacoes);
			}else {
				JOptionPane.showMessageDialog(null, "Acesso negado!");
			}
		}
	}

}
