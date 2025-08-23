package p1.java.programs.volume;

import static utils.InputUtils.getInt;

public class VolumeOfSphere {
    public static void main(String[] args) {
        // Formula --> Volume Of Sphere = ( 4 / 3 ) * pi * r^3
        System.out.print("Enter Radius : ");
        int radius = getInt();
        radius = radius * radius * radius;
        double volume = ((double) 4 / 3) * Math.PI * radius;
        System.out.printf("Volume Of Sphere : %.02f", volume);
    }
}
