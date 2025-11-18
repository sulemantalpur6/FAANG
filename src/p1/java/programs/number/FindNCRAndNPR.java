package p1.java.programs.number;

import static p5.utils.InputUtils.getInt;

public class FindNCRAndNPR {
    public static void main(String[] args) {
        mineSolution();
        optimizedSolution();
    }

    private static void optimizedSolution() {
        System.out.print("Enter N:");
        int n = getInt();
        System.out.print("Enter R:");
        int r = getInt();

        int nCr = factorial(n) / (factorial(r) * factorial(n - r));
        int nPr = factorial(n) / factorial(n - r);

        System.out.println("nCr is : " + nCr + "\nnPr is : " + nPr);
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static void mineSolution() {
        // NCR Formula = N! / R! (N-R)!

        System.out.print("Enter N:");
        int n = getInt();
        System.out.print("Enter R:");
        int r = getInt();

        int nMinusR = n - r;

        int nNewValue = n;
        int rNewValue = r;
        int nProduct = 1;
        int rProduct = 1;
        int nMinusRProduct = 1;

        for (int i = 0; i < n; i++) {
            nProduct = nNewValue * nProduct;
            nNewValue--;
        }

        for (int i = 0; i < r; i++) {
            rProduct = rNewValue * rProduct;
            rNewValue--;
        }

        for (int i = 0; i < n - r; i++) {
            nMinusRProduct = nMinusR * nMinusRProduct;
            nMinusR--;
        }

        rProduct = nMinusRProduct * rProduct;
        int nCR = nProduct / rProduct;
        System.out.printf("NCR of N=" + n + " & R=" + r + " Is :" + nCR + "\n");
    }


}
