import javax.swing.JOptionPane;
import java.util.Scanner;

public class MediaAprovadoReprovado {
	public static void main(String[] args) {
		String media, frequencia, nome;
		int mediaInt, frequenciaInt, situacao;
		
		nome = JOptionPane.showInputDialog("Digite seu nome:");
		frequencia = JOptionPane.showInputDialog("Voc� atingiu a frequ�ncia? Sim=1 / N�o=0");
		media = JOptionPane.showInputDialog("Voc� atingiu a m�dia? Sim=1 / N�o=0");
		
		frequenciaInt = Integer.parseInt(frequencia);
		mediaInt = Integer.parseInt(media);
		
		
		situacao = frequenciaInt * mediaInt;
		
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Situa��o escolar: ");

		if(situacao == 1 || situacao == 0) {
			if(situacao == 1) {
				System.out.println("Aluno aprovado! Parab�ns!");
			}else {
				System.out.println("Reprovado!");
			}
		}else {
			System.out.println("Erro! Digite novamente!");
		}


		
		
	}

}
