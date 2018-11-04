package easyProblem.missingNumber;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for(int i=0;i<nums.length;i++){
            missing=missing+i;
            missing = missing-nums[i];
        }
        return missing;
    }

    public int missingNumber2(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int s=0;
        for(int x: nums) {
            s +=x;
        }
        return (sum-s);
    }
    public static void main(String args){

    }
}
