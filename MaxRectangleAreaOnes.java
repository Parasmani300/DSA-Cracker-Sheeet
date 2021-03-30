import java.util.*;

public class MaxRectangleAreaOnes{
    public static int maxHistogram(int[] arr)
    {
        int localArea = 0;
        int maxArea = Integer.MIN_VALUE;

        int n = arr.length;

        Stack<Integer> s = new Stack<>();
        int top;
        int i = 0;

        while( i < n )
        {
            if(s.empty() || arr[s.peek()] <= arr[i] ){
                s.push(i++);
            }else{
                top = s.peek();
                s.pop();

                localArea = arr[top]*(s.empty()?i:i-s.peek()-1);

                if(localArea > maxArea){
                    maxArea = localArea;
                }
            }

        }

        while(s.empty() == false){
            top = s.peek();
                s.pop();

            localArea = arr[top]*(s.empty()?i:i-s.peek()-1);

            if(localArea > maxArea){
                maxArea = localArea;
            }
        }

        return maxArea;
    }

    public static int maxrectangle(int[][] matrix)
    {
        int r = matrix.length;
        int c = matrix[0].length;

        int ans = maxHistogram(matrix[0]);

        for(int i = 1;i<r;i++){
            for(int j = 0;j<c;j++)
            {
                if(matrix[i][j] == 1){
                    matrix[i][j] += matrix[i-1][j];
                }
            }

            ans = Math.max(ans,maxHistogram(matrix[i]));
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            { 0, 1, 1, 0 },
            { 1, 1, 1, 1 },
            { 1, 1, 1, 1 },
            { 1, 1, 0, 0 },
        };

        int ans = maxrectangle(matrix);
        System.out.println(ans);
        
    }
}