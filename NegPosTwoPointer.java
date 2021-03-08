public class NegPosTwoPointer{
    public static void extrct_neg_pos(int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right)
        {
            if(arr[left] > 0 && arr[right] < 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            } 

            else if(arr[left] < 0 && arr[right] < 0){
                left++;
            }

            else if(arr[left] < 0 && arr[right] > 0){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1,2,-3,4,5,6,-7,8,9};
        extrct_neg_pos(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}