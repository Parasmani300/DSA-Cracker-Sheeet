public class TrappingWater{
    public static int maxWater(int[] arr,int n)
    {
        int tot = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        
        left[0] = arr[0];
        for(int i = 1;i<n;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        
        right[n-1] = arr[n-1];
        for(int i = n-2;i>= 0;i--)
        {
            right[i] = Math.max(right[i+1],arr[i]);
        }
        
        for(int i = 0;i<n;i++){
            tot += (Math.min(left[i],right[i])-arr[i]);
        }
        
        return tot;

    }
    public static void main(String[] args) {
        int[] arr = {7,4,0,9};
        System.out.print(maxWater(arr,arr.length));
    }
}