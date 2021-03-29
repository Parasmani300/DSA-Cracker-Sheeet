import java.util.*;

// matrix is sorted row wise
public class MedianMatrix{
    public static int median(int[][] matrix)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int count;
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0;i<m;i++){
            if(matrix[i][0] < min){
                min = matrix[i][0];
            }
                            
            if(matrix[i][n-1] > max){
                max = matrix[i][n-1];
            }

            // System.out.println(matrix[i][n-1]);
        }

        
        int desired_element = (1+m*n)/2;

        while(min < max){
            int mid = (min+max)/2;
            int place = 0;
            int get = 0;

            for(int i = 0;i<m;i++){
                get = Arrays.binarySearch(matrix[i],mid);

                // element found on the left or not found
                if(get < 0)
                    get  = Math.abs(get) - 1;
                else{
                    while(get < matrix[i].length && matrix[i][get] == mid)
                        get += 1;
                }

                place = place + get;
            }

            if(place < desired_element){
                min = mid + 1;
            }else{
                max = mid;
            }
        }

        return min;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5},{2,6,9},{3,6,9}};

        int ans = median(matrix);
        System.out.println(ans); //solved
    }
}