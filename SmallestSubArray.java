public class SmallestSubArray{
    static long sms(long[] arr, long x){
        long min_len = arr.length + 1;

        long end = 0;
        long start = 0;
        long current_sum = 0;
        int n = arr.length;

        while(end < arr.length){
            while(current_sum <= x && end < n){
                current_sum += arr[(int)end];
                end++;
            }

            while(current_sum >  x && (end-start) < n){
                if(end-start < min_len){
                    min_len = Math.min(min_len,end-start);
                }

                current_sum = current_sum - arr[(int)start];
                start++;
            }
        }

        return min_len;
    }

    public static void main(String[] args) {

        long[] arr = {1,11,100,1,0,200,3,2,1,250};
        long x = 280;
        long ans = sms(arr,x);

        System.out.println(ans);
    }
}