package p1.java.programs;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = in.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = in.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("First Number : " + firstNumber + " is greater than second Number : " + secondNumber);
        } else {
            System.out.println("Second Number : " + secondNumber + " is greater than first Number : " + firstNumber);
        }
    }
}
