package easyProblem.singleNumber;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int a = 0;
        for (int i = 0;i<nums.length;i++){
            a^=nums[i];
        }
        return a;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,4,2,1,3,3};
        System.out.println(singleNumber(nums));
    }
}
