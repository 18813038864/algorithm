package minCoin;

public class MinCoin {
	public static void main(String args[]){
		int[] coins = {1,3,5};
		int sum = 11;
		int [] dp = new int[12];
		
		for(int i = 0;i<=sum;i++){
			dp[i] = i;//假设存在1元硬币，那么i元最多需要i个1元硬币
		}
		
		for(int i = 0;i<=sum;i++){
			for(int j = 0;j<coins.length;j++){
				if(i>=coins[j]&&dp[i-coins[j]]+1<dp[i]){//银币的值小于i元，并且dp[i] = min{dp[i-vj]+1},vj指第j个银币的面值
					dp[i] = dp[i-coins[j]]+1;
				}
			}
		}
		
		System.out.println("the min coin number is:"+dp[sum]);
	}
}
