public class Union{
    public static boolean element_not_in_arr(int[] narr,int n){
        for(int i = 0;i<narr.length;i++){
            if(narr[i] == n){
                return false;
            }
        }
        return true;
    }

    public static int[] union(int[] arr1,int[] arr2)
    {
        int[] narr = new int[arr1.length + arr2.length];

        int i;
        for(i = 0;i<arr1.length;i++){
            narr[i] = arr1[i];
        }

        for(int j=0;j<arr2.length;j++)
        {
            if(element_not_in_arr(narr,arr2[j])){
                narr[i++] = arr2[j];
            }
        }

        return narr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3};

        int[] na = union(arr1,arr2);
        for(int i : na){
            if(i != 0)
            System.out.print(i+" ");
        }
    }
}