package leetcode344;

public class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length -1;
        char temp = 0;
        while (i < j) {
            temp = s[i];
            s[i] = s[j];
            s[j]= temp;
            i++;
            j--;
        }


    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l'};
        Solution solution = new Solution();
        solution.reverseString(s);
        System.out.println(s);

    }
}
