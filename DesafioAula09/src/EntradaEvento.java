
public class EntradaEvento {

	public static void main(String[] args) {
		//Ser maior de idade ou estar acompanhada de um respons�vel
		
		boolean idadeMaioridade;
		boolean responsavelAcompanhante;
		boolean permissao;
		
		idadeMaioridade = false;		//Diz se a pessoa � maior ou menor de idade
		responsavelAcompanhante = true;	//Diz se a pessoa est� ou n�o com o acompanhante
		
		//Verifica��o se a pessoa � maior de idade
		/*
		 * Utilizei o operador || que significa "ou"
		 * idadeMaioridade || responsavelAcompanhante
		 * false(0) + true(1) = true(1);
		 */
		permissao = idadeMaioridade || responsavelAcompanhante;
		
		System.out.println("ENTRADA DO EVENTO");
		System.out.println("Entrada permitida: " + permissao);
		
	}

}
