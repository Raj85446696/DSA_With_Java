/* Question - 2 Reverse an array using two Pointers 
Alogrithm
i.) Create a Two Pointer left and right .
ii.) Now , swap left to right and vice versa and update value of left+=1 and right-=1.
iii. finallly using for loop print all elements of array .

*Time Complexity O(n)
*Space Complexity O(1)

*/


public class reverseofarrayusingPointer {

    public static void reverse(int arr[]){
        int left = 0 ; 
        int right = (arr.length)-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
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
