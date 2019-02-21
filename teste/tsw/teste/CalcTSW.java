package teste;

import org.junit.Assert;
import org.junit.Test;

public class CalcTSW {
	
	@Test
	public void somar4com5() {
		// Arranjar
		String termoUm = "4"; 
		String termoDois = "5";		
		
		// Agir
		Calculadora calc = new Calc();
		int resultado = calc.somar(termoUm, termoDois);
		
		//Afirmar
		
		Assert.assertEquals(9, resultado);
				
	}
	

}
