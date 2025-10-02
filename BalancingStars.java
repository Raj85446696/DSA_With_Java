import java.util.*;

public class BalancingStars {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } 
            else if (ch == '}' || ch == ']' || ch == ')') {
                int starCount = 0;
                while (!stack.isEmpty() && stack.peek() == '*') {
                    stack.pop();
                    starCount++;
                }

                if (stack.isEmpty()) return false; 

                char open = stack.pop();
                if (!isMatching(open, ch)) return false;
                if (starCount != 2) return false;
            } 
            else if (ch == '*') {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatching(char open, char close) {
        return (open == '{' && close == '}') ||
               (open == '(' && close == ')') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (isBalanced(s)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

        sc.close();
    }
}
