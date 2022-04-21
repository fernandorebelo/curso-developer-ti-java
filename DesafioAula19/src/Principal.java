import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Criar estrutura switch
		 * Pedir ao usu�rio digitar um n�mero de 1 a 7
		 * Cada n�mero corresponde a um dia da semana
		 * Exibir o dia da semana na tela
		 * Considere: 1 � segunda-feira e assim por diante
		 * Retornar na tela:
		 * O dia da semana � Segunda-feira
		 */
		
		int dia;
		String diaSemana;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero de 1 a 7"));
				
		switch(dia) {
			case 1:
				diaSemana = "O dia da semana � Segunda-feira!";
				break;
			case 2:
				diaSemana = "O dia da semana � Ter�a-feira!";
				break;
			case 3:
				diaSemana = "O dia da semana � Quarta-feira!";
				break;
			case 4:
				diaSemana = "O dia da semana � Quinta-feira!";
				break;
			case 5:
				diaSemana = "O dia da semana � Sexta-feira!";
				break;
			case 6:
				diaSemana = "O dia da semana � S�bado-feira!";
				break;
			case 7:
				diaSemana = "O dia da semana � Domingo-feira!";
				break;
			default:
				diaSemana = "Dia n�o encontrado! Digite um valor de 1 a 7!";
				break;
		}
		System.out.println(diaSemana);
		
	}

}
