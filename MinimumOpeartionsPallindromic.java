public class MinimumOperationsPallindromic{
    public static void minOperatios(int[] arr)
    {
        int ans = 0;

        for(int i = 0,j=arr.length-1;i<=j;)
        {
            if(arr[i] == arr[j]){
                i++;
                j--; 
            }
            else if(arr[i] > arr[j]){
                j--;
                arr[j] = arr[j] + arr[j+1];
                ans++;
            }els{
                i++;
                arr[i] = arr[i] + arr[i-1];
                ans++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        
    }
}