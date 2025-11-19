package p1.java.programs.charchter;

import static p5.utils.InputUtils.getChar;

public class VowelOrConstant {
    public static void main(String[] args) {
        System.out.print("Enter a Alphabet: ");
        char alpha = getChar();
        boolean isVowel = alpha == 'a' || alpha == 'A' ||
                alpha == 'e' || alpha == 'E' ||
                alpha == 'i' || alpha == 'I' ||
                alpha == 'o' || alpha == 'O' ||
                alpha == 'u' || alpha == 'U';
        boolean isConstant = ((int) alpha >= 65 && (int) alpha <= 90) ||
                ((int) alpha >= 97 && (int) alpha <= 122);
        if (isVowel) {
            System.out.println(alpha + " is vowel.");
        } else if (isConstant) {
            System.out.println(alpha + " is constant");
        } else {
            System.out.println(alpha + " isn't valid alphabet");
        }
    }
}
