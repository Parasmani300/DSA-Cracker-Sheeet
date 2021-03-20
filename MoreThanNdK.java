import java.util.*;

public class MoreThanNdK{
    public static void ndk(int[] arr,int n,int k)
    {
        Dictionary d = new HashTable();

        for(int i : arr)
        {
            try {
                d.put(i,d.get(i) + 1);
            } catch (Exception e) {
                d.put(i,1);
            }
        }

        for(Enumeration e = d.keys() ; d.hasMoreElements();){
            if(e.nextElement() > (Integer)n/k){
                System.out.print(d.keys()+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,4,4};
        int k = 3;
        int n = arr.length;

        ndk(arr,n,k);
        
    }
}