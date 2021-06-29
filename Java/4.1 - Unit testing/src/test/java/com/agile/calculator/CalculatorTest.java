package com.agile.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void subtractionTest() {
		Calculator cal = new Calculator();
		int answer = cal.subtract("2,2");
		assertEquals(answer, 0);
	}

	@Test
	public void multiplyTest() {
		Calculator cal = new Calculator();
		int answer = cal.multiply("2,2");
		assertEquals(answer, 4);
	}
	
	@Test
	public void multiplyTest() {
		Calculator cal = new Calculator();
		int answer = cal.multiply("3,2");
		assertEquals(answer, 6);
	}
	
	@Test
	public void divideTest() {
		Calculator cal = new Calculator();
		int answer = cal.divide("2,2");
		assertEquals(answer, 1);
	}
	

}
