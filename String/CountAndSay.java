public class CountAndSay{
    public static String countSay(int n)
    {
        if(n == 1)
            return "1";
        if(n == 2)
            return "2";
        String s = "11";

        for(int i = 3;i<=n;i++){
            int c = 1;
            s = s + '#';
            String t = "";
            for(int j = 1;j<s.length();j++){
                if(s.charAt(j) != s.charAt(j-1)){
                    t = t + c;
                    t = t + String.valueOf(s.charAt(j-1));
                    c = 1;
                }else{
                    c++;
                }
            }

            s = t;
        }

        return s;
    }
    public static void main(String[] args) {
        int n = 4;
        String ans = countSay(n);
        System.out.println(ans);
    }
}