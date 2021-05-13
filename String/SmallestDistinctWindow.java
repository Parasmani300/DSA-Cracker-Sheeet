import java.util.*;

public class SmallestDistinctWindow{
    static int INT_MAX = 256;

    public static String smallestDistinct(String str)
    {
        int n = str.length();
        boolean[] visitCount = new boolean[INT_MAX];
        Arrays.fill(visitCount,false);
        int distinct_count = 0;
        for(int i = 0;i<n;i++)
        {
            if(visitCount[str.charAt(i)] == false){
                visitCount[str.charAt(i)] = true;
                distinct_count++;
            }
        }

        int start = 0;
        int start_index = -1;
        int min_len = Integer.MAX_VALUE;
        int count = 0;

        int[] count_it = new int[INT_MAX];
        
        for(int j = 0;j<n;j++)
        {
            count_it[str.charAt(j)]++;

            if(count_it[str.charAt(j)] == 1){
                count++;
            }

            if(count == distinct_count)
            {
                while(count_it[str.charAt(start)] > 1){
                    if(count_it[str.charAt(start)] > 1)
                    {
                        count_it[str.charAt(start)]--;
                    }
                    start++;
                }

                int len_window = j - start + 1;
                if(min_len > len_window)
                {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }

        return str.substring(start_index,start_index + min_len);
    }
    public static void main(String[] args) {
        String str = "aabcbcdbca";

        String ans = smallestDistinct(str);
        System.out.println(ans);
    }
}