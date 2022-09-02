package com.jap.calculator;

public class ScientificCalculator {

	public static void main(String[] args) {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			scientificCalculator.cielOfANumber(10);
		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
		//Call all the methods one by one and surround them by try and respective catch blocks.
		try {
			scientificCalculator.floorOfANumber(6.0f);
		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
		try {
			scientificCalculator.power(2, 3);
		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
		try {
			scientificCalculator.squareRoot(20);
		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
	}

	public double cielOfANumber(float num) throws CalculatorException {
		if (num <= 0) {
			throw new CalculatorException("number should be greater the zero");
		} else {
			Math.ceil(5.0);
		}
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call ceil method of Math class and return the value
		return 0;
	}

	public double floorOfANumber(float num) throws CalculatorException {
		if (num <= 0) {
			throw new CalculatorException("number is to be above 0");
		} else {
			Math.floor(6.0);
		}
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call floor method of Math class and return the value
		return 0;
	}

	public long power(int num1, int num2) throws CalculatorException {
		if (num1 < num2) {
			throw new CalculatorException("num1 should not be greater then number 2");
		} else {
			Math.pow(2.0, 3.0);
		}
		//if num1 is less than num2 than throw the userdefined exception with proper message
		//else use Math pow method and return the value

		return 0;
	}

	public double squareRoot(int num) throws CalculatorException {
		if (num <= 0) {
			throw new CalculatorException("number should be greater than zero");
		} else {
			Math.sqrt(20.0);
		}
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call sqrt method of Math class and return the value

		return 0;
	}

}
