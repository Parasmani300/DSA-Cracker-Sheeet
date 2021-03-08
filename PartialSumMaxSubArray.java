public class PartialSumMaxSubArray{
    public static int maxsum(int[] arr)
    {
        int n = arr.length;
        int[] S = new int[n];

        S[0] = arr[0];
        for(int i = 1;i<n;i++)
        {
            S[i] = S[i-1] + arr[i];
        }

        int minSum = 0;
        int ans = arr[0];

        for(int i = 0;i<n;i++)
        {
            if(S[i] - minSum >  ans)
            {
                ans = S[i] - minSum;
            }

            if(S[i] < minSum){
                minSum = S[i];
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int ans = maxsum(arr);
        System.out.print(ans);
    }
}