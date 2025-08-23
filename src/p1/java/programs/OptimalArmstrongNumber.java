package p1.java.programs;

import java.util.Scanner;

public class OptimalArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }
    }

    private static boolean isArmstrongNumber(int number) {
        if (number < 0) return false;
        int exponent = getExponent(number);
        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, exponent);
            number /= 10;
        }
        return sum == original;
    }

    private static int getExponent(int number) {
        return (int) Math.log10(number) + 1;
    }
}
