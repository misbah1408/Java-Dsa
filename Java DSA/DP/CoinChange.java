public class CoinChange {
    public static void printDp(int[][] dp) {
        for (int[] dp1 : dp) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp1[j] + " ");
            }
            System.out.println();
        }
    }

    public static int coinChange(int[] coins, int sum) {
        int n = coins.length;
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= sum; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        printDp(dp);
        return dp[n][sum];
    }

    public static int coinChange1D(int[] coins, int sum) {
        int n = coins.length;
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for (int i = 1; i <= sum; i++) {
            for (int j = 0; j < n; j++) {
                if (coins[j] <= i) {
                    dp[i] += dp[i - coins[j]];
                }
            }
        }
        for(int i=0; i<dp.length; i++){
            System.out.print(dp[i]+" ");
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        int[] coins = { 2, 5, 3, 6 };
        int sum = 10;
        System.out.println(coinChange(coins, sum));
        System.out.println(coinChange1D(coins, sum));
    }
}
