package easyProblem.numberOfSegmentsInAStr;

public class NumberOfSegmentsInAStr {
    public static int countSegments(String s) {
        if(s==null||s.equals("")) return 0;
        String[] strArr = s.split("\\s+");
        int count = 0;
        for (String str:strArr){
            if (!str.equals("")){
                count++;
            }
        }
        return count;
    }

    public int countSegments2(String s) {
        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }

        return segmentCount;
    }

    public static void main(String[] args){
        countSegments(", , , ,        a, eaefa");
    }
}
