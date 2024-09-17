public class MCM {
    public static void print(int[][] dp){
        for (int[] dp1 : dp) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(((dp1[j] < 10) ? "0"+ dp1[j] : dp1[j]) + " ");
            }
            System.out.println();
        }
    }
    public static int mcmRec(int[] arr, int i, int j){
        if(i == j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k = i; k<=j-1; k++){
            int cost1 = mcmRec(arr, i, k);
            int cost2 = mcmRec(arr, k+1, j);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int cost = cost1 + cost2 + cost3;
            ans = Math.min(ans, cost);
        }
        return ans;
    }
    public static int mcmMemo(int[] arr, int[][] dp, int i, int j){
        if(i == j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for(int k = i; k<=j-1; k++){
            int cost1 = mcmRec(arr, i, k);
            int cost2 = mcmRec(arr, k+1, j);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int cost = cost1 + cost2 + cost3;
            ans = Math.min(ans, cost);
        }
        
        return dp[i][j] = ans;
    }
    public static int mcmTab(int[] arr){
        int n = arr.length;
        int[][] dp = new int[n][n];

        for(int i=0; i<n; i++){
            dp[i][i] = 0;
        }
        for(int l=2; l<=n-1; l++){
            for(int i=1; i<=n-l; i++){
                int j = i+l-1;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = i; k<=j-1; k++){
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];
                    int cost = cost1 + cost2 + cost3;
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        print(dp);
        return dp[1][n-1];
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
        int n = arr.length;
        System.out.println(mcmRec(arr,1, n-1));
        int dp[][] = new int[n][n];
        // fill dp with -1
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(mcmMemo(arr, dp, 1, n-1));
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(mcmTab(arr));
    }
}
