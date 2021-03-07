public class MinMax2{
    static class Pair{
        int min;
        int max;
    }

    static Pair getMinMax(int[] arr,int low,int high)
    {
        Pair minmax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();
        int mid;

        if(low == high){
            minmax.min = arr[low];
            minmax.max = arr[low];
            return minmax;
        }

        if(low+1 == high)
        {
            if(arr[low] > arr[high]){
                minmax.min = arr[high];
                minmax.max = arr[low];
            }else{
                minmax.min = arr[low];
                minmax.max = arr[high];
            }

            return minmax;
        }

        mid = (low+high)/2;
        mml = getMinMax(arr,low,mid);
        mmr = getMinMax(arr,mid+1,high);

        if(mml.min < mmr.min){
            minmax.min = mml.min;
        }else{
            minmax.min = mmr.min;
        }

        if(mml.max > mmr.max){
            minmax.max = mml.max;
        }else{
            minmax.max = mmr.max;
        }

        return minmax;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,5,8,23,55,11};

        Pair p = getMinMax(arr,0,arr.length-1);
        System.out.println(p.min);
        System.out.println(p.max);
    }
}