import java.util.Stack ; 

class ReverseString{

    public String revString(String str){
        Stack <Character> stack = new Stack<>(); 
        char[] chars = str.toCharArray();

        for(char c:chars){
            stack.push(c);
        }

        for(int i = 0 ; i<str.length();i++){
            chars[i] = stack.pop();
        }return new String(chars);
    }
    public static void main(String[] args) {
        ReverseString rs = new ReverseString(); 
        System.out.println(rs.revString("Ritu Raj vermsa"));;
    }
}

