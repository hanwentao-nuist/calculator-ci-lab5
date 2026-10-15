package com.nuist.calculator;

import java.util.Locale;
import java.util.Scanner;

/** Small interactive entry point for the packaged calculator. */
public final class Main {
    private Main() { }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try (Scanner input = new Scanner(System.in).useLocale(Locale.ROOT)) {
            System.out.println("Enter first number, operator (+ - * /), and second number:");
            double a = input.nextDouble();
            String operator = input.next();
            double b = input.nextDouble();
            double result = switch (operator) {
                case "+" -> calculator.add(a, b);
                case "-" -> calculator.subtract(a, b);
                case "*" -> calculator.multiply(a, b);
                case "/" -> calculator.divide(a, b);
                default -> throw new IllegalArgumentException("Unsupported operator: " + operator);
            };
            System.out.println("Result: " + a + " " + operator + " " + b + " = " + result);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
