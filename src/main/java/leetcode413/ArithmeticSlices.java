package leetcode413;


/**
 * 分析：有一个规律是：
 连续3个数构成等差数列，能组成的等差数列个数是1
 连续4个数构成等差数列，能组成的等差数列个数是3（1+2）
 连续5个数构成等差数列，能组成的等差数列个数是6（1+2+3）
 ……
 所以每次当有三个构成等差数列的时候，cnt = 1，之后每连续增加一个数满足与之前的数构成等差数列，就令cnt++，并且将结果加到最终的result里面～
 */
public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        int temp = 0;
        int result = 0;
        for(int i=2; i<A.length; i++) {
            if(A[i]-A[i-1] == A[i-1]-A[i-2]) {
                temp++;
                result += temp;
            } else{
                temp = 0;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArithmeticSlices arithmeticSlices = new ArithmeticSlices();
        int[] a = new int[]{1,2,3,4,7};
        System.out.println(arithmeticSlices.numberOfArithmeticSlices(a));
    }
}
