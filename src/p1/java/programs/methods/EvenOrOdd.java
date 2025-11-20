package p1.java.programs.methods;

import static p5.utils.InputUtils.getInt;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        int number = getInt();

        findEvenOrOdd(number);
    }

    private static void findEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " Is Even");
        } else {
            System.out.println(number + " Is Odd");
        }
    }
}
