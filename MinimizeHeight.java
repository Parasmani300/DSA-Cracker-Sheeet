import java.util.*;
public class MinimizeHeight {
    
    static int getMinDiff(int[] arr, int n, int k) {
        if(n == 1)
            return 0;
        
        Arrays.sort(arr);
        
        int ans = arr[n-1] - arr[0];
        
        int small = arr[0] + k;
        int big = arr[n-1] - k;
        
        if(small > big){
            int temp = small;
            small = big;
            big = temp;
        }
        
        for(int i = 1;i<n-1;i++)
        {
            int add = arr[i] + k;
            int sub = arr[i] - k;
            
            if(sub >= small || add <= big)
                continue;
            
            if(big -  sub <= add - small){
                small = sub;
            }else{
                big =  add;
            }
        }
        
        return Math.min(ans,big-small);
    }

    public static void main(String[] args){
        int[] arr = {1,5,8,10};
        int n = arr.length;
        int k = 2;

        int ans = getMinDiff(arr,n,k);
        System.out.print(ans);
    }
}