// https://leetcode.com/problems/merge-intervals/
import java.util.*;

public class MergeIntervals{
    public static int[][] merge_interval(int[][] arr)
    {
       Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));
       LinkedList<int[]> merged = new LinkedList<>();

       for(int[] interval : arr)
       {
           if(merged.isEmpty() || merged.getLast()[1] < interval[0]) {
               merged.add(interval);
           }else{
               merged.getLast()[1] = Math.max(merged.getLast()[1],interval[1]);
           }
       }

       return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] ans = merge_interval(intervals);
        for(int[] interval : ans){
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}