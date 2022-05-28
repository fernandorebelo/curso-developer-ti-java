import classes.Aluno;

public class Principal {

	public static void main(String[] args) {

		System.out.println(Aluno.colegio);
		
		Aluno.colegio = "Col�gio Novo";
		
		System.out.println(Aluno.colegio);
		
		System.out.println(Aluno.exibirColegioComAluno("Fernando Rebelo"));
		
		
		//hashcode e equals
		Aluno a1 = new Aluno();
		a1.cpf = "111.111.111-11";
		a1.nome = "Fernando";
		
		Aluno a2 = new Aluno();
		a2.cpf = "111.111.111-12";
		a2.nome = "J�ssica";
		
		if(a1.equals(a2)) {
			System.out.println("S�o alunos IGUAIS");
		}else {
			System.out.println("S�o DIFERENTES");
		}
		
		System.out.println(a2.toString()); //j� puxa o .toString() por padr�o
	}

}
