import java.util.*; 

public class BalancedBracket{
    public static boolean checkBalanced(String s)
    {
        char[] carr = s.toCharArray();
        
        Stack<Character> stack = new Stack<Character>();
        int flag = 0;
        for(char i : carr){
            if(i == '{' || i == '[' || i == '('){
                stack.push((Character)i);
            }else if(i == '}' || i == ']' || i == ')'){
                Character a = stack.peek();
                stack.pop();
                if(a == '[' && i == ']' || a == '{' && i == '}' || a == '(' && i == ')' ){
                    flag = 1;
                }else{
                    return false;
                }
            }
        }

        if(stack.empty())
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        String s = "[(])";

        boolean ans = checkBalanced(s);
        System.out.println(ans);
        
    }
}