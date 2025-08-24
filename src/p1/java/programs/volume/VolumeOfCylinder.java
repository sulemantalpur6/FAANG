package p1.java.programs.volume;

import static p5.utils.InputUtils.getInt;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        // Formula --> Volume Of Cylinder = pi * r^2 * h
        System.out.print("Enter Radius : ");
        int radius = getInt();
        System.out.print("Enter Height : ");
        int height = getInt();

        radius = radius * radius;

        double volume = Math.PI * radius * height;
        System.out.printf("Volume of Cylinder : %.2f", volume);
    }
}
