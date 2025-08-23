package p1.java.programs.volume;

import static utils.InputUtils.getInt;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        // Formula --> Volume Of Pyramid = ( l * w * h ) / 3
        System.out.print("Enter Length : ");
        int length = getInt();
        System.out.print("Enter Width : ");
        int width = getInt();
        System.out.print("Enter Height : ");
        int height = getInt();

        float volume = (float) (length * width * height) / 3;
        System.out.printf("Volume of Pyramid : %.02f", volume);
    }
}
