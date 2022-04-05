
public class ParOuImpar {

	public static void main(String[] args) {
		// Uso de OR EXCLUSIVO - xor - ^
		// Identificar se � par ou �mpar
		// Sendo true=1 e false=0
		int par;
		int impar;
		int verificacao;


		//---------------------------------------------------------		
		//Op��o 1
		par = 0;
		impar = 0;
		
		System.out.println("Dado que true � 1 e false � 0:");
		
		//Verifica��o se o n�mero � par ou �mpar
		verificacao = par^impar;
		
		System.out.println("Para par=0 ou impar=0: " + verificacao);

		//---------------------------------------------------------
		//Op��o 2
		par = 1;
		impar = 0;
				
		//Verifica��o se o n�mero � par ou �mpar
		verificacao = par^impar;
				
		System.out.println("Para par=1 ou impar=0: " + verificacao);

		//---------------------------------------------------------
		//Op��o 3
		par = 0;
		impar = 1;
						
		//Verifica��o se o n�mero � par ou �mpar
		verificacao = par^impar;
						
		System.out.println("Para par=0 ou impar=1: " + verificacao);
				
		//---------------------------------------------------------
		//Op��o 4
		par = 1;
		impar = 1;
						
		//Verifica��o se o n�mero � par ou �mpar
		verificacao = par^impar;
								
		System.out.println("Para par=1 ou impar=1: " + verificacao);
				
	}

}
