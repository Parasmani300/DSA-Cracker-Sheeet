public class FirstLast{
    public static int firstlast(int[] arr){
        ArrayList<Long> al = new ArrayList<>();
        int i = 0;
        for(i = 0;i<n;i++){
           if(arr[i] == x)
                break;
        }

        if(i == n-1 && arr[i] == x)
        {
            al.add((long)i);
            al.add((long)i);

            return al;
        }else if( i == n-1 && arr[i] != x){
            return al;
        }else{
            int j = n-1;
            while(j >= i){
                if(arr[j] == x)
                    break;
                j--;
            }

            al.add((long)i);
            al.add((long)j)

            return al;
        }
    }
    public static void main(String[] args) {
        int[] arr = 
    }
}