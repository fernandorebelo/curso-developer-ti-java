package testeVarCons;

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
		double nota1 = 9;
		double nota2 = 7;
		double nota3 = 0;
		double totalNotas = 3;
		
		//Atribui��o de valores
		nome = "Fernando";
		idade = 28;
		mediaFinal = (nota1+nota2+nota3)/totalNotas;		
		
		//Exibi��o0
		System.out.println("Informa��es do aluno!");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("M�dia final: " + mediaFinal);
		if (mediaFinal >= 7) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado!");
		}

	}

}
