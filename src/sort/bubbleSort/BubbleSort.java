package sort.bubbleSort;

import java.util.Arrays;

public class BubbleSort {
	public static void sort(int[] arr){
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args){
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
		sort(a);
	}
}
