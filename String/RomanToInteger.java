// IX   --> 1  + (10 - 2*1)
// XL --> 10 + (50 - 2*10)

import java.util.*;

public class RomanToInteger{
    public static int romanToInteger(String roman)
    {
        char[] ch = roman.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum =  map.get(ch[0]);
        for(int i = 1;i<ch.length;i++){
            if(  map.get(ch[i-1]) < map.get(ch[i]) ){
                sum = sum + (map.get(ch[i]) - 2*map.get(ch[i-1]));
            }else{
                sum = sum + map.get(ch[i]);
            }

            System.out.println(sum);
        }

        return sum;
    }
    public static void main(String[] args) {
        String roman = "CCXLVII";

        int ans = romanToInteger(roman);

        System.out.println(ans);
    }
}