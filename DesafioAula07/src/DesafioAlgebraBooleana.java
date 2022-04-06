
public class DesafioAlgebraBooleana {

	public static void main(String[] args) {
		//Construir tabela verdade para a express�o (A . B)'
		
		int a, b;
		int resultado;
		boolean verdadeiro, falso;
		
		verdadeiro = true;
		falso = false;	
		
		System.out.println("TABELA VERDADE - DESAFIO AULA 07");
		System.out.println("Construir tabela para a express�o -> (A . B)'");
		System.out.println("-----------------------------");

		System.out.println("OPERADORES AND (.)");
		System.out.println();

		
		a=1;
		b=1;
		resultado = a * b;
		System.out.println("Vari�veis a=1, b=1");
		System.out.println("(A.B)' = " + resultado + " -> " + falso);
		System.out.println();
		
		a=1;
		b=0;	
		resultado = a * b;
		System.out.println("Vari�veis a=1, b=0");
		System.out.println("(A.B)' = " + resultado + " -> " + verdadeiro);
		System.out.println();
		
		a=0;
		b=1;
		resultado = a * b;
		System.out.println("Vari�veis a=0, b=1");
		System.out.println("(A.B)' = " + resultado + " -> " + verdadeiro);
		System.out.println();
		
		a=0;
		b=0;
		resultado = a * b;
		System.out.println("Vari�veis a=0, b=0");
		System.out.println("(A.B)' = " + resultado + " -> " + verdadeiro);
		System.out.println();

		System.out.println("-----------------------------");
		
		System.out.println("OPERADORES OR (+)");
		System.out.println();

		
		a=1;
		b=1;
		resultado = a + b;
		System.out.println("Vari�veis a=1, b=1");
		System.out.println("Para (A+B)' = " + resultado + " -> " + falso);
		System.out.println();
		
		a=1;
		b=0;	
		resultado = a + b;
		System.out.println("Vari�veis a=1, b=0");
		System.out.println("Para (A+B)' = " + resultado + " -> " + falso);
		System.out.println();
		
		a=0;
		b=1;
		resultado = a + b;
		System.out.println("Vari�veis a=0, b=1");
		System.out.println("Para (A+B)' = " + resultado + " -> " + falso);
		System.out.println();
		
		a=0;
		b=0;
		resultado = a + b;
		System.out.println("Vari�veis a=0, b=0");
		System.out.println("Para (A.B)' = " + resultado + " -> " + verdadeiro);
		System.out.println();

	}

}
