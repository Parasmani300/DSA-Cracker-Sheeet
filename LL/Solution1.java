import java.util.*;

public class Solution1{
    static void replaceNWithEvenSquares(int[] arr,int arr_len,int N)
    {
        for(int i = 0;i<arr_len;i++)
        {
            if(arr[i] == N){
                arr[i] = 0;
                for(int  j = i+1;j<arr_len;j++){
                    arr[i] = arr[i] + (arr[j]%2 == 0?arr[j]*arr[j]:0);
                }
            }
        }

        for(int i = 0;i<arr_len;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr_len = sc.nextInt();
        int[] arr = new int[arr_len];
        // int[] arr = {1,1,3,6,7,3,8,5,4};
        for(int i = 0;i<arr_len;i++)
        {
            arr[i] = sc.nextInt();
        }

        int N = sc.nextInt();
        // int arr_len = arr.length;

        replaceNWithEvenSquares(arr,arr_len,N);
    }
}