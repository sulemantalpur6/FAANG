package p1.java.topics.arrays;

import static p5.utils.InputUtils.getString;

public class StringArray {
    public static void main(String[] args) {
        String[] arr = new String[5];

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = getString();
        }

        for (String name : arr) {
            System.out.println("Name : " + name);
        }
    }
}
