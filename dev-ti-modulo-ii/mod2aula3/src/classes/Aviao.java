package classes;

import javax.swing.JOptionPane;

public class Aviao {

	String marca;
	String modelo;
	String anoFabricacao;
	public String numeroIdentificacao;
	
	void cadastrarAviao() {
		marca = JOptionPane.showInputDialog("Marca: ");
		modelo = JOptionPane.showInputDialog("Modelo: ");
		anoFabricacao = JOptionPane.showInputDialog("Ano de fabricação: ");
		numeroIdentificacao = JOptionPane.showInputDialog("Número de identificação: ");
		
	}
}
