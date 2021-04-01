public class CheckPallindrome{
    public static boolean check(String s)
    {
        for(int i = 0;i<s.length()/2;i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "coci";

        System.out.println(check(s));
    }
}