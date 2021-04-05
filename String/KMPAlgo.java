public class KMPAlgo{
    public static void kmpSearch(String txt,String pat){
        int M  = pat.length();
        int N = txt.length();

        int lps[] = new int[M];
        int j = 0;

        // Compute LPS array
        computeLPS(pat,M,lps);

        int i = 0;
        while(i<N){
            if(pat.charAt(j) == txt.charAt(i)){
                j++;
                i++;
            }
            if( j == M){
                System.out.println("Pattern found at" + (i-j));
                j = lps[j-1];
            }else if(i < N && pat.charAt(j) != txt.charAt(i)){
                if(j != 0){
                    j = lps[j-1];
                }else{
                    i = i+ 1;
                }
            }

        }
    }
    public static void computeLPS(String pat,int M,int[] lps){
        int len = 0; //len is the length of longest prefix suffux
        int i = 1;
        lps[0] = 0; //the first character of the prefix suffuix is always going to be zero


        // Loop    to calculate lps[i] for i = 0 .. M-1
        while(i < M){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                lps[i] = len;

                i++;
            }else{
                if(len != 0){
                    len = lps[len - 1];
                }else{
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
    public static void main(String[] args) {
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";

        kmpSearch(txt,pat);
        
    }
}