class MaxProfitTwoTrans {
    public static int maxProfit(int[] prices) {
        int[] left = new int[prices.length];
        int[] right = new int[prices.length];
        
        int minprice = prices[0];
        for(int i = 1;i<prices.length;i++)
        {
            if(prices[i] < minprice)
                minprice = prices[i];
            
            left[i] = Math.max(left[i-1],prices[i]-minprice);
        }
        
        int maxprice = prices[prices.length-1];
        for(int i = prices.length-2;i>=0;i--)
        {
            if(prices[i] > maxprice)
                maxprice = prices[i];
            
            right[i] = Math.max(right[i+1],maxprice-prices[i]);
        }
        
        int maxProfit = right[0];
        for(int i = 1;i<prices.length;i++)
        {
            maxProfit = Math.max(maxProfit,left[i-1]+ right[i]);
        }
        
        return maxProfit;
     }

     public static void main(String[] args) {
         int[] prices = {3,3,5,0,0,3,1,4};

         int maxP = maxProfit(prices);
         System.out.print(maxP);
     }
}