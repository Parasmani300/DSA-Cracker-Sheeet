public class MergeSortedArray{
    public static int merge(int[] arr1,int[] arr2)
    {
        int m = arr1.length;
        int n = arr2.length;

        // loop through arr2 n-1 -> 0
        for(int i = n-1; i >= 0;i--)
        {
            int j,last = arr1[m-1];
            for(j = m-2;j>= 0 && arr1[j] > arr2[i];j--){
                arr1[j+1] = arr1[j];
            }

            if( j != m-2 || last > arr2[i]){
                arr1[j+1] = arr1[i];
                arr2[i] = last;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}