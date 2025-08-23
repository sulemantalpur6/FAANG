package p1.java.methods;

import java.util.Scanner;

public class MethodExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int res = sum(num1, num2);
        System.out.println("Sum: " + res);
    }

    // Method to calculate sum of two numbers
    // access_modifier return_type method_name(parameter_list) { ... }
    public static int sum(int a, int b) {
        return a + b;
    }
}
