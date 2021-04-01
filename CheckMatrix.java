public class CheckMatrix{
    public static void rotate90(int[][] mat)
    {
        int r = mat.length;
        int c = mat[0].length;

        for(int i = 0;i<r;i++)
        {
            for(int j = i;j<c;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c/2;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][c-j-1];
                mat[i][c-j-1] = temp;
            }
        }
    }
    public static void main(String[] args) {

        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        rotate90(mat);

        for(int i = 0;i< mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                System.out.print(mat[i][j] + " ");
            }

            System.out.println();
        }
    }
}