package com.mycompany.calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    @Test
    public void testAdd() {
        System.out.println("add");
        double num1 = 5.0;
        double num2 = 4.0;
        Calculator.add(num1, num2);
   
    }
   
}
