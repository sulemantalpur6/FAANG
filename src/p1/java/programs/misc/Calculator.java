package p1.java.programs.misc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = sc.nextInt();

        System.out.print("Enter Operator (+ , - , *, /) : ");
        char operator = sc.next().charAt(0);

        if (operator == '+') {
            int result = firstNumber + secondNumber;
            System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is " + result);
        } else if (operator == '-') {
            int result = firstNumber - secondNumber;
            System.out.println("Subtraction of " + firstNumber + " and " + secondNumber + " is " + result);
        } else if (operator == '*') {
            int result = firstNumber * secondNumber;
            System.out.println("Multiplication of " + firstNumber + " and " + secondNumber + " is " + result);
        } else if (operator == '/') {
            float result = firstNumber / secondNumber;
            System.out.println("Division of " + firstNumber + " and " + secondNumber + " is " + result);
        } else {
            System.out.println("Invalid Operator: " + operator);
        }
    }
}
