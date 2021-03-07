public class Sort012{
    // Dutch National Flag Algorithm
    public static void sort_012(int[] arr)
    {
        int lo = 0;
        int hi = arr.length - 1;
        int mid = 0;
        int temp = 0;

        while(mid <= hi){
            switch(arr[mid])
            {
                case 0:
                    {
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;
                    }
                case 1:
                    {
                        mid++;
                        break;
                    }
                case 2: 
                    {
                        temp = arr[mid];
                        arr[mid] = arr[hi];
                        arr[hi] = temp;
                        hi--;
                        break;
                    }
                 
            }
        }

    }
    public static void main(String[] args)
    {
        int[] arr = {0,1,2,0,0,0,1,1,2,0};
        sort_012(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
}