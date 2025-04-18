class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for(int i=0; i < dp.length; i++){
            dp[i] = amount + 1;
        }
        dp[0] = 0;

        for(int  coin : coins) {
            for(int j = coin; j < dp.length; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin] + 1);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}