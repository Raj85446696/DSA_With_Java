/* Question - 1 Reverse an array using temporary array 
Alogrithm
i.) Create a temporary array of same size as original array.
ii.) Now , copy all element from org array to temp array in reverse order.
iii. finallly copy all element from temp array back to original array.

*Time Complexity O(n)
*Space Complexity O(n)
*/

public class reverseofarrayusingtemp{

    public static void reverse(int arr[]){
        int temp[] = new int[arr.length];
        int l = arr.length ; 
        for(int i = 0 ; i<arr.length ; i++){
            temp[i] = arr[l-1-i];
        }
        for(int i = 0 ; i<arr.length ;i++){
            arr[i] = temp[i];
        }
        for(int i = 0 ; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int arr[] = {12,34,56,78,90,57}; 
        reverse(arr);
    }
}