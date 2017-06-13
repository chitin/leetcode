package leetcode338;

/**
 * 意思是给你一个非负整数num，对于0到num这(num+1)个整数，求出每个数用二进制表示时1的个数。
 */
public class CountingBits {
    public int[] countBits(int num) {
        int[] resultArr = new int[num + 1];
        resultArr[0] = 0;
        for(int i=1; i<=num; i++) {
            resultArr[i] = (i % 2 == 0 ? 0 : 1) + resultArr[i / 2];
        }
        return resultArr;
    }
    public static void main(String[] args) {
        CountingBits countingBits = new CountingBits();
        int[] arr = countingBits.countBits(5);
        for(int in : arr) {
            System.out.println(in);
        }
    }
}
