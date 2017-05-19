package leetcode561;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by denglingang on 2017/5/11.
 */
public class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i=0; i< nums.length/2; i++) {
            sum += nums[2 * i];
        }
        return sum;
    }

    public static void main(String [] args) {
        int[] arr = new int[]{1, 4, 3, 2};
        Solution solution = new Solution();
        System.out.println(solution.arrayPairSum(arr));
    }
}
