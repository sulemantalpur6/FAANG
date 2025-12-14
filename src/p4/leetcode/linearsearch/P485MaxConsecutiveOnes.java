package p4.leetcode.linearsearch;

public class P485MaxConsecutiveOnes {

    public int findMaxConsecutiveOnesMySolution(int[] nums) {
        int n = nums.length;
        int p1=0;int p2=0;
        int max=0;
        while(p2<n){
            if(nums[p2]==1){
                p2++;
            }
            else{
                max=Math.max(max,p2-p1);
                p2++;
                p1=p2;
            }
        }
        int fin = p2-p1;
        max=Math.max(max,fin);
        return max;

    }

    public int findMaxConsecutiveOnesOptimalSolution(int[] nums) {
        int max = 0, count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                if (count > max) max = count;
            } else {
                count = 0;
            }
        }
        return max;
    }

}
