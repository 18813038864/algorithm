package easyProblem.moveZeroes;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[cur];
                nums[cur] = temp;
                lastNonZeroFoundAt++;
            }
        }
    }

    public static void main(String[] args){

        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
    }
}
