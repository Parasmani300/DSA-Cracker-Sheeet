public class SecondLargest{
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,88,44,55,0,34};

        int max,max2;
        max = arr[0];
        max2 = -99999;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max)
                max = arr[i];
        }

        for(int i = 0;i< arr.length;i++)
        {
            if(arr[i] > max2 && arr[i] != max){
                max2 = arr[i];
            }
        }

        System.out.print(max2);
        
    }
}