package tipoDados;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//INFORMA��ES DO ALUNO
		
		//Declara��o de vari�veis
		final String nome;
		final int idade;
		double mediaFinal;
		boolean aprovado;
		
		//Atribui��o de valores
		nome = "Fernando";
		idade = 28;
		mediaFinal = 8.5;
		aprovado = true;
		
		//Exibi��o
		System.out.println("Informa��es do aluno!");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("M�dia final: " + mediaFinal);
		if (aprovado == true) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado");
		}
		
		
		
		/*JOptionPane.showMessageDialog(null, "Informa��es do aluno");
		JOptionPane.showMessageDialog(null, "Nome: " + nome);
		JOptionPane.showMessageDialog(null, "Idade: " + idade);
		JOptionPane.showMessageDialog(null, "M�dia final: " + mediaFinal);
		JOptionPane.showMessageDialog(null, "Aprovado: " + aprovado);
		*/
	}

}
