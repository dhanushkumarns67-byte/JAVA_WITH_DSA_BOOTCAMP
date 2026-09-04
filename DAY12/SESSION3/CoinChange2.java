package DAY12.SESSION3;

public class CoinChange2 {
    public static int unboundedKnapsackDp(int amount, int[] coins){
        int[] dp = new int[amount + 1];
        dp[0] = 1; 
        for(int c:coins){
            for(int i=c; i<=amount; i++){
                dp[i] = dp[i] + dp[i-c]; 
            }
        }
        return dp[amount];
    }
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        System.out.println(unboundedKnapsackDp(amount, coins));
    }
}
