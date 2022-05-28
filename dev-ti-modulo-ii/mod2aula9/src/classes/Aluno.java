package classes;

public class Aluno {

	public String nome, endereco, curso;
	
	public Aluno(String nome, String endereco, String curso) {
		this.nome = nome;
		this.endereco = endereco;
		this.curso = curso;
		
		System.out.println("Executando o construtor Aluno");
	}
	
	public Aluno() {
		
	}
}
