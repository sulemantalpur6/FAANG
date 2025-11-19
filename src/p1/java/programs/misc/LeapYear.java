package p1.java.programs.misc;

import static p5.utils.InputUtils.getInt;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter Year : ");
        int year = getInt();
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }
            isLeapYear = true;
        }
        String message = isLeapYear ? " is " : " is not ";
        System.out.println(year + message + "leap year");
    }
}
