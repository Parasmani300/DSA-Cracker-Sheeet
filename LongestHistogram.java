import java.util.*;

public class LongestHistogram{
    public static int longest(int[] arr)
    {
        Stack<Integer> s = new Stack<>();

        int max_area = Integer.MIN_VALUE;
        int tp;
        int area_with_top;

        int n = arr.length;


        // Rin through all the bars of the histogram
        int i = 0;
        while(i < n) 
        {
            // if the stack is empty or the upcoming bar larger then the current, simply push to stack
            if(s.empty() || arr[s.peek()] <= arr[i]){
                s.push(i++);
            }else{
                tp = s.peek();
                s.pop();

                area_with_top = arr[tp]*(s.empty()?i:i-s.peek()-1);
                System.out.println(area_with_top);
                if(max_area < area_with_top){
                    max_area = area_with_top;
                }
            }

        }

        while(s.empty() == false){
            tp = s.peek();
            s.pop();

            area_with_top = arr[tp]*(s.empty()?i:i-s.peek()-1);

            if(max_area < area_with_top){
                max_area = area_with_top;
            }


        }

        return max_area;
    }
    public static void main(String[] args) {
        
        int[] arr ={ 6, 2, 5, 4, 5, 1, 6 };

        int ans = longest(arr);
        System.out.println(ans);
    }
}