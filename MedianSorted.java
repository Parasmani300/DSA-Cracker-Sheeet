public class MedianSorted{
    public static int median(int[] arr1,int[] arr2)
    {
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        int n = arr1.length;

        for(count = 0;count<=n;count++)
        {
            if(i == n){
                m1 = m2;
                m2 = arr2[0];
                break;
            }else if(j == n){
                m1 = m2;
                m2 = arr1[0];
                break;
            }else if(arr1[i] <= arr2[j]){
                m1 = m2;
                m2 = arr1[i];
                i++;
            }else{
                m1 = m2;
                m2 = arr2[j];
                j++;
            }
        }

        return (m1+m2)/2;

    }

    public static void main(String[] args) {

        int[] arr1 = {1, 12, 15, 26, 38};
        int[] arr2 = {2, 13, 17, 30, 45};

        int ans = median(arr1,arr2);
        System.out.println(ans);
        
    }
}