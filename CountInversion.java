import java.util.*;

public class CountInversion{
    private static long merge(long[] arr, int l,int m, int r)
    {

        // Left subarray
        long[] left = Arrays.copyOfRange(arr, l, m + 1);

        // Right subarray
        long[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l;
        long swaps = 0;

        while (i < left.length && j < right.length) {
        if (left[i] <= right[j])
        arr[k++] = left[i++];
        else {
        arr[k++] = right[j++];
        swaps += (long)((m + 1) - (l + i));
        }
        }

        
        while (i < left.length)
        arr[k++] = left[i++];
        while (j < right.length)
        arr[k++] = right[j++];

        return swaps;
    }

        // Merge sort function
    private static long mergeSort(long[] arr, int l,int r)
    {

        // Keeps track of the inversion count at a
        // particular node of the recursion tree
        long count = 0;

        if (l < r) {
        int m = (l + r) / 2;

        // Total inversion count = left subarray count
        // + right subarray count + merge count

        // Left subarray count
        count += mergeSort(arr, l, m);

        // Right subarray count
        count += mergeSort(arr, m + 1, r);

        // Merge count
        count += merge(arr, l, m, r);
        }

        return count;
    }

    public static void main(String[] args) {
        long[] arr = {1,20,6,4,5};
        int start = 0;
        int end = arr.length-1;

        long ms = mergeSort(arr,start,end);
        System.out.println(ms);
    }
}