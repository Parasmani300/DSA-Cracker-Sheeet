public class PallindromicArray{
    static boolean  checkPallindorome(int num){
        String s = String.valueOf(num);
        
        for(int i = 0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        }
        return true;
        }
        
        public static int palinArray(int[] arr, int n)
        {
                      //add code here.
            int ans = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(!checkPallindorome(arr[i])){
                return 0;   
            }
        }
        
        return 1;
        }

    public static void main(String[] args) {
        int[] arr = {111,222,333,444};
        int ans = palinArray(arr,arr.length);


        System.out.println(ans);
    }
}