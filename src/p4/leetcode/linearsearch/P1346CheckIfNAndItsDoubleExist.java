package p4.leetcode.linearsearch;

import java.util.HashSet;
import java.util.Set;

public class P1346CheckIfNAndItsDoubleExist {

    // My Solution
    public boolean checkIfExist(int[] arr) {
        int j = 0;
        for (int i=0; i<arr.length; i++) {
            while(j < arr.length) {
                if ((i != j) && (arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i])) {
                    return true;
                }
                j++;
            }
            j=0;
        }
        return false;
    }

    // Optimal Solution
    public boolean checkIfExistOptimal(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(2 * num) ||
                    (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
