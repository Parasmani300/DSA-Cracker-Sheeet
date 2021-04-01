public class LongestPallindromicString{
    public static String longest(String s)
    {
        int[][] dp = new int[s.length()][s.length()];

        int maxLength = 1;
        int start = 0;
        // Make All substring of length 1 to be a pallindrome
        for(int i = 0;i<s.length();i++){
            dp[i][i] = 1;
        }

        // Cjecking pallindrome of length 2
        int count = 0;
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = 1;
                if(count == 1){
                    start = i;
                    maxLength = 2;
                }
            }else{
                dp[i][i+1] = 2;
            }
        }

        int n =  s.length();

        for(int k = 3;k<=s.length();++k)
        {
            for(int i = 0;i<n-k+1;i++){
                int j = i+k-1;
                if(dp[i+1][j-1] == 1 && s.charAt(i) == s.charAt(j)){
                    dp[i][j] = 1;

                    if(k > maxLength)
                    {
                        maxLength = k;
                        start = i;
                    }

                }else{
                    dp[i][j] = 2;
                }
            }
        }


        return s.substring(start,start+maxLength);

    }
    public static void main(String[] args) {
        String s = "aaaabbaa";
        String ans = longest(s);
        System.out.println(ans);
    }
}