package p1.java.programs.methods;

import static p5.utils.InputUtils.getInt;

public class EligibleForVote {
    public static void main(String[] args) {
        System.out.print("Enter Age :");
        int age = getInt();

        boolean isEligibleForAge = isEligibleForVote(age);
        System.out.println(isEligibleForAge ? "Eligible for Vote" : "Not Eligible For Vote");
    }

    private static boolean isEligibleForVote(int age) {
        return age >= 18;
    }
}
