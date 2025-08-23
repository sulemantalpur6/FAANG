package p1.java.programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, temp;

        for (int i = 1; i <= n; i++) {
            System.out.println(a + " ");
            temp = a;
            a = b;
            b = temp + b;
        }

    }
}
