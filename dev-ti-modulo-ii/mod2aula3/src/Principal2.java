import classes.Cliente;

public class Principal2 {

	public static void main(String[] args) {

		Cliente c = new Cliente();
		c.nome = "Fernando";
		c.cpf = "111.111.111-77";
		
		String nomeCpf = c.concatenarNomeCpf();
		
		System.out.println(nomeCpf);
		
		System.out.println(c.concatenarNomeCpf());
	}

}
