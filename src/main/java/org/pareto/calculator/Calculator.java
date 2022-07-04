package org.pareto.calculator;

/**
 * A simple calculator.
 */
public class Calculator {

    /**
     * Method to add two numbers.
     * @param a the first number to add
     * @param b the second number to add
     * @return the sum of both numbers
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Method to subtract two numbers.
     * @param a the first number
     * @param b the number to subtract
     * @return the result of the subtraction
     */
    public int sub(int a, int b) {
        return a - b;
    }

    /**
     * Method to divide two integers.
     * @param a the number to divide
     * @param b the divisor
     * @return the results of the division
     * @throws IllegalArgumentException if b is zero
     */
    public int div(int a, int b) throws IllegalArgumentException {
        if (b != 0) {
            return a / b;
        }
        throw new IllegalArgumentException();
    }
}
