import java.util.Arrays;

// public class findmaxelementusingsort {
//     public static void ArraySort(int arr[],int elem){
//         Arrays.sort(arr);
//         System.out.println(arr[elem-1]);
//     }
//     public static void main(String[] args) {
//         int arr[] = {12,34,56,78,90,57};
//         System.out.println(Arrays.toString(arr));
//         ArraySort(arr,3);
        
//     }
// }

public class findmaxelementusingsort{
    public static void Bubblesort(int arr[],int elem){
        int l = arr.length ; 
        for(int i =0 ; i<l ; i++){
            for(int j = 0 ; j<l-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[elem-1]);
    }
    public static void main(String[] args) {
        int arr[] = {12,34,56,78,90,57};
        Bubblesort(arr,2);
    }
}
