import java.util.*;

public class MobileKeyPad{
    public static String keypad(String s,Map<String,String> lookup){
        StringBuffer s1 = new StringBuffer("");
        for(int i = 0;i<s.length();i++){
            s1.append(lookup.get(s.substring(i,i+1)));
        }


        return String.valueOf(s1);
    }
    public static void main(String[] args) {
        Map<String,String> lookup = new HashMap<>();

        lookup.put("1","1");
        lookup.put("A","2");
        lookup.put("B","22");
        lookup.put("C","222");
        lookup.put("D","3");
        lookup.put("E","33");
        lookup.put("F","333");
        lookup.put("G","4");
        lookup.put("H","44");
        lookup.put("I","444");
        lookup.put("J","5");
        lookup.put("K","55");
        lookup.put("L","555");
        lookup.put("M","6");
        lookup.put("N","66");
        lookup.put("O","666");
        lookup.put("P","7");
        lookup.put("Q","77");
        lookup.put("R","777");
        lookup.put("S","7777");
        lookup.put("T","8");
        lookup.put("U","88");
        lookup.put("V","888");
        lookup.put("W","9");
        lookup.put("X","99");
        lookup.put("Y","999");
        lookup.put("Z","9999");
        lookup.put(" ","0");

        String s = "HELLO WORLD";

        String ans = keypad(s,lookup);

        System.out.println(ans);
    }
}