

import classes.Agencia;
import classes.ContaCorrente;

public class Principal {

	public static void main(String[] args) {

		ContaCorrente c = new ContaCorrente();
		
		double valor = 50;
		
		c.depositar(valor);
		
		c.sacar(50);
		
		System.out.println("Saldo: " + c.exibirSaldo());
		
		Agencia a = new Agencia();
		a.numero = 123;
		
		c.associarAgencia(a);
		
		c.calcularJuros(10, 0.03);
	}

}
