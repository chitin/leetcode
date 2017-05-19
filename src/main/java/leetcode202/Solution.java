package leetcode202;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by denglingang on 2017/5/11.
 */
public class Solution {
    Set<Integer> sumSet = new HashSet<Integer>();
    public boolean isHappy(int n) {
        String numStr = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            sum += Math.pow(numStr.charAt(i) - 48, 2);
        }
        System.out.println(sum);
        if (sum == 1) {
            return true;
        } else if (sumSet.contains(sum)) {
            return false;
        } else {
            sumSet.add(sum);
            return isHappy(sum);
        }
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(34));
        System.out.println(solution.isHappy2(34));
    }

    /**
     * 别人的方案，快
     * @param n
     * @return
     */
    public boolean isHappy2(int n) {
        int fast=n,slow=n;
        do{
            fast = getSum(getSum(fast));
            slow = getSum(slow);
            System.out.println(fast + "  " + slow);
        }while(fast!=slow);
        return fast == 1;
    }
    private int getSum(int n){
        int res = 0;
        while(n!=0){
            res += (n%10)*(n%10);
            n /= 10;
        }
        return res;
    }
}
