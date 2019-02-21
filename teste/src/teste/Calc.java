package teste;

public class Calc implements Calculadora {

	@Override
	public int somar( String n1, String n2) {
	String resultado;
	resultado = n1+n2;
		return resultado;
	}

	@Override
	public double dividir( String n1, String n2) {
		
		return 0;
	}

	@Override
	public double raizQuadrada(String n) {
		
		return 0;
	}

}
