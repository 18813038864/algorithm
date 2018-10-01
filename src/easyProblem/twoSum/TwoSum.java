package easyProblem.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	//夹逼 index因为排序后会变乱
	public static int[] solution2(int[] arr,int target){
		int[] res = new int[2];
		if(arr==null||arr.length<2){
			return null;
		}
		Arrays.sort(arr);
		int l = 0;
		int r = arr.length-1;
		while(l<r){
			if(arr[l]+arr[r]==target){
				res[0] = l;
				res[1] = r;
				return res;
			}else if(arr[l]+arr[r]>target){
				r--;
			}else{
				l++;
			}
		}
		return null;
	}
	//hash
	public static int[] solution1(int[] arr,int target){
		int[] res = new int[2];
		if(arr==null||arr.length<2){
			return null;
		}
		Map<Integer,Integer> numM = new HashMap<>();
		for(int i = 0;i<arr.length;i++){
			if(numM.containsKey(target-arr[i])){
				res[0] = numM.get(target-arr[i]);
				res[1] = i;
				return res;
			}
			numM.put(arr[i], i);
		}
		return null;
	}
	public static void main(String args[]){
		int[] arr = {1,5,7,11,8,9,12};
		int target = 14;
		System.out.println("solution1");
		System.out.println(Arrays.toString(solution1(arr,target)));
		System.out.println("solution2");
		System.out.println(Arrays.toString(solution2(arr,target)));
	}
}
