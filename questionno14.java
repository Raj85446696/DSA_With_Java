import java.util.Stack;

// Print next greater element using stack 
public class questionno14 {

    int[] NextGreaterElem(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int []result = new int[arr.length];
        for(int i = arr.length-1 ; i>=0 ; i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty()&&stack.peek()<=arr[i]){
                    stack.pop();
                }
            }if(stack.isEmpty()){
                result[i] = -1 ; 
            }else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result; 

        
    }
    public static void main(String[] args) {
        questionno14 q = new questionno14(); 
        int[] arr = {4,7,3,4,8,1};
        int [] result = q.NextGreaterElem(arr);
        for(int i = 0 ; i<result.length ; i++){
            System.out.print(result[i]+" ");
        }
    }
}
