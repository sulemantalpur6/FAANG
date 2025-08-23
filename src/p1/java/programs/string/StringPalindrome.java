package p1.java.programs.string;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        int len = input.length();

        // Time Complexity: O(n) → loop runs at most n times
        // Space Complexity: O(1) → only a few variables used
        for (int i = 0; i <= len; i++) {
            if (input.charAt(i) == input.charAt(len - 1)) {
                len--;
            } else {
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");

        // Issue in the above code:
        /*
          1. You’re looping i <= len → this will cause StringIndexOutOfBoundsException when i == len.
          2. You’re always comparing input.charAt(i) with input.charAt(len - 1) instead of mirroring index (len - i - 1).
          3. Also, you’re modifying len inside the loop, which makes it confusing.
         */

        System.out.print("Enter a String: ");
        String str = sc.nextLine().toLowerCase();
        int left = 0, right = str.length() - 1;

        // Time Complexity: O(n) → loop runs at most n times
        // Space Complexity: O(1) → only a few variables used
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("Not a Palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome");
    }
}
