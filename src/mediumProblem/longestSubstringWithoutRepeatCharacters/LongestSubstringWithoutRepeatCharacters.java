package mediumProblem.longestSubstringWithoutRepeatCharacters;

public class LongestSubstringWithoutRepeatCharacters {

    public static int lengthOfLongestSubstring(String s) {
        if (s==null||s.length()==0){
            return 0;
        }

        int i = 0;
        int j = 0;
        int max = 0;

        while (i<s.length()){
            char ch = s.charAt(i);
            while (s.substring(j,i).contains(ch+"")){
                max = Math.max(max,i-j);
                j++;
            }
            i++;
        }
        return Math.max(max,i-j);
    }

    public static  int lengthOfLongestSubstringBest(String s) {
        if (s==null||s.length()==0){
            return 0;
        }

        int j = 0;
        int i = 0;
        int max = 0;

        while (i<s.length()){
            char ch = s.charAt(i);
            for (int k = j;k<i;k++){
                char c1 = s.charAt(k);
                if(c1 == ch){
                    Math.max(max,i-j+1);
                    j = k + 1;
                    break;
                }
            }
            i++;
        }
        return Math.max(max,i-j);
    }
    public static void main(String[] args){
        String str = "pwwkew";
        int max = lengthOfLongestSubstringBest(str);
        System.out.println(max);

    }
}
