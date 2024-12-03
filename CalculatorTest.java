package com.mycompany.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testDivide() {
        System.out.println("Testing divide");
        double num1 = 9.0;
        double num2 = 3.0;
        double expected = 3.0;
        assertEquals(expected, Calculator.divide(num1, num2), "Division result is incorrect");
    }

    @Test
    public void testDivisionByZero() {
        System.out.println("Testing division by zero");
        double num1 = 5.0;
        double num2 = 0.0;
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(num1, num2);
        });
        assertEquals("Cannot divide by zero", exception.getMessage(), "Expected division by zero message not received");
    }

    @Test
    public void testMultiply() {
        System.out.println("Testing multiply");
        double num1 = 5.0;
        double num2 = 4.0;
        double expected = 20.0;
        assertEquals(expected, Calculator.multiply(num1, num2), "Multiplication result is incorrect");
    }

    @Test
    public void testSubtract() {
        System.out.println("Testing subtract");
        double num1 = 6.0;
        double num2 = 5.0;
        double expected = 1.0;
        assertEquals(expected, Calculator.subtract(num1, num2), "Subtraction result is incorrect");
    }

    @Test
    public void testAdd() {
        System.out.println("Testing add");
        double num1 = 5.0;
        double num2 = 4.0;
        double expected = 9.0;
        assertEquals(expected, Calculator.add(num1, num2), "Addition result is incorrect");
    }
}
