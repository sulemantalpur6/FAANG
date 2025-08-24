package p1.java.programs.number;

import static utils.InputUtils.getInt;

public class SumOfAllNumbersInfiniteInput {
    public static void main(String[] args) {
        sumOfAllNumbers();
    }

    private static void sumOfAllNumbers() {
        int n;
        int sum = 0;
        do {
            System.out.print("Enter Number : ");
            n = getInt();
            sum = sum + n;
        } while (n != 0);
        System.out.println("Sum : " + sum);
    }
}
