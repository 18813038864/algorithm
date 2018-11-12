package easyProblem.guessNumberHigherOrLower;

class GuessGame{
    public static int guess(int n){
        if (n==6){
            return 0;
        }
        if (n<6){
            return -1;
        }else {
            return 1;
        }
    }
}
public class GuessNumberHigherOrLower extends GuessGame{
    public static  int guessNumber(int n) {
        int temp=-1;
        int high = n;
        int low = 0;
        while(temp!=0){
            n = low+(high-low)/2;

            temp = guess(n);
            if(temp==-1){
                low = n+1;
            }else{
                high = n-1;
            }
        }
        return n;
    }

    public static void main(String[] args){
        System.out.println(guessNumber(10000));
    }
}
