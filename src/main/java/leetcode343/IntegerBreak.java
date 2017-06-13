package leetcode343;

/**
 * Created by denglingang on 2017/6/13.
 */
public class IntegerBreak {
    public int integerBreak(int n) {
        if(n == 2) {
            return 1;
        }
        if(n == 3) {
            return 2;
        }
        int result = 1;
        while(n > 4) {
            result *= 3;
            n -= 3;
        }
        return result * n;
    }
    public static void main(String[] args) {
        IntegerBreak integerBreak = new IntegerBreak();
        System.out.println(integerBreak.integerBreak(10));
    }
}
