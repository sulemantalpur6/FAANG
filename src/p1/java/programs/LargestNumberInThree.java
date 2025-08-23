package p1.java.programs;

import java.util.Scanner;

public class LargestNumberInThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("Maximum Number Using Conditions: " + max);

        int mathMax = Math.max(a, b);
        mathMax = Math.max(mathMax, c);

        System.out.println("Maximum Number using Math.max : " + mathMax);
    }
}
