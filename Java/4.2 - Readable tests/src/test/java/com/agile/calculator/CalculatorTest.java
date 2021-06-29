package com.agile.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.agile.calculator.Calculator;

public class CalculatorTest {

	private Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@After
	public void tearDown() {
		calculator = null;
	}

	@Test
	public void subtract3from5Test() {
		int expected = 2;
		int actual = calculator.subtract("5,3");
		assertEquals(expected, actual);
	}

	@Test
	public void subtract3fromMinus5Test() {
		int expected = -8;
		int actual = calculator.subtract("-5,3");
		assertEquals(expected, actual);
	}

	@Test
	public void subtract3Test() {
		int expected = 2;
		int actual = calculator.subtract("4,2");
		assertEquals(expected, actual);
	}

	@Test
	public void divide() {
		int expected = 5;
		int actual = calculator.divide("10,2");
		assertEquals(expected, actual);
	}

	@Test
	public void divide2() {
		int expected = -5;
		int actual = calculator.divide("10,-2");
		assertEquals(expected, actual);
	}

	@Test
	public void multiply() {
		int expected = 50;
		int actual = calculator.multiply("25,2");
		assertEquals(expected, actual);
	}

	@Test
	public void multiply2() {
		int expected = 600;
		int actual = calculator.multiply("150,4");
		assertEquals(expected, actual);
	}

	@Test(expected = java.lang.ArithmeticException.class)
	public void dividewithsomeexception() {
		calculator.divide("10,0");
	}

}
