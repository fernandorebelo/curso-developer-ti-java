package classes;

import java.util.Date;

import javax.swing.JOptionPane;

public class Cliente {

	public String nome;
	public String cpf;
	public String rg;
	public Date dataNascimento;
	public String endereco;
	public String numeroCartaoCredito;
	
	public void cadastrarCliente() {
		nome = JOptionPane.showInputDialog("Nome do cliente: ");
		cpf = JOptionPane.showInputDialog("CPF: ");
		rg = JOptionPane.showInputDialog("RG: ");
		endereco = JOptionPane.showInputDialog("Endereço: ");
		numeroCartaoCredito = JOptionPane.showInputDialog("Cartão de crédito: ");		
	}
	
	public String concatenarNomeCpf() {
		String resultado = nome + " - " + cpf;
		
		return resultado;
	}
}
