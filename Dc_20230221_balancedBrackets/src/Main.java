import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution k = new Solution();
        boolean output = k.balancedBrackets("[]}{()");
        System.out.println(output); // // -> false

        output = k.balancedBrackets("()");
        System.out.println(output); // --> true
    }
}
class Solution {
    public boolean balancedBrackets(String str) {
        // TODO:
        if(str.length()==0)
            return true;

        return useStack(str);
    }
    public static boolean useStack(String str)
    {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{')
            {
                stack.push(str.charAt(i));
            } else if ((str.charAt(i)==')'||str.charAt(i)=='}'||str.charAt(i)==']')&&stack.isEmpty()) {
                return false;
            } else if(!stack.isEmpty()&&str.charAt(i)==')'){
                if(stack.peek()=='(')
                    stack.pop();
                else return false;
            }else if(!stack.isEmpty()&&str.charAt(i)=='}') {
                if (stack.peek() == '{')
                    stack.pop();
               else return false;
            }else if(!stack.isEmpty()&&str.charAt(i)==']') {
                if (stack.peek() == '[')
                    stack.pop();
                else return false;
            }
        }
        if(stack.isEmpty())
            return true;
        else return false;
    }
}