public class CheckRotations{
    public static boolean check(String s1,String s2)
    {
        return (s1.length() == s2.length() && (s1 + s1).indexOf(s2) != -1);
    }
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        System.out.println(check(s1,s2));
    }
}