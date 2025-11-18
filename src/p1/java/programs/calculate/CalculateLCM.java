package p1.java.programs.calculate;

import static p5.utils.InputUtils.getInt;

public class CalculateLCM {
    public static void main(String[] args) {
        System.out.print("Enter Number One:");
        int numOne = getInt();
        System.out.print("Enter Number Two:");
        int numTwo = getInt();

        mineSolution(numOne, numTwo);
        optimizedSolution(numOne, numTwo);
    }

    private static void optimizedSolution(int numOne, int numTwo) {
        int lcm = (numOne * numTwo) / gcd(numOne, numTwo);
        System.out.println("LCM Is : " + lcm);
    }

    private static int gcd(int numOne, int numTwo) {
        while (numTwo != 0) {
            int temp = numTwo;
            numTwo = numOne % numTwo;
            numOne = temp;
        }
        return numOne;
    }

    private static void mineSolution(int numOne, int numTwo) {
        int divider = 2, lcm = 1;

        while (numOne > 1 && numTwo > 1) {
            boolean isNumOneDivided = isEvenlyDivider(numOne, divider);
            boolean isNumTwoDivided = isEvenlyDivider(numTwo, divider);
            if (isNumOneDivided && isNumTwoDivided) {
                lcm = lcm * divider;
                numOne = numOne / divider;
                numTwo = numTwo / divider;
                continue;
            }

            if (isNumOneDivided) {
                lcm = lcm * divider;
                numOne = numOne / divider;
                continue;
            }

            if (isNumTwoDivided) {
                lcm = lcm * divider;
                numTwo = numTwo / divider;
                continue;
            }

            divider++;
        }

        System.out.println("LCM Is : " + lcm);
    }

    private static boolean isEvenlyDivider(int num, int divider) {
        return num % divider == 0;
    }
}
