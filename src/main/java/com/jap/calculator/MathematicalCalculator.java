package com.jap.calculator;

public class MathematicalCalculator {

	public int add(int num1, int num2) {
		try {
			return num1 + num2;
		} catch (ArithmeticException e) {
			throw new RuntimeException(e);
		}
	}

	public int subtract(int num1, int num2) {
		try {
			return num1 - num2;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public int multiply(int num1, int num2) {
		try {
			return num1 * num2;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public int divide(int num1, int num2) {
		try {
			if (num2 == 0) {
				return 0;
			} else
				//write the code and handle the ArithmeticException
				return num1 / num2;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public int modulo(int num1, int num2) {
		try {
			return num1 % num2;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
