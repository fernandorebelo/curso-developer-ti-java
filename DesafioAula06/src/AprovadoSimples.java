
public class Aprovado {

	public static void main(String[] args) {
		double nota1, nota2, nota3;
		int numeroNotas;
		double somaNotas;
		double media;
		String aluno;
		boolean aprovado;
		
		aluno = "Fernando Rebelo";
		nota1 = 7;
		nota2 = 5;
		nota3 = 9;
		numeroNotas = 3;
		somaNotas = nota1 + nota2 + nota3;
		media = somaNotas / numeroNotas;
		aprovado = true;
		
		System.out.println("INFORMA��ES DO ALUNO");
		System.out.println("Aluno: " + aluno);
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Nota 3: " + nota3);
		System.out.println("M�dia das notas: " + media);
		System.out.println("Aprovado: " + aprovado);
	}

}
