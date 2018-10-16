package easyProblem.majorityElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElemen1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public int majorityElement2(int[] nums) {
        int majorityCount = nums.length/2;
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num)+1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > majorityCount) {
                return entry.getKey();
            }
        }

        return -1;
    }

    //把最多的元素（>n/2）与其他元素进行抵消，剩下的就是最多的那个元素
    public static int majorityElement3(int[] nums) {

        int count =0;
        int result=0;

        for (int i=0;i<nums.length;i++) {
            if (count==0) {
                result = nums[i];
                count=1;
            } else if (nums[i]==result) {
                count++;
            } else {
                count--;
            }
        }

        // 题目说一定会存在一个majority, 否则这个验证步骤不能省略
//        int verify = 0;
//        for(int num : nums) {
//            if(num == result) {
//                verify++;
//            }
//        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = new int[]{2,2,1,2,1,2,2,3,2};
        System.out.println(majorityElement3(nums));
    }
}
