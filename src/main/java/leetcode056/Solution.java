package leetcode056;

public class Solution {

    public int maxSubArray(int[] nums) {
        int maxResult = nums[0];
        int temp = 0;
        for(int i=0; i<nums.length; ++i) {
            if(temp < 0) {
                temp = 0;
            }
            temp = temp + nums[i];
            if(temp > maxResult) {
                maxResult = temp;
            }
        }
        return maxResult;
    }

    /**
     * 动态规划
     * @param nums
     * @return
     */
    public int maxSubArray2(int[] nums) {
        int S[] = new int[nums.length];
        int maxResult = nums[0];
        S[0] = nums[0];
        for(int i=1; i<nums.length; i++) {
            S[i] = Integer.max(S[i-1] + nums[i], nums[i]);
            if(S[i] > maxResult) {
                maxResult = S[i];
            }
        }
        return maxResult;
    }
    /**
     * 动态规划优化后
     * @param nums
     * @return
     */
    public int maxSubArray3(int[] nums) {
        int maxResult = nums[0];
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            sum = Integer.max(sum, nums[i]);
            if(sum > maxResult) {
                maxResult = sum;
            }
        }
        return maxResult;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution.maxSubArray(nums));
        System.out.println(solution.maxSubArray2(nums));
        System.out.println(solution.maxSubArray3(nums));
    }
}
