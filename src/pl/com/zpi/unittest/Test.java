package pl.com.zpi.unittest;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;

import pl.com.zpi.Calc;

public class Test {

	@org.junit.Test
	public void calcTest() {
    	Integer a = 3;
    	Integer b = 5;
    	Integer result = 15;
    	assertEquals(Calc.calculate(a, b), result);
	}
	
	@org.junit.Test
	public void generatorTest() {
		int q = 10;
		assertEquals(Calc.generateRandomNumbers(q).length, q);
	}

}

