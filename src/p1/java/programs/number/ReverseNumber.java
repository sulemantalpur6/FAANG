package p1.java.programs.number;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int temp = sc.nextInt();


        int number = temp;
        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            System.out.print(digit);
        }


        number = temp;
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            number /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println("\nReversed Number: " + ans);

    }
}
