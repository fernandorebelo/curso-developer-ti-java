import classes.Aviao;
import classes.Cliente;
import classes.Voo;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.nome = "Fernando";
		cliente.cpf = "111.111.111-44";
		
		System.out.println(cliente.nome);
		System.out.println(cliente.cpf);
		
		Cliente c = new Cliente();
		c.nome = "Jéssica";
		c.cpf = "321.321.321-44";
		
		System.out.println(c.nome);
		System.out.println(c.cpf);
		
		Cliente c2 = new Cliente();
//		c2.cadastrarCliente();
//		System.out.println(c2.nome);
		
		Cliente c3 = new Cliente();
		c3.nome = "Amora";
		
		if(c3 != null) {				//verifica se o c3 está instanciado
			System.out.println(c3.nome);
		}
		
		Voo voo = new Voo();
		Aviao aviao = new Aviao();
		voo.aviao = aviao;
		voo.aviao.numeroIdentificacao = "123";
		
		
		
	}

}
