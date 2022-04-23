import javax.swing.JOptionPane;

public class DesafioAulaPresencial22 {

	public static void main(String[] args) {
		/*
		 * TRIAGEM RECEPÇÃO HOSPITAL
		 * Programa para fazer triagem na recepção de um hospital.
		 * Será perguntado os sintomas ao paciente e de acordo com as respostas
		 * será atribuido um valor para cada sintoma e então feito uma triagem
		 * para ser levado em uma sala específica.
		 * Solicitações:
		 * Pedir nome e idade do cliente
		 * Verificar sintomas:
		 * Dificuldade para respirar, febre, tosse
		 * Atribuir pontos: respiracao=10, febre=1, tosse=5
		 * Somar pontos e filtrar para onde o cliente deve ir
		 * Mostrar tabela com sintomas e respostas
		 * Menor que 9 = sala de risco baixo
		 * Entre 9 e 20 = sala de risco médio
		 * Maior que 20 = sala de risco grave
		 */
		
		String nome;
		int idade;
		int soma = 0;
		
		nome = JOptionPane.showInputDialog("Qual seu nome?");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
		
		//receber inpur e somar na variável soma
		int sintomaRespiracao = JOptionPane.showConfirmDialog(null, "Possui dificuldade para respitar?");
		if(sintomaRespiracao == 0) {
			soma += 10;
		}
		
		int sintomaFebre = JOptionPane.showConfirmDialog(null, "Está com febre?");
		if(sintomaFebre == 0) {
			soma += 1;
		}
		
		int sintomaTosse = JOptionPane.showConfirmDialog(null, "Está com tosse?");
		if(sintomaTosse == 0) {
			soma += 5;
		}
		
		//transformar o valor recebido do confirmDialog para "Sim" e "Não"
		String sintomaRespiracaoStr, sintomaFebreStr, sintomaTosseStr;
		
		switch(sintomaRespiracao) {
		case 0:
			sintomaRespiracaoStr = "Sim";
			break;
		default:
			sintomaRespiracaoStr = "Não";
			break;
		}
		
		switch(sintomaFebre) {
		case 0:
			sintomaFebreStr = "Sim";
			break;
		default:
			sintomaFebreStr = "Não";
			break;
		}
		
		switch(sintomaTosse) {
		case 0:
			sintomaTosseStr = "Sim";
			break;
		default:
			sintomaTosseStr = "Não";
			break;
		}
		
		//cria uma caixa com as informações recebidas
		String situacao = "RELATÓRIO DO PACIENTE" + "\n";
		situacao += "Nome: " + nome + "\n";;
		situacao += "Idade: " + idade + "\n";
		situacao += "Respiração: " + sintomaRespiracaoStr + "\n";
		situacao += "Febre: " + sintomaFebreStr + "\n";
		situacao += "Tosse: " + sintomaTosseStr + "\n";
		
		//faz a triagem do paciente e mostra a caixa de informações criada anteriormente
		if(soma <= 9) {
			situacao += "Encaminhar para sala de: RISCO BAIXO!";
			JOptionPane.showMessageDialog(null, situacao);
		}
		if(soma > 9 && soma <= 20) {
			situacao += "Encaminhar para sala de: RISCO MÉDIO!";
			JOptionPane.showMessageDialog(null, situacao);
		}
		if(soma > 20) {
			situacao += "Encaminhar para sala de: RISCO GRAVE!";
			JOptionPane.showMessageDialog(null, situacao);
		}
		
	}

}
