package com.wipro.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		Calculator c=new Calculator();
		assertEquals("Result",5,c.add(2, 3));
	}

	@Test
	public void testSub() {
		//fail("Not yet implemented");
		
		Calculator c=new Calculator();
		assertEquals("Result",1,c.sub(3, 2));
	}

}
