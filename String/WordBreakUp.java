import java.util.*;

public class WordBreakUp{
    public static boolean dfs(String s, Set<String> set){
        if(s.equals(""))
            return true;
        
        for(int i = 1;i<=s.length();i++){
            if(set.contains(s.substring(0,i)) && dfs(s.substring(i,s.length()),set)){
                return true;
            }
        }

        return false;
    }
    public static boolean  recursive(String s1,String[] str)
    {
        Set<String> s = new HashSet<String>();
        for(String i : str)
            s.add(i);

        return dfs(s1,s);
    }





    // Dynamic approach
    public static boolean wordbreak(String s,ArrayList<String> al){
        boolean dp[] = new boolean[s.length() + 1];

        dp[0] = true;
        int n = s.length();
        for(int len = 1;len <= s.length();len++){
            for(int i = 0;i<len;i++){
                if(dp[i] && al.contains(s.substring(i,len))){
                    dp[len] = true;
                }
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
         String[] sarr = {"mobile","samsung","sam","sung",
         "man","mango","icecream","and",
         "go","i","like","ice","cream"};
        String s1 = "ilike";
        // boolean ans = recursive(s1,sarr);

        ArrayList<String> al = new ArrayList<String>();
        for(String i : sarr){
            al.add(i);
        }

        boolean ans = wordbreak(s1,al);

        System.out.println(ans);
    }
}