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
		anoFabricacao = JOptionPane.showInputDialog("Ano de fabrica��o: ");
		numeroIdentificacao = JOptionPane.showInputDialog("N�mero de identifica��o: ");
		
	}
}
