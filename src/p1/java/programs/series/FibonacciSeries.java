package p1.java.programs.series;

import static utils.InputUtils.getInt;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Series --> 0, 1, 1, 2, 3 ...
        System.out.print("Enter Limit to Print The Fibonacci Series : ");
        int number = getInt();
        int firstDigit = 0;
        int secondDigit = 1;
        int nextDigit = 0;

        for (int i = 0; i <= number; i++) {
            System.out.print(firstDigit + " ");
            nextDigit = firstDigit + secondDigit;
            firstDigit = secondDigit;
            secondDigit = nextDigit;
        }
    }
}
