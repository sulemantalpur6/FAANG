package p1.java.programs.perimeter;

import static utils.InputUtils.getInt;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        // Formula --> perimeter of square = 4 * a
        System.out.print("Enter Side : ");
        int side = getInt();
        int perimeter = 4 * side;
        System.out.println("Perimeter of Rectangle : " + perimeter);
    }
}
