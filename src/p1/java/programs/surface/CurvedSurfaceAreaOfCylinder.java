package p1.java.programs.surface;

import static utils.InputUtils.getInt;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        // Formula --> Curved Surface Area Of Cylinder = 2 * pi * r * h
        System.out.print("Enter Radius : ");
        int radius = getInt();
        System.out.print("Enter Height");
        int height = getInt();

        double surface = Math.PI * 2 * radius * height;
        System.out.printf("Surface Area of Cylinder : %.02f", surface);
    }
}
