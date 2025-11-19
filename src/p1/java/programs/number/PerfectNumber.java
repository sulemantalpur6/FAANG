package p1.java.programs.number;

import static p5.utils.InputUtils.getInt;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number :");
        int sum = 1, num = getInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (num == sum) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
