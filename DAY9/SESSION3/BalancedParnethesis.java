package DAY9.SESSION3;
import java.util.Stack;
public class BalancedParnethesis {
    public boolean isvalid(String s){
        Stack<Character> stack =  new Stack<>();
        for(char ch : s.toCharArray()){
            //opening brackects 
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            //closing
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(ch==')'&& top!='('){
                    return false;
                }
                if(ch=='}' && top!='{'){
                    return false;
                }
                if(ch==']'&& top!='['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        String s = "{(())}";
        BalancedParnethesis bp = new BalancedParnethesis();
        System.out.println(bp.isvalid(s));

    }
}
