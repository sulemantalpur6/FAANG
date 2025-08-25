package p1.java.programs.number;

import static p5.utils.InputUtils.getInt;

public class PowerOfNumber {
    public static void main(String[] args) {
        int power = calculatePower();
        System.out.println("Power Is : " + power);
    }

    private static int calculatePower() {
        System.out.print("Enter Number : ");
        int n = getInt();
        System.out.print("Enter Power : ");
        int p = getInt();
        return (int) Math.pow(n, p);
    }
}
