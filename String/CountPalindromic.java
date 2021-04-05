public class CountPalindromic{
    public static int countpallin(String s)
    {
        int n = s.length();

        int[][] dp = new int[n][n];
        int count = 0;
        for(int i = 0;i<n;i++){
            dp[i][i] = 1;
            count++;
        }

        // for(int i = 0;i<n-1;i++){
        //     if(s.charAt(i) == s.charAt(i+1)){
        //         dp[i][i+1] = 1;
        //         count++;
        //     }
        // }

        int k = 0;
        for(k = 2;k<=n;k++){
            for(int i = 0;i<=n-k;i++){
                int j = i+k-1;
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i][j-1] + dp[i+1][j] + 1;
                }else{
                    dp[i][j] = dp[i][j-1] + dp[i+1][j] - dp[i+1][j-1];
                }
            }
        }

        
        return dp[0][n-1];
    }
    public static void main(String[] args) {
        String s = "aab";
        int ans = countpallin(s);

        System.out.println(ans);

    }
}