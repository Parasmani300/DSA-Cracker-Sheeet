import java.util.*;

public class CommonElements{
    public static ArrayList<Integer> intersect(int[] A,int[] B,int[] C)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < A.length && j < B.length && k < C.length)
        {
            if( A[i] == B[j] && B[j] == C[k]){
                al.add(A[i]);
                i++;
                j++;
                k++;
            }else if(A[i] < B[j]){
                i++;
            }else if(B[j] < C[k]){
                j++;
            }else{
                k++;
            }
        }

        return al;
    }
    public static void main(String[] args) {
        
    }
}