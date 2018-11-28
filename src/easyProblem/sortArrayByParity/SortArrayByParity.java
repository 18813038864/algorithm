package easyProblem.sortArrayByParity;

public class SortArrayByParity {
	
	public static boolean isEven(int a){   
	    if((a&1) != 1){
	        return true;   
	    }   
	    return false;   
	}
	
	public static int[] solution(int[] A){
		
		int[] result = new int[A.length];
		for(int i=0,j = 0,k = A.length-1;i<A.length;i++){
			if(isEven(A[i])){			
				result[j] = A[i];
				j++;
			}else{
				result[k] = A[i];
				k--;
			}
		}
		return result;
		
	}
	 public static int[] sortArrayByParity(int[] A) {
        int low = 0, high = A.length - 1;
        int cnt = 0;
        while(low < high) {
            while(low < high && (A[low] & 1) == 0)
        	{
            	low++;
            	cnt++;
        	}
            while(low < high && (A[high] & 1) == 1)
        	{
            	high--;
            	cnt++;
            }
            if(low < high){
            	swap(A, low, high);
            	low++;
            	high--;
            	cnt++;
            }
            	
        }
        System.out.println(cnt);
        return A;
    }
	    
    public static void  swap(int[] A, int i, int j) {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }
	public static void main(String[] args){
		int[] A ={3,1,2,4};
//		solution(A);
		int[] result = sortArrayByParity(A);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

}
