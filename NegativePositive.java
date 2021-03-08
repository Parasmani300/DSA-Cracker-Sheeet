// Move all negative number to begining and all positive number to end with constant space
public class NegativePositive{
    public static void nge_pos_quick(int[] arr){
        int n = arr.length;
        int j = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] < 0){
                if(i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1,2,-3,4,5,6,-7,8,9};
        nge_pos_quick(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}