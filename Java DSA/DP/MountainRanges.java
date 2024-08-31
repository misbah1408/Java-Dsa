public class MountainRanges {
    public static int mountainRange(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                int inside = dp[j-1];
                int outside = dp[i-j];
                dp[i] += inside * outside;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(mountainRange(n));
    }
}
