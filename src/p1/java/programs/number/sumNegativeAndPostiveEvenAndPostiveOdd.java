package p1.java.programs.number;

import static p5.utils.InputUtils.getInt;

public class sumNegativeAndPostiveEvenAndPostiveOdd {
    public static void main(String[] args) {
        System.out.println("Enter Number Below");
        int num, sumOfNegative = 0, sumOfEven = 0, sumOfOdd = 0;
        do {
            num = getInt();
            if (num > 0) {
                if (num % 2 == 0) {
                    sumOfEven = sumOfEven + num;
                } else {
                    sumOfOdd = sumOfOdd + num;
                }
            } else {
                sumOfNegative = sumOfNegative + num;
            }
        } while (num != 0);

        System.out.println("Sum of Negative Number : " + sumOfNegative +
                "\nSum of Even Number : " + sumOfEven +
                "\nSum of Odd Number : " + sumOfOdd);
    }
}
