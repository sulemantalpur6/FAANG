package p1.java.programs.number;

import static p5.utils.InputUtils.getInt;

public class FactorialOfNumber {
    public static void main(String[] args) {
        factorialOfANumber();
    }

    private static void factorialOfANumber() {
        System.out.print("Enter A Number : ");
        int n = getInt();
        int originalNumber = n;
        int fact = 1;
        for (int i = 0; i < originalNumber; i++) {
            fact = fact * n;
            n--;
        }
        System.out.println("Factorial of " + originalNumber + " Is : " + fact);
    }

}
