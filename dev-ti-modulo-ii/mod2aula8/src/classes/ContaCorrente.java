package classes;

public class ContaCorrente {

	private double saldo;
	private Agencia agencia;
	
	public void depositar(double valorDepositado) {
		
		if(valorDepositado > 0) {
			saldo = saldo + valorDepositado;
		}else {
			System.out.println("Valor inválido");
		}
	}
	
	public void sacar(double valorSaque) {
		if(valorSaque <= saldo) {
			saldo = saldo - valorSaque;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void calcularJuros(int quantidadeDias, double jurosDia) {
		saldo = saldo * (1 + ((jurosDia * quantidadeDias)/100));
	}
	
	public double exibirSaldo() {
		return saldo;
	}
	
	public void associarAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
}
