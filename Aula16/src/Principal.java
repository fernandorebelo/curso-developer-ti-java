
public class Principal {

	public static void main(String[] args) {
		int a, b;
		boolean retorno;
		
		a = 10;
		b = 10;
		retorno = a == b;
		
		if (retorno) {
			System.out.println("A � IGUAL a B");
		}else {
			System.err.println("A � DIFERENTE de B");
		}
	}

}
