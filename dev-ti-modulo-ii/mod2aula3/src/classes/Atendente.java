package classes;

import java.util.Date;

import javax.swing.JOptionPane;

public class Atendente {

	String nome;
	String cpf;
	String rg;
	Date dataNascimento;
	String endereco;
	String carteiraTrabalho;
	
	void cadastrarCliente() {
		nome = JOptionPane.showInputDialog("Nome do atendente: ");
		cpf = JOptionPane.showInputDialog("CPF atendente: ");
		rg = JOptionPane.showInputDialog("RG atendente: ");
		endereco = JOptionPane.showInputDialog("Endereço atendente: ");
		carteiraTrabalho = JOptionPane.showInputDialog("Carteira de trabalho: ");
	}
}
