package easyProblem.containsDuplicate;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i+1]==nums[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

    }
}
