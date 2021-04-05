public class Equal0s1s{
    public static int Substring(String s)
    {
        int c = 0;
        int x = 0;
        int y = 0;
        int n = s.length();

        for(int i = 0;i<n;i++)
        {
            if(s.charAt(i) == '0')
                x++;
            else
                y++;
            
            if(x == y){
                c++;
            }

        }

        if(x != y)
            return -1;
        
        return c;
    }
    public static void main(String[] args) {
        String s = "01001101";
        int ans = Substring(s);
        System.out.println(ans);
    }
}