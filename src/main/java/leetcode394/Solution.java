package leetcode394;

import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        String res = "";
        int index = 0;

        while(index < s.length()){
            if(Character.isDigit(s.charAt(index))){
                int count = 0;
                while(Character.isDigit(s.charAt(index))){
                    count = 10 * count + (s.charAt(index) - '0');
                    index++;
                }
                countStack.push(count);
            }
            else if(s.charAt(index) == '['){
                resultStack.push(res);
                res = "";
                index++;
            }
            else if(s.charAt(index) == ']'){
                System.out.println(res);
                StringBuilder temp = new StringBuilder (resultStack.pop());
                int times = countStack.pop();
                for(int i = 0; i < times; i++){
                    temp.append(res);
                }
                res = temp.toString();
                index++;
            }
            else{
                res += s.charAt(index);
                index++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str1 = "3[a2[c]]";
        System.out.println(solution.decodeString(str1));
    }
}
