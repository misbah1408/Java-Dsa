public class LCSubstring {
    public static void print(int[][] dp){
        for (int[] in : dp) {
            for (int i : in) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static int longestCommonSubstring(String s1, String s2, int n, int m){
        int[][] dp = new int[n+1][m+1];
        int max = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    max = Math.max(max, dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        print(dp);
        return max; 
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abgce";
        int n = s1.length();
        int m = s2.length();
        System.out.println(longestCommonSubstring(s1, s2, n, m));
    }
}
