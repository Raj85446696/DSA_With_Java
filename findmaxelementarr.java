public class findmaxelementarr {

    public static void Max(int []arr){
        int max = arr[0];
        for(int i=0 ;i<arr.length ;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element of array is :- "+max);
    }

    public static void Min(int []arr){
        int min = arr[0];
        for(int i=0 ;i<arr.length ;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum Element of array is :- "+min);
    }

    public static void main(String[] args) {
        int arr[] = {12,34,56,78,90,57}; 
        Max(arr);
        Min(arr);
    }
}
