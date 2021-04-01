public class LongestCommonSubSequence{
    public static int lcs_dynamic(char[] s1,char[] s2,int m,int n)
    {
        int[][] dp = new int[m+1][n+1];

        for(int i = 0;i<=m;i++)
        {
            for(int j = 0;j<=n;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else if(s1[i-1] == s2[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
    }
    public static void main(String[] args) {
        String s1 = "longest";
        String s2 = "stone";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int m = c1.length;
        int n = c2.length;

        int ans = lcs_dynamic(c1,c2,m,n);
        System.out.println(ans);
    }
}