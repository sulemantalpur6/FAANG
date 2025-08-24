package p1.java.programs.number;

import static p5.utils.InputUtils.getInt;

public class LargestNumberInfiniteInput {
    public static void main(String[] args) {
        largestNumber();
    }

    static void largestNumber() {
        int n;
        int largestNumber = 0;
        do {
            System.out.print("Enter Number : ");
            n = getInt();
            if (n != 0) {
                largestNumber = n > largestNumber ? n : largestNumber;
            }
        } while (n != 0);
        System.out.println("Largest Number : " + largestNumber);
    }
}
