public class Max1s{
    public static int first(int[] arr,int low,int high){
        if(high >= low){
            int mid = (low + high)/2;

            if(mid == 0 || arr[mid-1] == 0 && arr[mid] == 1){
                return mid;
            }else if(arr[mid] == 0){
                return first(arr,mid+1,high);
            }else{
                return first(arr,low,mid-1);
            }
        }
        return -1;
    }

    public static int maxm(int[][] matrix,int r,int c)
    {
        int i=0,j=0;
        int flag = 0;

        for(j=0;j<c;j++){
            for(i=0;i<r;i++){
                if(matrix[i][j] == 1)
                { 
                    flag = 1;
                    break;
                }
            }

            if(flag == 1)
                break;
        }

        return i;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            { 0, 0, 0, 1 },
            { 0, 1, 1, 1 },
            { 1, 1, 1, 1 },
            { 0, 0, 0, 0 }
        };

        int ans = maxm(matrix,matrix.length,matrix[0].length);

        System.out.println(ans);
    }
}