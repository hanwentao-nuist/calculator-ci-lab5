package com.nuist.calculator;

/** Arithmetic operations shared by the console application and unit tests. */
public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public boolean isPositive(double value) {
        return value > 0.0;
    }
}
