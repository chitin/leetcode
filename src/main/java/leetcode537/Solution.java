package leetcode537;

/**
 * Input: "1+-1i", "1+-1i"
 Output: "0+-2i"
 Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
 */
public class Solution {
    public String complexNumberMultiply(String a, String b) {
        String xa = a.split("\\+")[0];
        String xb = b.split("\\+")[0];
        String yaStr = a.split("\\+")[1];
        int ya = Integer.parseInt(yaStr.substring(0, yaStr.length()-1));
        String ybStr = b.split("\\+")[1];
        int yb = Integer.parseInt(ybStr.substring(0, ybStr.length()-1));

        int resultA = Integer.parseInt(xa) * Integer.parseInt(xb) + ya * yb * -1;
        int resultB = Integer.parseInt(xa) * yb + Integer.parseInt(xb) * ya;

        return String.format("%d+%di", resultA, resultB);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.complexNumberMultiply("1+1i", "1+1i"));
    }
}
