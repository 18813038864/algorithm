package easyProblem.reverseInteger;

public class ReverseInteger {
    public static int solution(int num){
        long newNum = 0;
        while (num!=0){
            int i = num%10;
            num = num/10;
//
//            if (newNum > Integer.MAX_VALUE/10 || (newNum == Integer.MAX_VALUE / 10 && i > 7)) return 0;
//            if (newNum < Integer.MIN_VALUE/10 || (newNum == Integer.MIN_VALUE / 10 && i < -8)) return 0;
            newNum = newNum*10+i;
        }

        return (int) newNum == newNum ? (int) newNum : 0;
    }
    public static void main(String[] args){
        System.out.println(solution(153426578));
    }
}
