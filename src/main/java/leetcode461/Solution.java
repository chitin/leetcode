package leetcode461;

/**
 * Created by denglingang on 2017/5/11.
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int result = x ^ y;
        String resultBinary = Integer.toBinaryString(result);
        int count = 0;
        for(int i=0; i<resultBinary.length(); i++) {
            count += resultBinary.charAt(i) - 48;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingDistance(128,127));
        System.out.println(Integer.bitCount(128^127));
    }
}
