
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

   



       @Test
 
      public void testMultiply() {
        System.out.println("multiply");
        double num1 = 5.0;
        double num2 = 4.0;
        Calculator.multiply(num1, num2);
   
    }
    
    
    
    



       @Test
    public void testSubtract() {
        System.out.println("subtract");
        double num1 = 6.0;
        double num2 = 5.0;
        Calculator.subtract(num1, num2);
      
    }

   


    @Test
    public void testAdd() {
        System.out.println("add");
        double num1 = 5.0;
        double num2 = 4.0;
        Calculator.add(num1, num2);
   
    }
   
}



