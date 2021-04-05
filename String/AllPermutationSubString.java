public class AllPermutationSubString{
    public static void permute(String input,int l,int r){
        if(l == r){
            System.out.print(input + " ");
            return;
        }
        else{
            for(int i = l;i<=r;i++){
                input = swap(input,l,i);
                permute(input,l + 1,r);
                input = swap(input,l,i);
            }
          
        }
    }

    public static String swap(String input,int i,int j){
        char[] ch = input.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        String s ="ABCD";
        permute(s,0,s.length()-1);
    }
}