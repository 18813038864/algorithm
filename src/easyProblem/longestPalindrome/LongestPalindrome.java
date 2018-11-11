package easyProblem.longestPalindrome;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
        }
        return s.length()>ans?++ans:ans;
    }

    public static void main(String args[]){
    }
}
