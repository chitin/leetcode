package leetcode575;

import java.util.HashSet;

public class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> candiesSet = new HashSet<Integer>();
        for(int candy : candies) {
            candiesSet.add(candy);
        }
        if(candiesSet.size() <= candies.length / 2) {
            return candiesSet.size();
        } else {
            return candies.length / 2;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candies = new int[]{1,1,1,1};
        System.out.println(solution.distributeCandies(candies));
    }
}