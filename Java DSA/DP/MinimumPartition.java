public class MinimumPartition {
    public static void print(int[][] dp){
        for (int[] dp1 : dp) {
            for (int j = 0; j<dp[0].length; j++) {
                System.out.print(dp1[j] + " ");
            }
            System.out.println();
        }
    }
    public static int minimumPartition(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int W = sum/2;
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - arr[i - 1]] + arr[i - 1]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        print(dp);
        int sum1 = dp[n][W];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 6, 11, 5 };
        System.out.println(minimumPartition(arr));
    }
}
