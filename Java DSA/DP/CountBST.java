public class CountBST {
    public static int countBST(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                int left = dp[j-1];
                int right = dp[i-j];
                dp[i] += left * right;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countBST(n));
    }
}
