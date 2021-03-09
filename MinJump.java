import java.util.*;

public class MinJump
{
    public static int minjump_greedy(int[] arr)
    {
        int previous = 0;
        int current = 0;
        int jumps = 0;

        for(int i = 0;i< arr.length;i++){
            if( i  > previous){
                jumps = jumps + 1;
                previous = current;
            }

            current = Math.max(current, i + arr[i]);
        }

        return jumps;
    }

    public static int minjump(int[] arr){
        int[] dp = new int[arr.length];
        for(int i = 0;i<dp.length;i++)
            dp[i] = Integer.MAX_VALUE;

        dp[0] = 0;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j< Math.min(i+arr[i]+1,arr.length);j++){
                dp[j] = Math.min(dp[j],1+dp[i]);
            }   
        }

        return dp[arr.length-1];
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,2,6,7,6,8,9};

        int ans =  minjump(arr);
        System.out.println(ans);

        int ans1 = minjump_greedy(arr);
        System.out.println(ans1);
    }
}