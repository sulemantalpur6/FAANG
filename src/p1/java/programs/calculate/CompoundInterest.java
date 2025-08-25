package p1.java.programs.calculate;

import static p5.utils.InputUtils.getFloat;
import static p5.utils.InputUtils.getInt;

public class CompoundInterest {
    public static void main(String[] args) {
        double compoundInterest = calculateCompoundInterest();
        System.out.printf("Compound Interest Is : %.2f ", compoundInterest);
    }

    private static double calculateCompoundInterest() {
        System.out.print("Enter Principal Amount : ");
        double principalAmount = getInt();
        System.out.print("Enter Time : ");
        double time = getInt();
        System.out.print("Enter Rate : ");
        float rate = getFloat();

        return (principalAmount * (Math.pow(1 + (rate / 100), time)));
    }
}
