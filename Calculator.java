package com.mycompany.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter first number:");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                add(num1, num2);
                break;
            case 2:
                subtract(num1, num2);
                break;
            case 3:
                multiply(num1, num2);
                break;
            case 4:
                divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation!");
        }

        scanner.close();
    }

    public static double add(double num1, double num2) {
      double result = num1 + num2;
      System.out.println("Result: " + result);
        return result;
    }

    public static double subtract(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Result: " + result);
        return result;
    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Result of multiplication: " + result);
        return result;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double result = num1 / num2;
            System.out.println("Result of division: " + result);
            return result;
        }
        return 0;
        

    }
}