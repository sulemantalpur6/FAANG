package p1.java.programs.calculate;

import static p5.utils.InputUtils.getInt;

public class CalculateDepreciation {
    public static void main(String[] args) {
        calculateDepreciation();
    }

    static void calculateDepreciation() {
        System.out.print("Enter Initial Value : ");
        int intialValue = getInt();
        System.out.print("Enter Useful Life : ");
        int t = getInt();
        System.out.print("Enter Salvage Value : ");
        int s = getInt();

        int deprecationPerYear = (intialValue - s) / t;

        for (int i = 1; i <= t; i++) {
            intialValue -= deprecationPerYear;
            System.out.println("Amount After Depreciation for Year " + i + " will be " + intialValue);

        }
    }
}
