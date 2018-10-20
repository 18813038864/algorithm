package easyProblem.numberOf1Bit;

public class NumberOf1Bit {
    public static  int hammingWeight(int n) {
        int cnt = 0;
        for (int i = 1;i<=32;i++){
            if ((n&1)==1){
                cnt++;
            }
            n = n>>>1;
        }
        return cnt;
    }

    public int hammingWeight2(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt = cnt + (n & 1);
            n = n >>> 1;
        }
        return cnt;
    }

    /*
       n为奇数(n的二进制表示的末位为1)：
    n:       xxxxxxxx1
    n-1:     xxxxxxxx0
    n&(n1-): xxxxxxxx0
    相当于去掉最右边的一个1。

    n为偶数且不等于0(n的二进制表示的末位为0)：
    n:       xxxxx1000
    n-1:     xxxxx0111
    n&(n1-): xxxxx0000
    也是相当于去掉最右边的一个1。
     */
    public int hammingWeight3(int n) {
        int count = 0;
        while (n != 0) {
            count += 1;
            n = n & (n - 1);
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(hammingWeight(3));
    }
}
