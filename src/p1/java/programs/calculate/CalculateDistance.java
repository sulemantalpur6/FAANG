package p1.java.programs.calculate;

import static p5.utils.InputUtils.getInt;

public class CalculateDistance {
    public static void main(String[] args) {
        double distance = calculateDistance();
        System.out.printf("Distance Is : %.2f", distance);
    }

    private static double calculateDistance() {
        System.out.println("Enter x1 & y1");
        int x1 = getInt();
        int y1 = getInt();
        System.out.println("Enter x2 & y2");
        int x2 = getInt();
        int y2 = getInt();

        x2 -= x1;
        y2 -= y1;

        x2 *= x2;
        y2 *= y2;

        return Math.sqrt((double) x2 + y2);
    }
}
