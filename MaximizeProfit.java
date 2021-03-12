public class MaximizeProfit{
    public static int maxProfit(int[] arr)
    {
        // The points of interest are the peaks and valleys in the given graph. 
        // We need to find the largest peak following the smallest valley. We can maintain two variables - 
        // minprice and maxprofit corresponding to the smallest valley and maximum profit (maximum difference between selling price
        //  and minprice) obtained so far respectively.

        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] < minprice)
            {
                minprice = arr[i];
            }else if(arr[i] - minprice >= maxprofit){
                maxprofit = arr[i] - minprice;
            }
        }

        return maxprofit;
    }
    public static int naive_approach(int[] arr,int start,int end){
         
        if(end <= start)
            return 0;

        int global_max = 0;
        for(int i = start;i<=end;i++){
            for(int j = i+1;j<=end;j++){
                if(arr[j] > arr[i])
                {
                    int current_profit = arr[j] - arr[i] + naive_approach(arr,start,i-1) + naive_approach(arr,j+1,end);

                    global_max = Math.max(global_max,current_profit);
                }
            }
        }

        return global_max;
    }
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};

        int ans = maxProfit(price);
        System.out.println(ans);
    }
}