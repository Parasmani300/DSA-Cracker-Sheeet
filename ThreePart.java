public class ThreePart{
    public static void three(int[] arr,int low,int up)
    {
        int j = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            if(arr[i] < low){
                if(i != j)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

                j++;
            }
        }

        int k = n - 1;
        for(int i = n-1;i>=j;i--){
            if(arr[i] > up){
                if(i != k){
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }

                k--;
            }
        }

        for(int i : arr){
            System.out.print(i + " ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8,12,17,1,6};
        int up = 6;
        int low = 2;

        three(arr,low,up);
    }
}