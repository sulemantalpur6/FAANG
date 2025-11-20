package p1.java.programs.methods;

import static p5.utils.InputUtils.getInt;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        System.out.print("Enter Number One :");
        int numOne = getInt();
        System.out.print("Enter Number Two :");
        int numTwo = getInt();

        int product = findProduct(numOne, numTwo);
        System.out.println("Product of " + numOne + " & " + numTwo + " is " + product);
    }

    private static int findProduct(int numOne, int numTwo) {
        return numOne * numTwo;
    }
}
