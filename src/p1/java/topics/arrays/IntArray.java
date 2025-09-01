package p1.java.topics.arrays;

import static p5.utils.InputUtils.getInt;

public class IntArray {

    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = getInt();
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }

    }
}
