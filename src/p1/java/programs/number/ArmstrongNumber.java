package p1.java.programs.number;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Find The Armstrong : ");
        int number = sc.nextInt();
        int exponent = getExponent(number);
        boolean isArmstrongNumber = isArmstrongNumber(number, exponent);
        System.out.println("Armstrong Number = " + isArmstrongNumber);
    }

    private static boolean isArmstrongNumber(int number, int exponent) {
        int originalNumber = number;
        int result = 0;
        while (number != 0) {
            int digit = number % 10;
            int x = digit;
            number /= 10;
            for (int i = 0; i < exponent - 1; i++) {
                x = x * digit;
            }
            result += x;
        }
        return result == originalNumber;
    }

    private static int getExponent(int number) {
        int exponent = 0;
        while (number != 0) {
            number = number / 10;
            exponent++;
        }
        return exponent;
    }


}
