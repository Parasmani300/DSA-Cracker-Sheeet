import java.util.*;

public class RearrangeArray{
    // Approach -1 Brute Force --> extra space O(n)
    public static void rearrange(int[] arr)
    {
       ArrayList<Integer> pos = new ArrayList<Integer>();
       ArrayList<Integer> neg = new ArrayList<Integer>();

       for(int i = 0;i<arr.length;i++){
           if(arr[i] < 0){
               neg.add(arr[i]);
           }else{
               pos.add(arr[i]);
           }
       }

       int i = 0;
       int j = 0;
       int k = 0;

       while(k < arr.length && i < neg.size() && j < pos.size()){
           if(k % 2 == 0){
               arr[k++] = neg.get(i);
               i++;
           }else{
               arr[k++] = pos.get(j);
               j++;
           }
       }


       for(int t = i;t<neg.size();t++){
           arr[k++] = neg.get(t);
       }

       for(int t = j;t<pos.size();t++){
           arr[k++] = pos.get(t);
       }


    }


    // Approach - 2 ---> O(1) extra space and time complexity O(n)
    public static void rearrange_1(int[] arr)
    {
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < 0){
                if(i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }

        // System.out.println(j);
        
        int pos = j;
        int neg = 0;
        while(pos <  arr.length && neg < pos && arr[neg] < 0){
            int temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos = pos + 1;
            neg = neg + 2;
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1,2,-3,4,5,6,-7,8,9};
        rearrange_1(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}