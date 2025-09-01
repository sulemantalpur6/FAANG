package p1.java.topics.arrays;

import java.util.Arrays;

import static p5.utils.InputUtils.getInt;

public class TwoDArray {

    public static void main(String[] args) {

//         Initialized Array
        int[][] initializedArr = {
                {1, 2, 3},  // -> arr[0]
                {4, 5, 6},  // -> arr[1]
                {7, 8, 9}   // -> arr[1]
        };

//         Indexed for loops
//         Time = O(n*m)
//         Memory = Minimal
//         Usage = When you need indices
        for (int row = 0; row < initializedArr.length; row++) {
            for (int col = 0; col < initializedArr[row].length; col++) {
                System.out.print(initializedArr[row][col] + " ");
            }
            System.out.println();
        }

//        Arrays.toString()
//        Time = O(n*m)
//        Memory = Extra (strings)
//        Usage = Quick printing/debugging
        for (int row = 0; row < initializedArr.length; row++) {
            System.out.println(Arrays.toString(initializedArr[row]));
        }


//        Enhanced for-each loops
//        Time = O(n*m)
//        Memory = Minimal
//        Usage = Clean traversal (no indices)
        for (int[] rows : initializedArr) {
            for (int columnValue : rows) {
                System.out.print(columnValue + " ");
            }
            System.out.println();
        }


        // Declaring An Array Of Same No. Of Rows & Columns Size
        int[][] declaredArr = new int[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                declaredArr[row][col] = getInt();
            }
        }

        for (int row = 0; row < initializedArr.length; row++) {
            System.out.println(Arrays.toString(declaredArr[row]));
        }


        // Declaring An Array with Different Number of Columns.
        // This is also called as Jagged Array or Ragged Array
        // It is simply a 2D array where different rows can have different lengths.
        int[][] arrOne = new int[3][];

        arrOne[0] = new int[2];
        arrOne[1] = new int[3];
        arrOne[2] = new int[2];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < arrOne[row].length; col++) {
                arrOne[row][col] = getInt();
            }
        }
    }
}
