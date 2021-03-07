// Find the minimum and maximum element in the array with the minimum numner of comparsion
public class MinMax{
    int min;
    int max;

    public void mnm(int[] arr)
    {
        // O(n)
        this.min = arr[0];
        this.max = arr[0];
        for(int  i = 0;i< arr.length;i++)
        {
            if(arr[i] > this.max){
                this.max = arr[i];
            }

            if(arr[i] < this.min){
                this.min = arr[i];
            }
        }

    }


    public void mnm_recur(int[] arr,int low,int high){
        // Complexity --> O(n)
        // Tournament Method
        

    }
    public static void main(String[] args)
    {
        MinMax minmax = new MinMax();
        int[] arr = {1,4,6,2,8,3};
        minmax.mnm(arr);
        System.out.println(minmax.min);
        System.out.println(minmax.max);

    }
}