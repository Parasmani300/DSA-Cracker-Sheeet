public class Solution2{
    static void swapRequired(char[] arr,int arr_len)
    {
        int numX = 0;
        for(int i = 0;i<arr_len;i++)
        {
            if(arr[i] == 'X')
            {
                numX++;

            }
        }

        int x = numX;
        int countX = 0;
        int maxX;

        for(int i =0;i<x;i++)
        {
            if(arr[i] == 'X'){
                countX++;
            }
        }

        maxX = countX;

        for(int i = 1;i<=arr_len-x;i++)
        {
            if(arr[i-1] == 'X')
            {
                countX--;
            }

            if(arr[i+x-1] == 'X'){
                countX++;
            }

            if(maxX < countX){
                maxX = countX;
            }
        }

        int ans = (x - maxX);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        char[] arr = {'X','\0','X','\0','X'};
        int arr_len = 5;

        swapRequired(arr,arr_len);
    }
}