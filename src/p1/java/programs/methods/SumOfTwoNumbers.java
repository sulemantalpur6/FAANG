package p1.java.programs.methods;

import static p5.utils.InputUtils.getInt;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        System.out.print("Enter Number One :");
        int numOne = getInt();
        System.out.print("Enter Number Two :");
        int numTwo = getInt();

        int sum = findSum(numOne, numTwo);
        System.out.println("Sum of " + numOne + " & " + numTwo + " is " + sum);
    }

    private static int findSum(int numOne, int numTwo) {
        return numOne + numTwo;
    }
}
