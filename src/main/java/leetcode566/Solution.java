package leetcode566;

/**
 * Created by denglingang on 2017/5/12.
 */
public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int numsCount = nums.length * nums[0].length;
        int[][] result = new int[r][c];
        if(numsCount != r * c) {
            return nums;
        }
        int[] originArr = new int[numsCount];

        int n = 0;

        for(int i=0; i<nums.length;i++) {
            for(int j=0; j<nums[0].length; j++) {
                originArr[n++] = nums[i][j];
            }
        }

        int m = 0;

        for(int i=0; i<r; i++) {
            for(int j=0;j<c;j++) {
                result[i][j] = originArr[m++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{1,2},{3,4}};
        int[][] result = solution.matrixReshape(nums, 1, 4);
        for(int i=0; i<1; i++) {
            for(int j=0;j<4;j++) {
                System.out.println(result[i][j]);
            }
        }
    }
}