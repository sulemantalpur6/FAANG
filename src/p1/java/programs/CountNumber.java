package p1.java.programs;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        System.out.print("Enter a number to find it's occurrence: ");
        int n = sc.nextInt();
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit == n) {
                count++;
            }
            number /= 10;
        }
        System.out.println(
                "The number " + n + " occurs " + count + " times in the given number."
        );
    }
}
