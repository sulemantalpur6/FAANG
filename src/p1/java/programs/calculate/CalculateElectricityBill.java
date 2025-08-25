package p1.java.programs.calculate;

import static p5.utils.InputUtils.getInt;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        int billPrice = calculateBill();
        System.out.println("Bill Amount Is : " + billPrice);
    }

    static int calculateBill() {
        System.out.print("Enter Units : ");
        int unit = getInt();

        if (unit >= 1 && unit <= 100) {
            return unit * 10;
        } else if (unit > 100 && unit <= 200) {
            return unit * 15;
        } else if (unit > 200 && unit <= 300) {
            return unit * 20;
        } else if (unit > 300) {
            return unit * 25;
        } else {
            System.out.println("Unknown Unit Input : " + unit);
            return 0;
        }

    }
}
