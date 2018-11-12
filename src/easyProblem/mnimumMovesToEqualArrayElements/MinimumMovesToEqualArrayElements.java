package easyProblem.mnimumMovesToEqualArrayElements;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
//        sum + m * (n - 1) = x * n
//        x = minNum + m
//        sum - minNum * n = m
        int sum = 0, min = nums[0];
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(nums[i] < min) min = nums[i];
        }
        return sum - min*nums.length;
    }
    public static void main(String[] args){

    }
}
