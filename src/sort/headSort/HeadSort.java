package sort.headSort;

import java.util.Arrays;

public class HeadSort {
	public static void sort(int[] arr){
		for(int i = 0;i<arr.length-1;i++){
			buildHead(arr,arr.length-1-i);
			swap(arr,0,arr.length-1-i);
			System.out.println(Arrays.toString(arr));
		}
		
	}
	private static void buildHead(int[] arr,int lastIndex) {
		// TODO Auto-generated method stub
		for(int i = (lastIndex-1)/2;i>=0;i--){
			int k = i;
			while(2*k+1<=lastIndex){
				int biggerIndex = 2*k+1;
				if(biggerIndex<lastIndex){
					if(arr[biggerIndex]<arr[biggerIndex+1]){
						biggerIndex++;
					}
				}
				if(arr[k]<arr[biggerIndex]){
					swap(arr,k,biggerIndex);
					k = biggerIndex;
				}else{
					break;
				}
			}
		}
	}
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args){
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64};
		sort(a);
	}
}
