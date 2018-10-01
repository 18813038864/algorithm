package palindromeNumber;

import reverseInteger.ReverseInteger;

public class PalindromeNumber {
    public static boolean solution(int num){
        if (num<0){
            return false;
        }
        int newNum = reverseInteger(num);
        return newNum==num;
    }
    public static int reverseInteger(int num){
        long newNum = 0;
        while (num!=0){
            int i = num%10;
            num = num/10;
            newNum = newNum*10+i;
        }
        return (int) newNum == newNum ? (int) newNum : 0;
    }
    public static void main(String[] args){
        System.out.println(solution(-121));
    }
}
