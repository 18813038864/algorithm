package easyProblem.houseRobber;

public class HouseRobber {

//    money = 偷第i家店=偷i-2家店时的最优解+偷这家店的价值
//    maxMoney = 不偷第i家店=偷i-1店的价值（历史最优）
//    money 与maxMoney 中的最大值偷这家点的最优解
    public int rob(int[] nums) {
        int money = 0;//偷上上一家的最优解
        int maxMoney =0;//偷上家的最优解
        int temp = 0;
        for (int i= 0;i<nums.length;i++){
            temp = maxMoney;
            maxMoney = Math.max(money+nums[i],maxMoney);
            money = temp;
        }
        return maxMoney;
    }
    public static void main(String[] args){

    }
}
