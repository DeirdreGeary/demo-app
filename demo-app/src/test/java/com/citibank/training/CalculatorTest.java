package com.citibank.training;

import static org.junit.Assert.*;

import org.junit.Test;

import com.citibank.demo.Calculator;




public class CalculatorTest {

	@Test
	public void test() {
		//Arrange
		Calculator calculator= new Calculator();
		//Act
		int result= calculator.Add(2, 3);
		//Assert
		assertEquals(5, result);
			
	}

}
