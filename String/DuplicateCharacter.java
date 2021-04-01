import java.util.*;

public class DuplicateCharacter{
    public static void main(String[] args) {
        String s = "geekforgeeks";

        char[] ch = s.toCharArray();
        int[] carr = new int[256];

        for(int i = 0;i<ch.length;i++){
            carr[ch[i]]++;
        }

        for(int i =0;i<carr.length;i++ ){
            if(carr[i] > 1){
                System.out.print((char)i + " ");
            }
        }
    }
}