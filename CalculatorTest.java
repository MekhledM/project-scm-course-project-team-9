
package com.mycompany.calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testDivide() {
        System.out.println("divide");
        double num1 = 9.0;
        double num2 = 3.0;
        Calculator.divide(num1, num2);
       
    }

    @Test
    public void testDivisionByZero() {
        System.out.println("divide");
        double num1 = 5.0;
        double num2 = 0.0;
        Calculator.divide(num1, num2);
       
    }

   
}
