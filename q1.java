// Q.1 Given  an array , your task to find leaders in the array .Leader means its greater or 
// equals to all the element to its right side . 
public class q1{
    public static void main(String[] args) {
        int [] arr = {16,7,4,3,55,2}; 
        int n = arr.length;
        int max = arr[n-1];
        for(int i=n-2 ; i>=0; i--){
            if(arr[i]>max){
                max = arr[i];
                System.out.println(max);
            }
        }
    }
}