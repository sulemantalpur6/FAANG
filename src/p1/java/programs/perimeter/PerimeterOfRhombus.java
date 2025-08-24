package p1.java.programs.perimeter;

import static p5.utils.InputUtils.getInt;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        // Formula --> perimeter of rhombus = 4 * a
        System.out.print("Enter Side : ");
        int side = getInt();
        int perimeter = 4 * side;
        System.out.println("Perimeter of Rhombus : " + perimeter);
    }
}
