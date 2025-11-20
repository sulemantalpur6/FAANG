package p1.java.programs.methods;

import static p5.utils.InputUtils.getInt;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter Number :");
        int num = getInt();

        boolean isPrime = isPrime(num);
        System.out.println(isPrime ? "Number Is Prime" : "Number Is Not Prime");
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
