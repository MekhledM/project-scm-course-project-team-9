package com.mycompany.calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
       @Test
    public void testSubtract() {
        System.out.println("subtract");
        double num1 = 6.0;
        double num2 = 5.0;
        Calculator.subtract(num1, num2);
      
    }

   
}