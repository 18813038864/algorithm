package easyProblem.bestTimetoBuyandSellStock;

public class BestTimetoBuyandSellStock {

    public static int maxProfit(int[] prices) {
        int max = 0;
        if (prices==null||prices.length<2){
            return max;
        }

        int i = 0;
        int j = 1;
        while (j<prices.length){
            int tmp = prices[j]-prices[i];
            if (tmp<0){
                i = j;
                j++;
            }else {
                j++;
                max = Math.max(max,tmp);
            }

        }

        return max;
    }
    public int maxProfit2(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (minPrices > price) {
                minPrices = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrices);
            }
        }
        return maxProfit;
    }

    public static int maxProfit3(int[] prices) {
        int max=0;
        int minPrice=Integer.MIN_VALUE;
        for (int price : prices){
            max = Math.max(max, minPrice+price);
            minPrice = Math.max(minPrice, -price);
        }
        return max;
    }
    public static void main(String[] args){
        int[] prices = new int[]{2,3,1,4,5};
        System.out.println(maxProfit3(prices));

    }
}
