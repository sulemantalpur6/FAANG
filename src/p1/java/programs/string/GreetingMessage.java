package p1.java.programs.string;

import java.util.Scanner;

public class GreetingMessage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Hello, " + name + " Greetings!");
    }
}
