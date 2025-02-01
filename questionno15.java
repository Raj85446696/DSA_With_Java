import java.util.Stack ; 

// Vaid Parenthesis Using Stack
public class questionno15 {

    public boolean ValidParenthesis(String s){
        Stack <Character> stack = new Stack<>(); 
        for(char c : s.toCharArray()){
            if(c == '{' || c == '[' ||  c == '(' ){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    char top = stack.peek(); 
                    if((c=='}'&&top=='{')||
                    (c==']'&&top=='[')||
                    (c==')'&&top=='(')){
                        stack.pop();
                    }else{
                        return false ; 
                    }
                }
            }
        }return stack.isEmpty();
    }
    public static void main(String[] args) {
        questionno15 q = new questionno15(); 
        System.out.println(q.ValidParenthesis("{()}"));
        System.out.println(q.ValidParenthesis("{}()[]"));
        
    }
}
