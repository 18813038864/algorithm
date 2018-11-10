package easyProblem.powerOfThree;

public class PowerOfThree {
    public static  boolean isPowerOfThree(int n) {
//        if (n<1){
//            return false;
//        }
//        return isPower(n);
        return n > 0 && (n == 1 || n % 3 == 0 && isPowerOfThree(n /3));
    }
    public static boolean isPower(int n){
        if (n==1){
            return true;
        }
//        if (n%3!=0){
//            return false;
//        }else {
//            return isPower(n/3);
//        }

        return n%3==0&&isPower(n/3);
    }

    public static  boolean isPowerOfThree2(int n) {
        if (n<1){
            return false;
        }

        while(n>1){
            if (n%3!=0){
                return false;
            }else {
                n = n/3;
            }
        }

        return true;
    }


    public static void main(String[] args){
        isPowerOfThree(27);
    }
}
