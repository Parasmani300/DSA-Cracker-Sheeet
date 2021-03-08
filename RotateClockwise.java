public class RotateClockwise{
    public static void rotate(int[] arr)
    {
        int temp = arr[arr.length-1];
        for(int i = arr.length-1;i>0;i--)
        {
            arr[i] = arr[i-1];
        }

        arr[0] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr);

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}