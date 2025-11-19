package p1.java.programs.number;

public class EvenDaysInMonthOfAugust {
    public static void main(String[] args) {
        int numberOfDays = 0;
        for (int i = 1; i <= 31; i++) {
            if (i % 2 == 0) {
                numberOfDays++;
            }
        }
        System.out.println("Allowed number of days are : " + numberOfDays);
    }
}
