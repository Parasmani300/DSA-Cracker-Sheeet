public class CountPalindromic{
    public static int countpallin(String s,int n,int[][] dp,int i,int j)
    {
        if(i > j)
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];

        if(i == j)
            return dp[i][j] = 1;
        
        if(s.charAt(i) == s.charAt(j)){
            return dp[i][j] = countpallin(s,n,dp,i+1,j) + countpallin(s,n,dp,i,j-1) + 1;
        }
        else{
            return dp[i][j] = countpallin(s,n,dp,i+1,j) + countpallin(s,n,dp,i,j-1) - countpallin(s,n,dp,i+1,j-1);
        }
    }
    public static void main(String[] args) {
        String s = "aab";

        int n = s.length();
        int[][] dp = new int[n][n];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                dp[i][j] = -1;
            }
        }

        long ans = (long)countpallin(s,n,dp,0,n-1);

        System.out.println(ans);

    }
}