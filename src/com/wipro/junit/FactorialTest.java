package com.wipro.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testFact() {
		// fail("Not yet implemented");
		Factorial f = new Factorial();
		assertEquals(12, f.fact(5));
	}

}
