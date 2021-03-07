// Sort an array of 0s 1s and 2s

public class CountingSort{
    public static int maximum(int[] arr)
    {
        int max = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    public static void sort(int[] arr)
    {
        int max = maximum(arr);
        int[] narr = new int[max+1];
        for(int i = 0;i< arr.length;i++){
            narr[arr[i]]++;
        }

        int count = 0;
        for(int i = 0;i<narr.length;i++){
            if(narr[i] != 0){
                for(int j = 0 ;j< narr[i];j++)
                    arr[count++] = i;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {0,2,1,2,0};
        sort(arr);
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}