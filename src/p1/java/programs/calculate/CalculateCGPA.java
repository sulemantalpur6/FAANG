package p1.java.programs.calculate;

import static p5.utils.InputUtils.getFloat;
import static p5.utils.InputUtils.getInt;

public class CalculateCGPA {
    public static void main(String[] args) {
        float cgpa = calculateCGPA();
        System.out.println("CGPA : " + cgpa);
    }

    private static float calculateCGPA() {
        System.out.print("Enter Number Of Course : ");
        int n = getInt();
        float quailtyPoints = 0;
        int creditHours = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Grade & Credit Hour For Course : " + i);
            float gradePoint = getFloat();
            int creditHour = getInt();
            quailtyPoints += gradePoint * creditHour;
            creditHours += creditHour;

        }

        if (creditHours == 0) {
            System.out.println("Credit Hour Can't Be 0");
            return 0;
        }

        return quailtyPoints / creditHours;
    }
}
