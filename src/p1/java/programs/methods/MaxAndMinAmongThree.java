package p1.java.programs.methods;

import static p5.utils.InputUtils.getInt;

public class MaxAndMinAmongThree {
    public static void main(String[] args) {
        System.out.print("Enter First Number :");
        int firstNum = getInt();
        System.out.print("Enter Second Number :");
        int secondNum = getInt();
        System.out.print("Enter Third Number :");
        int thirdNum = getInt();

        findAndPrintMaxAndMinNumber(firstNum, secondNum, thirdNum);
    }

    private static void findAndPrintMaxAndMinNumber(int firstNum, int secondNum, int thirdNum) {
        int max = thirdNum, min = thirdNum;

        if (firstNum > secondNum && firstNum > thirdNum) {
            max = firstNum;
        } else if (secondNum > thirdNum) {
            max = secondNum;
        }

        if (firstNum < secondNum && secondNum < thirdNum) {
            min = firstNum;
        } else if (secondNum < thirdNum) {
            min = secondNum;
        }

        System.out.println("\nMaximum Number Is : " + max);
        System.out.println("Minimum Number Is : " + min);
    }
}
