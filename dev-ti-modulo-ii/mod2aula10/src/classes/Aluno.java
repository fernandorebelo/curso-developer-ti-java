package classes;

import java.util.Objects;

public class Aluno {

	public static String colegio = "Colégio Unisul";
	
	public String nome;
	public String cpf;
	
	public static String exibirColegioComAluno(String nome) {
		return colegio + " - " + nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	@Override
	public String toString() {
		String aluno = nome + " - " + cpf;
		return aluno;
	}
	
}
