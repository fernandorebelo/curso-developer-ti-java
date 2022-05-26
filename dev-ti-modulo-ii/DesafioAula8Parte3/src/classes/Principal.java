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
			String menu = "Qual operação você deseja realizar?" + "\n";
			menu += "1 - Adição" + "\n";
			menu += "2 - Subtração" + "\n";
			menu += "3 - Multiplicação" + "\n";
			menu += "4 - Divisão" + "\n";
			System.out.println(menu);
			int operacao = Integer.parseInt(in.nextLine());
			
			switch (operacao) {
			case 1:
				System.out.println("ADIÇÃO");
				System.out.println("Digite o primeiro número: ");
				numero1 = Double.parseDouble(in.nextLine());
				System.out.println("Digite o segundo número: ");
				numero2 = Double.parseDouble(in.nextLine());
				
				calc.adicao(numero1, numero2);
				System.out.println(calc.exibirResultado());
				break;
				
			case 2:
				System.out.println("SUBTRAÇÃO");
				System.out.println("Digite o primeiro número: ");
				numero1 = Double.parseDouble(in.nextLine());
				System.out.println("Digite o segundo número: ");
				numero2 = Double.parseDouble(in.nextLine());
				
				calc.subtracao(numero1, numero2);
				System.out.println(calc.exibirResultado());
				break;
				
			case 3:
				System.out.println("ADIÇÃO");
				System.out.println("Digite o primeiro número: ");
				numero1 = Double.parseDouble(in.nextLine());
				System.out.println("Digite o segundo número: ");
				numero2 = Double.parseDouble(in.nextLine());
				
				calc.multiplicacao(numero1, numero2);
				System.out.println(calc.exibirResultado());
				break;
				
			case 4:
				System.out.println("ADIÇÃO");
				System.out.println("Digite o primeiro número: ");
				numero1 = Double.parseDouble(in.nextLine());
				System.out.println("Digite o segundo número: ");
				numero2 = Double.parseDouble(in.nextLine());
				
				calc.divisao(numero1, numero2);
				System.out.println(calc.exibirResultado());
				break;

			default:
				System.out.println("Tente novamente");
				break;
			}
			
			System.out.println("Quer fazer outra operação? s/n");
			condicao = in.nextLine();
		} while (condicao.equalsIgnoreCase("s") || condicao.equalsIgnoreCase("sim"));
		
	}

}
