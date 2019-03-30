package src.mediumProblem.zigzag;

public class Zigzag {
    public static String convert(String s, int numRows) {
        if (numRows==1){
            return s;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int tmp = numRows*2-2;
        for (int i = 0;i<numRows;i++){
            int idx = i;
            int idx2 = (numRows-i)*2-2+i;

            while (idx<s.length()){
                stringBuffer.append(s.charAt(idx));
                idx +=tmp;
                if (i!=0&&i!=(numRows-1)){
                    if (idx2<s.length()){
                        stringBuffer.append(s.charAt(idx2));
                        idx2+=tmp;
                    }
                }
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args){
        String str = "PAYPALISHIRING";
        System.out.println(convert(str,3));
    }
}
