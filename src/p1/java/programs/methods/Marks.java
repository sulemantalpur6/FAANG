package p1.java.programs.methods;

import static p5.utils.InputUtils.getInt;

public class Marks {
    public static void main(String[] args) {

     /* 91-100         AA
        81-90          AB
        71-80          BB
        61-70          BC
        51-60          CD
        41-50          DD
        <=40          Fail */

        System.out.print("Enter Marks :");
        int marks = getInt();

        findGrade(marks);
    }

    private static void findGrade(int marks) {
        if (marks > 90 && marks <= 100) {
            System.out.println("Grade AA");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("Grade AB");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("Grade BB");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("Grade BC");
        } else if (marks > 50 && marks <= 60) {
            System.out.println("Grade CD");
        } else if (marks > 40 && marks <= 50) {
            System.out.println("Grade DD");
        } else if (marks >= 0 && marks <= 40) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid Marks, Please Input 0-100");
        }
    }
}
