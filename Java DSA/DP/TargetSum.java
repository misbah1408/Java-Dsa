public class TargetSum {
    public static void printDp(boolean[][] dp){
        for (boolean[] dp1 : dp) {
            for (int j = 0; j < dp[0].length; j++) {
                if(dp1[j]){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static boolean targetSum(int[] numbers, int target) {
        int n = numbers.length;
        boolean[][] dp = new boolean[n + 1][target + 1];
        
        // Initialize the dp table
        dp[0][0] = true;  // Sum of 0 is always possible with 0 elements
    
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                if (j < numbers[i - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - numbers[i - 1]];
                }
            }
        }

        printDp(dp);
        return dp[n][target];
    }
    

    public static void main(String[] args) {
        int[] nums = { 4, 2, 7, 1, 3 };
        int target = 10;
        System.out.println(targetSum(nums, target));
    }
}
