package easyProblem.removeElement;

public class RemoveElement {
    public static int removeElement(int[] nums,int val){
        if (nums==null||nums.length==0){
            return 0;
        }
        int j = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i]!=val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static int removeElement2(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int len = removeElement(nums,5);
        for (int i=0;i<len;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
