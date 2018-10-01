package easyProblem.removeDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {

    public static  int removeDuplicates(int[] nums){
        if (nums.length==0){
            return 0;
        }
        int i=1;
        int j = 0;
        while (i<nums.length){
            if (nums[i]!=nums[j]){
                j++;
                nums[j] = nums[i];
            }
            i++;
        }
        return j+1;
    }
    public static void main(String[] args){
        int[] nums = {1,1,2};
        int len = removeDuplicates(nums);
        for (int i = 0;i<len;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
