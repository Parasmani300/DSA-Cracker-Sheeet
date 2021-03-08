public class MaximumSumSubArray{
    public static int subarraysum(int[] arr)
    {
        int n = arr.length;
        int sum = 0;
        int ans = arr[0];

        for(int i = 0;i<n;i++){
            sum = sum + arr[i];

            if(sum > ans){
                ans = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};

        int ans = subarraysum(arr);
        System.out.print(ans);

    }
}