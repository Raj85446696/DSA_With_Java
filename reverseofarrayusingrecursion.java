public class reverseofarrayusingrecursion {

    public static void recursionarray(int []arr ,int left , int right){
        if (left>=right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        
        recursionarray(arr, left+1, right-1);

    }

    public static void main(String[] args) {
        int arr[] = {12,34,56,78,90,57}; 
        recursionarray(arr, 0, arr.length-1);
        for(int i = 0 ; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
