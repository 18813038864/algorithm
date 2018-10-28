package easyProblem.containsDuplicateTwo;

import java.util.*;

public class ContainsDuplicateTwo {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        //方法2：HashMap(别人的思路)
        //HashMap的put方法，若put原先没有的键值对，则put方法返回的是null，若put的键值对
        //的键原先已经存了值了，则put方法返回的是原先的value
        //遍历数组，将元素与索引作为键值对put进去，如果put返回的值不为null,则说明当前元素
        //出现重复，并且需要满足当前索引与之前的索引值之间差值<=k
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++) {
            Integer old=hm.put(nums[i], i);
            if(old!=null && i-old<=k) {return true;}
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,0,1,1};
        System.out.println(containsNearbyDuplicate(nums,1));
    }
}
