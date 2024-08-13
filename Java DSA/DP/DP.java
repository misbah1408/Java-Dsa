
import java.util.Arrays;

public class DP {
    static int fib(int n, int[] dp){
        if(n == 0 || n == 1) return n;
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = fib(n-1, dp) + fib(n-2, dp);
        return dp[n];
    }
    static int fibTabulation(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<n+1; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    static int countWays(int n, int[] ways){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(ways[n] != -1){
            return ways[n];
        }
        ways[n] = countWays(n-1, ways) + countWays(n-2, ways);
        return ways[n];
    }
    static int countWaysTabulation(int n){
        int[] ways = new int[n+1];
        ways[0] = 1;
        for(int i=1; i<=n; i++){
            if(i == 1){
                ways[i] = 1;
            }else{
                ways[i] = ways[i-1] + ways[i-2];
            }
        }
        return ways[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        System.out.println(fib(n, dp));
        System.out.println(fibTabulation(n));
        int[] ways = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println(countWays(n, ways));
        System.out.println(countWaysTabulation(n));
    }
}