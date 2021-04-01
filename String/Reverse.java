import java.util.*;

public class Reverse{
    public static String reverseString(String s)
    {
        char[] ch = s.toCharArray();

        for(int i = 0;i<ch.length/2;i++){
            char temp = ch[i];
            ch[i] = ch[s.length()-i-1];
            ch[s.length()-i-1] = temp;
        }

        s = new String(ch);
        return s;
    }
    public static void main(String[] args) {
        String s = "Dhruvatara";

        String rev = reverseString(s);
        System.out.println(rev);
    }
}