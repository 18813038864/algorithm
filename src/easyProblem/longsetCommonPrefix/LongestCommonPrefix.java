package easyProblem.longsetCommonPrefix;

public class LongestCommonPrefix {
    public static String solution(String[] strs ){
        String res = "";
        if (strs==null||strs.length==0){
            return res;
        }
        for (int i = 0;i<strs[0].length();i++){
            char tmp = strs[0].charAt(i);
            for (int j = 1;j<strs.length;j++){
                if (strs[j].length()==i||strs[j].charAt(i)!=tmp){
                    res = strs[j].substring(0,i);
                    return res;
                }
            }
        }
       return strs[0];
    }
    public static void main(String[] args){

    }
}