package p1.java.programs;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        // Mine Solution
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Character Is In Small Case");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Character Is In Upper Case");
        } else {
            System.out.println("Character Is Not An Alphabet");
        }

        // Another Solution
        if (!Character.isLetter(ch)) {
            System.out.println("Character Is Not Letter");
        } else if (Character.isUpperCase(ch)) {
            System.out.println("Character Is In Upper Case");
        } else {
            System.out.println("Character Is In Small Case");
        }

    }

}
