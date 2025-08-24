package p1.java.programs.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static utils.InputUtils.getInt;

public class FactorOfNumber {
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int n = getInt();
        factorOfNumber(n);
        optimalFactorOfNumber(n);
    }

    static void factorOfNumber(int n) {
        if (n < 1) {
            System.out.println("Factor Is Not Possible Of Negative Integer :" + n);
            return;
        }

        if (n == 1) {
            System.out.println("Factor Of 1 is 1");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
        }
    }

    static void optimalFactorOfNumber(int n) {
        if (n <= 0) return;
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                factorsList.add(i);
                if (i != n / i) {
                    factorsList.add(n / i);
                }
            }
        }
        Collections.sort(factorsList);
        System.out.println(Arrays.toString(factorsList.toArray()));
    }
}
