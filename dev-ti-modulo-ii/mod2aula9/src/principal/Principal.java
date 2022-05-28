package principal;

import classes.Aluno;

public class Principal {

	public static void main(String[] args) {

		Aluno a = new Aluno("Fernando", "Rua teste", "Dev TI");
		System.out.println(a.nome);
		System.out.println(a.endereco);
		System.out.println(a.curso);
	}

}
