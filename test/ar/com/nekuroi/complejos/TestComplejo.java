package ar.com.nekuroi.complejos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestComplejo {

	@Test
	public void test() {
		//final Double valor1 = 10.0;
		//final Double valor2 = 5.0;
		
		Complejo Z1 = new Complejo(5.0, 3.0);
		Complejo Z2 = new Complejo(11.0, 7.0);
		Complejo Z3 = new Complejo();
		
		Z3 = (Complejo)Z1.suma(Z2);
		
		System.out.print(Z3.getReal());
		System.out.print(Z3.getImaginario());
		
		
	}

}
