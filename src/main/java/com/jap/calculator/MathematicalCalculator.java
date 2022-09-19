package com.jap.calculator;

public class MathematicalCalculator {

    /**
     * This function adds two numbers together and returns the result. If an error occurs, it throws a CalculatorException.
     *
     * @param num1 The first number to add
     * @param num2 The second number to add
     * @return The sum of num1 and num2
     */
    public int add(int num1, int num2) throws CalculatorException {

        try {
            return num1 + num2;
        } catch (ArithmeticException exception) {
            throw new RuntimeException(exception);
        }
    }

    /**
     * This function subtracts two numbers and returns the result.
     *
     * @param num1 The first number to subtract from
     * @param num2 The second number to subtract from the first number.
     * @return The difference between num1 and num2
     */
    public int subtract(int num1, int num2) throws CalculatorException {
        try {
            return num1 - num2;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    /**
     * This function multiplies two numbers and returns the result. If an exception occurs, it throws a
     * CalculatorException.
     *
     * @param num1 The first number to multiply
     * @param num2 The second number to multiply.
     * @return The product of num1 and num2
     */
    public int multiply(int num1, int num2) throws CalculatorException {
        try {
            return num1 * num2;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    /**
     * It divides two numbers and returns the result
     *
     * @param num1 The first number
     * @param num2 The number to divide by.
     * @return The result of the division of num1 by num2.
     */
    public int divide(int num1, int num2) throws CalculatorException {
        try {
            if (num2 == 0) {
                return 0;
            } else
                //write the code and handle the ArithmeticException
                return num1 / num2;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    /**
     * This function takes two integers and returns the modulo of the two integers.
     *
     * @param num1 The first number to be used in the modulo operation.
     * @param num2 The number to divide by
     * @return The remainder of the division of num1 by num2.
     */
    public int modulo(int num1, int num2) throws CalculatorException {
        try {
            return num1 % num2;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
