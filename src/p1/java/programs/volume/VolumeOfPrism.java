package p1.java.programs.volume;

import static utils.InputUtils.getInt;

public class VolumeOfPrism {
    public static void main(String[] args) {
        // Formula --> Volume of Prism = B * H
        System.out.print("Enter Base : ");
        int base = getInt();
        System.out.print("Enter Height : ");
        int height = getInt();
        int volume = base * height;
        System.out.println("Volume of Prism : " + volume);
    }
}
