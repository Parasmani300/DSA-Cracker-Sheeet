import java.util.*;

public class CountReversals{
    public static int countit(String s){
        if(s.length()%2 != 0)
            return -1;
        Stack<Character> stack = new Stack<>();

        for(int i = 0;i<s.length();i++){
            char c= s.charAt(i);
            if(c == '}' && !stack.empty()){
                if(stack.peek() == '{'){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }else{
                stack.push(c);
            }
            // stack.push(c);
        }

        // while(stack.empty()){
        //     char c = stack.peek();
        //     System.out.println(c);
        //     stack.pop();
        // }
        
        int n = 0;
        while(!stack.empty() && stack.peek() == '{'){
            stack.pop();
            n++;
        }

        int reduced_length = stack.size();

        int ans = (int)Math.ceil(reduced_length/2) +(int)Math.ceil(n%2);

        return ans;

    }
    public static void main(String[] args) {
        int ans = countit("}{{}}{{{");
        System.out.println(ans);
    }
}