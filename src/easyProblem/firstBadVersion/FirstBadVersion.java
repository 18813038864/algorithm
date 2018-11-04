package easyProblem.firstBadVersion;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int first = 1;
        int end = n;
        while(first<end){

            int mid =first+ (end-first)/2;

            if(isBadVersion(mid)){
                end = mid;
            }else{
                first = mid+1;
            }
        }

        return first;
    }

    private boolean isBadVersion(int mid) {
        //todo
        return false;
    }

    public static void main(String[] args){

    }
}
