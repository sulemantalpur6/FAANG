package p1.java.programs.number;

import static p5.utils.InputUtils.getInt;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.print("Enter a digit: ");
        int sum = 0, digit = getInt();

        for (int i = 1; digit != 0; i++) {
            int lastDigit = digit % 10;
            sum = sum + lastDigit;
            digit = digit / 10;
        }

        System.out.println("Sum is : " + sum);
    }
}
