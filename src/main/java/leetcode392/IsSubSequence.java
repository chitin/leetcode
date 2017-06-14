package leetcode392;

/**
 * Created by denglingang on 2017/6/14.
 */
public class IsSubSequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) {
            return false;
        }
        int location = 0;
        for(int i=0; i<s.length(); i++) {
            location = t.indexOf(s.charAt(i), location);
            if(location < 0) {
                return false;
            }
            location++;
        }
        return true;
    }
    public static void main(String[] args) {
        IsSubSequence isSubSequence = new IsSubSequence();
        System.out.println(isSubSequence.isSubsequence("axc", "ahbgdc"));
    }
}
