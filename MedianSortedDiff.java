public class MedianSortedDiff{
    public static int median(int[] arr1,int[] arr2)
    {
        int x = arr1.length;
        int y = arr2.length;

        int low = 0;
        int high = x;
        int median = Integer.MIN_VALUE;

        while(low <= high){
            int partitionX = (low + high)/2;
            int partitionY = (x+y+1)/2-partitionX;

            int maxLeftX = (partitionX == 0)?Integer.MIN_VALUE:arr1[partitionX-1];
            int minRightX = (partitionX == x)?Integer.MAX_VALUE:arr1[partitionX];

            int maxLeftY = (partitionY == 0)?Integer.MIN_VALUE:arr2[partitionY-1];
            int minRightY = (partitionY == y)?Integer.MAX_VALUE:arr2[partitionY];

            if(maxLeftX <= minRightY && maxLeftY <= minRightX){
                if((x+y)%2 == 0){
                    median = (Math.max(maxLeftX,maxLeftY)+ Math.min(minRightX,minRightY))/2;
                    break;
                }else{
                    median = Math.max(maxLeftX,maxLeftY);
                    break;
                }
            }else if(maxLeftX > minRightY){
                high = partitionX - 1;
            }else{
                low = partitionX + 1;
            }
        }

        return median;
        
    }

    public static void main(String[] args) {

        int[] arr1 = {1,3,8,9,15};
        int[] arr2 = {7,11,18,19,21,25};

        int ans = median(arr1,arr2);
        System.out.println(ans);
        
    }
}