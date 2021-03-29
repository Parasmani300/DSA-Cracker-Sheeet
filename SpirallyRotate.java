public class SpirallyRotate{
    public static void spiral(int[][] matrix)
    {
        int top = 0;
        int right = matrix[0].length-1;
        int left = 0;
        int down = matrix.length-1;

        int dir = 0;

        while(top <= down && left <= right)
        {
            if(dir == 0){
                for(int i = left;i<=right;i++)
                {
                    System.out.print(matrix[top][i] + " ");
                }
                // System.out.println();
                top += 1;
            }else if(dir == 1){
                for(int i = top;i<=down;i++){
                    System.out.print(matrix[i][right] + " ");
                }
                right = right - 1;
            }else if(dir == 2){
                for(int i = right;i>=left;i--){
                    System.out.print(matrix[down][i] + " ");
                }
                // System.out.println();
                down = down - 1;
            }else{
                for(int i = down;i>=top;i--)
                {
                    System.out.print(matrix[i][left] + " ");
                }
                // System.out.println();
                left = left + 1;
            }

            dir += 1;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15,16}};

        spiral(matrix);
    }
}