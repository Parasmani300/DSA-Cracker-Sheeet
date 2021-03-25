public class MinimumSwap{
    public static int minSwap(int[] arr,int n,int k)
    {
         // COunt of the occurence of element less than equal to k
         int count = 0;
         for(int i = 0;i<n;i++)
             if(arr[i] <= k)
                 count++;
         
         // Using Sliding window
         // Counting the occurence of the bad element in the current window
         int bad = 0;
         for(int i = 0;i< count;i++){
             if(arr[i] > k)
                 bad++;
         }
         
         // intialinzg the minumum swap required
         // assuming the swap in the first window
         // to be minimum
         int ans = bad;
         // int j = 0;
         // Finding theminum numner of swap required
         for(int i = 0,j = count;j<n;++i,++j)
         {
             // We are leaving the bad elemnt out the window
             // so deacresing the counter of bad
             if(arr[i] > k)
                 bad--;
             
             // We are including the bad elemnt in the window
             if(arr[j] > k)
                 bad++;
                 
             ans = Math.min(ans,bad);
         }
         
         return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,3};
        int k = 3;

        int ans = minSwap(arr,arr.length,k);

        System.out.println(ans);
        
    }
}