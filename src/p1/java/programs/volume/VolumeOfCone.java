package p1.java.programs.volume;

import static utils.InputUtils.getInt;

public class VolumeOfCone {
    public static void main(String[] args) {
        // Formula --> Volume Of Cone = pi * r^2 * ( h / 3)
        System.out.print("Enter Radius : ");
        int radius = getInt();
        System.out.print("Enter Height : ");
        int height = getInt();

        radius = radius * radius;
        float updatedHeight = (float) height / 3;
        double volume = Math.PI * radius * updatedHeight;
        System.out.printf("Volume of Cone : %.2f", volume);

    }
}
