public class AllPossibleIPs{
    public static boolean checkValid(String s){
        if(s.charAt(0) == '0' && s.length() > 1)
            return false;
        else if(s.length() > 3){
            return false;
        }

        int n = Integer.parseInt(s);
        return n >= 0 && n <= 255;
    }

    public static void allIp(String s)
    {
        int n = s.length();

        for(int i = 1;i<=3 && i < s.length();i++)
        {
            String first = s.substring(0,i);
            if(checkValid(first))
            {
                for(int j = 1;j<=3 && i + j < s.length();j++)
                {
                    String second = s.substring(i,i+j);
                    if(checkValid(second)){
                        for(int k = 1;k<=3 && i + j + k < s.length();k++)
                        {
                            String third = s.substring(i+j,i+j+k);
                            String fourth = s.substring(i+j+k);
                            if(checkValid(third) && checkValid(fourth)){
                                System.out.println(first+"." + second + "." + third +"." + fourth);
                            }
                        }
                    }
                }
            }
        }


    }
    public static void main(String[] args) {
        String ip = "25525511135";

        allIp(ip);
    }
}