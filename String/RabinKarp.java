import java.util.*;

public class RabinKarp{
    public static long hashCode(String s){
        long sum = 0;
        char[] ch = s.toCharArray();

        int count = 0;
        for(int i = ch.length-1;i>=0;i--){
            // System.out.println((int)ch[i]);
            sum += (long)((int)ch[i])*Math.pow(10,count);
            count++;
        }

        return sum;
    }
    public static void rabinkarp(String s, String subs){
        long original = hashCode(subs);

        int sublen = subs.length();

        long netsum = 0;
        for(int i = 0;i<s.length()-sublen;i++){
            long tempSum = hashCode(s.substring(i,i+sublen));
            if(tempSum == original){
                if(s.substring(i,i+sublen).equals(subs)){
                    System.out.println("Count present at " + i);
                }
            }
        }
    }
    public static void main(String[] args) {
        rabinkarp("GEEKS FOR GEEKS","GEEK");
    }
}