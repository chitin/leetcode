package leetcode557;

import java.util.Stack;

/**
 * Created by denglingang on 2017/5/12.
 */
public class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<String>();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<s.length(); i++) {
            String word = String.valueOf(s.charAt(i));
            stack.push(word);
            if(" ".equals(word) || i == s.length() -1) {
                if(i == s.length() - 1) {
                    sb.append(" ");
                }
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "Let's take LeetCode contest";
        System.out.println(solution.reverseWords(input));
    }
}
