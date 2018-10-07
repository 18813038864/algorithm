package easyProblem.bestTimetoBuyandSellStockTwo;

public class BestTimetoBuyandSellStockTwo {
    public static int maxProfit(int[] prices) {
        if (prices==null) return 0;
        int max = 0;
        for (int i = 0;i<prices.length-1;i++){
            if (prices[i+1]>prices[i]){
                max += prices[i+1]-prices[i];
            }
        }

        return max;
    }
    public int maxProfit2(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
    public static void main(String[] args){
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
}
