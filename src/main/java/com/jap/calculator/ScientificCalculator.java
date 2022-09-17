package com.jap.calculator;

public class ScientificCalculator {
    //Call all the methods one by one and surround them by try and respective catch blocks.
    public static void main(String[] args) {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        try {
            scientificCalculator.cielOfANumber(10);
        } catch (CalculatorException e) {
            throw new RuntimeException(e);
        }

        try {
            scientificCalculator.floorOfANumber(6.0f);
        } catch (CalculatorException e) {
            throw new RuntimeException(e);
        }
        try {
            scientificCalculator.power(2, 3);
        } catch (CalculatorException e) {
            System.out.println(e);
        }
        try {
            scientificCalculator.squareRoot(20);
        } catch (CalculatorException e) {
            System.out.println(e);
        }
    }

    public double cielOfANumber(float num) throws CalculatorException {
        //check if num is equal to or less than 0 than throw the userdefined exception with proper message
        //or else call ceil method of Math class and return the value
        if (num <= 0) {
            throw new CalculatorException("number should be greater the zero");
        } else {
            System.out.println(Math.ceil(5.0));
        }
        return 0;
    }

    // Checking if the number is less than or equal to 0 and if it is then it throws a CalculatorException with a message.
    // If it is not then it prints the floor of the number.
    public double floorOfANumber(float num) throws CalculatorException {
        //check if num is equal to or less than 0 than throw the userdefined exception with proper message
        //or else call floor method of Math class and return the value

        if (num <= 0) {
            throw new CalculatorException("number is to be above 0");
        } else {
            System.out.println(Math.floor(6.0));
        }
        return 0;
    }

    // Checking if num1 is less than num2 and if it is then it throws a CalculatorException with a message.
    // If it is not then it prints the power of num1 to num2.
    public long power(int num1, int num2) throws CalculatorException {
        //if num1 is less than num2 than throw the userdefined exception with proper message
        //else use Math pow method and return the value
        if (num1 < num2) {
            throw new CalculatorException("num1 should not be greater then number 2");
        } else {
            System.out.println((long) Math.pow(num1, num2));
        }
        return 0;
    }
    //check if num is equal to or less than 0 than throw the userdefined exception with proper message
    //or else call sqrt method of Math class and return the value

    // Checking if the number is less than or equal to 0 and if it is then it throws a CalculatorException with a message.
    // If it is not then it prints the square root of the number.
    public double squareRoot(int num) throws CalculatorException {
        if (num <= 0) {
            throw new CalculatorException("number should be greater than zero");
        } else {
            System.out.println(Math.sqrt(num));
        }
        return 0;
    }
}
