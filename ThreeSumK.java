import java.util.*;

public class ThreeSumK{
    public static List<List<Integer>> myfunc(int[] arr,int k)
    {
        List<List<Integer>> nl = new ArrayList<>();

        for(int i = 0;i<arr.length-2;i++)
        {
            int l = i + 1;
            int r = arr.length - 1;
            while( l < r){
                if(arr[i] + arr[l] + arr[r] == 0){
                    List<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    al.add(arr[l]);
                    al.add(arr[r]);
                    nl.add(al);
                    break;
                }else if(arr[i] + arr[l] + arr[r] < 0){
                    l = l + 1;
                }else{
                    r = r -1 ;
                }
            }

        }
        return nl;
    }
    public static void main(String[] args) {
        int[] arr = {-4,-1,-1,0,1,2};
        int k = 0;

        List<List<Integer>> l = myfunc(arr,k);

        for(List<Integer> a : l ){
            for(Integer i : a){
                System.out.print(i + " ");
            }
            System.out.println();
        }    
    }
}