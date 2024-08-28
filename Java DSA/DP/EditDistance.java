public class EditDistance {
    public static void print(int[][] dp){
        for (int[] in : dp) {
            for (int i : in) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static int editDistance(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                if(i==0) dp[i][j] = j;
                else if(j==0) dp[i][j] = i;
                else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    int add = dp[i-1][j];
                    int remove = dp[i][j-1];
                    int replace = dp[i-1][j-1];
                    dp[i][j] = 1 + Math.min(Math.min(add, remove), replace);
                }
            }
        }
        print(dp);
        return dp[n][m];
    }
    public static int stringConversion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        
        for (int j = 0; j <= m; j++) {
            dp[0][j] = 0;
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    int num1 = dp[i-1][j];
                    int num2 = dp[i][j-1];
                    dp[i][j] = Math.max(num1, num2);
                }
            }
        }
        
        return dp[n][m];
    }
    public int minOperations(String s1, String s2) { 
	    int lcs = stringConversion(s1, s2);
	    
	    int del = s1.length() - lcs;
	    int add = s2.length() - lcs;
	    
	    return del + add;
	} 
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "sbd";
        System.out.println(editDistance(s1, s2));

        // String conversion
        String s3 = "pear";
        String s4 = "sea";
        System.out.println(stringConversion(s3, s4));
    }
}
