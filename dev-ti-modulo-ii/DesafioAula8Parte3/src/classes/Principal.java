package classes;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		
		Scanner in = new Scanner(System.in);
		
		double numero1, numero2;
		String condicao;
		
		do {
			String menu = "Qual opera��o voc� deseja realizar?" + "\n";
			menu += "1 - Adi��o" + "\n";
			menu += "2 - Subtra��o" + "\n";
			menu += "3 - Multiplica��o" + "\n";
			menu += "4 - Divis�o" + "\n";
			System.out.println(menu);
			int operacao = Integer.parseInt(in.nextLine());
			
			switch (operacao) {
			case 1:
				System.out.println("ADI��O");
				System.out.println("Digite o primeiro n�mero: ");
				numero1 = Double.parseDouble(in.nextLine());
				System.out.println("Digite o segundo n�mero: ");
				numero2 = Double.parseDouble(in.nextLine());
				
				calc.adicao(numero1, numero2);
				System.out.println(calc.exibirResultado());
				break;
				
			case 2:
				System.out.println("SUBTRA��O");
				System.out.println("Digite o primeiro n�mero: ");
				numero1 = Double.parseDouble(in.nextLine());
				System.out.println("Digite o segundo n�mero: ");
				numero2 = Double.parseDouble(in.nextLine());
				
				calc.subtracao(numero1, numero2);
				System.out.println(calc.exibirResultado());
				break;
				
			case 3:
				System.out.println("ADI��O");
				System.out.println("Digite o primeiro n�mero: ");
				numero1 = Double.parseDouble(in.nextLine());
				System.out.println("Digite o segundo n�mero: ");
				numero2 = Double.parseDouble(in.nextLine());
				
				calc.multiplicacao(numero1, numero2);
				System.out.println(calc.exibirResultado());
				break;
				
			case 4:
				System.out.println("ADI��O");
				System.out.println("Digite o primeiro n�mero: ");
				numero1 = Double.parseDouble(in.nextLine());
				System.out.println("Digite o segundo n�mero: ");
				numero2 = Double.parseDouble(in.nextLine());
				
				calc.divisao(numero1, numero2);
				System.out.println(calc.exibirResultado());
				break;

			default:
				System.out.println("Tente novamente");
				break;
			}
			
			System.out.println("Quer fazer outra opera��o? s/n");
			condicao = in.nextLine();
		} while (condicao.equalsIgnoreCase("s") || condicao.equalsIgnoreCase("sim"));
		
	}

}
