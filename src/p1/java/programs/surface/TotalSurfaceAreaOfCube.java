package p1.java.programs.surface;

import static utils.InputUtils.getInt;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        // Formula --> Total Surface Area Of Cube : 6 * s^2
        System.out.print("Enter One Side Length : ");
        int length = getInt();
        int surfaceArea = 6 * length * length;
        System.out.println("Surface Area of Cube : " + surfaceArea);
    }
}
