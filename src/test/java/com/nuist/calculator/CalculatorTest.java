package com.nuist.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();
    private static final double EPSILON = 1e-9;

    @Test void additionOfPositiveNumbers() { assertEquals(9, calculator.add(4, 5), EPSILON); }
    @Test void subtractionProducesPositiveResult() { assertEquals(3, calculator.subtract(8, 5), EPSILON); }
    @Test void subtractionProducesNegativeResult() { assertEquals(-3, calculator.subtract(5, 8), EPSILON); }
    @Test void multiplicationOfPositiveNumbers() { assertEquals(42, calculator.multiply(6, 7), EPSILON); }
    @Test void divisionProducesFraction() { assertEquals(2.5, calculator.divide(10, 4), EPSILON); }
    @Test void additionWithZero() { assertEquals(7.5, calculator.add(7.5, 0), EPSILON); }
    @Test void multiplicationByZero() { assertEquals(0, calculator.multiply(123.456, 0), EPSILON); }
    @Test void multiplicationOfNegativeNumbers() { assertEquals(6, calculator.multiply(-2, -3), EPSILON); }
    @Test void divisionWithNegativeDivisor() { assertEquals(-4, calculator.divide(12, -3), EPSILON); }
    @Test void divisionByZeroThrows() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
    @Test void positiveBoundary() { assertTrue(calculator.isPositive(0.001)); }
    @Test void zeroIsNotPositive() { assertFalse(calculator.isPositive(0)); }
}
