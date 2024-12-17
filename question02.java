public class question02 {
    // Reverse of array . 
    void ReverseArray(int [] arr){
        for(int i = arr.length-1 ; i>=0 ; i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        question02 q = new question02();
        int [] arr = {3,4,5,6,77,8};
        q.ReverseArray(arr); 
    }
}
