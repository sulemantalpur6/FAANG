package p1.java.programs.calculate;

import static p5.utils.InputUtils.getInt;

public class CalculateHCF {
    public static void main(String[] args) {
        System.out.print("Enter Number One :");
        int numOne = getInt();
        System.out.print("Enter Number Two :");
        int numTwo = getInt();
        int divider = 2, hcf = 1;
        while (numOne > divider || numTwo > divider) {
            if (isEvenlyDivider(numOne, divider) && isEvenlyDivider(numTwo, divider)) {
                hcf = hcf * divider;
                numOne = numOne / divider;
                numTwo = numTwo / divider;
            } else {
                divider++;
            }
        }
        System.out.println("HCF Is : " + hcf);
    }

    private static boolean isEvenlyDivider(int num, int divider) {
        return num % divider == 0;
    }
}
