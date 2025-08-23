package p1.java.programs.area;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        // Formula --> area of rhombus = (diagonal1 * diagonal2) / 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of diagonal one of the rhombus: ");
        int diagonalOne = sc.nextInt();
        System.out.print("Enter the length of diagonal two of the rhombus: ");
        int diagonalTwo = sc.nextInt();
        int area = (diagonalOne * diagonalTwo) / 2;
        System.out.println("Area of Rhombus is: " + area);
    }
}
