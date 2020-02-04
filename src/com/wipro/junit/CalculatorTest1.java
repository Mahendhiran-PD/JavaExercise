package com.wipro.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest1 {

	@Test
	public void testAdd() {
		// fail("Not yet implemented");

		Calculator c = new Calculator();
		assertEquals(5, c.add(2, 3));

	}

	@Test
	public void testSub() {
		// fail("Not yet implemented");

		Calculator c = new Calculator();
		assertEquals(2, c.sub(3, 1));

	}

}
