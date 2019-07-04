package leetcode454;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> abMap = new HashMap<>();
        int result = 0;
        for (int i : A) {
            for (int j : B) {
                int sumAB = i + j;
                abMap.put(sumAB, (abMap.containsKey(sumAB) ? abMap.get(sumAB) : 0) + 1);
            }
        }


        for (int p : C) {
            for (int q : D) {
                int sumCD = p + q;
                if (abMap.containsKey(0 - sumCD)) {
                    result += abMap.get(0 - sumCD);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {-1,-1};
        int[] B = {-1,1};
        int[] C = {-1,1};
        int[] D = {1,-1};
        Solution solution = new Solution();
        System.out.println(solution.fourSumCount(A, B, C, D));

    }
}