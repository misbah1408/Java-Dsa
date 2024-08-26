public class LCS {
    public static void print(int[][] dp) {
        for (int[] in : dp) {
            for (int i : in) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static int lcsRecurrsion(String s1, String s2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return lcsRecurrsion(s1, s2, n - 1, m - 1) + 1;
        } else {
            int ans1 = lcsRecurrsion(s1, s2, n - 1, m);
            int ans2 = lcsRecurrsion(s1, s2, n, m - 1);
            return Math.max(ans1, ans2);
        }
    }
    public static int lcsMemoization(String s1, String s2, int n, int m, int[][] dp) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return dp[n][m] = lcsTabulation(s1, s2, n - 1, m - 1) + 1;
        } else {
            int ans1 = lcsTabulation(s1, s2, n - 1, m);
            int ans2 = lcsTabulation(s1, s2, n, m - 1);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }
    public static int lcsTabulation(String s1, String s2, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        print(dp);
        return dp[n][m];
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        for(int i=0; i<=n;i++){
            for(int j=0; j<=m; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(lcsRecurrsion(s1, s2, n, m));
        System.out.println(lcsMemoization(s1, s2, n, m, dp));
        System.out.println(lcsTabulation(s1, s2, n, m));
    }
}
