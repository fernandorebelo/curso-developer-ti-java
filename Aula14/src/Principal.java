
public class Principal {

	public static void main(String[] args) {
		boolean a, b;
		boolean resultadoOperadorAnd, resultadoOperadorOr, resultadoOperadorNot, resultadoOperadorXor;
		
		a = false;
		b = false;
		
		resultadoOperadorAnd = a & b;
		resultadoOperadorOr = a | b;
		resultadoOperadorNot = !a;
		resultadoOperadorXor = a^b;
		
		System.out.println("Vari�vel A: " + a);
		System.out.println("Vari�vel B: " + b);
		System.out.println("Resultado operador AND: " + resultadoOperadorAnd);
		System.out.println("Resultado operador OR: " + resultadoOperadorOr);
		System.out.println("Resultado operador NOT: " + resultadoOperadorNot);
		System.out.println("Resultado operador XOR: " + resultadoOperadorXor);
	}

}
