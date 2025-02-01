public class day01 {
    // linear search.
    public int LinearSearch(int[] arr,int target){
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]==target){
                return i ; 
            }
        }return -1 ; 
    }

    //binary Search
    public int binarySearch(int[]arr,int target){
        int left = 0 ; 
        int right = arr.length-1 ;

        while(left<=right){
            int mid = (right+left)/2;
            if(arr[mid]==target){
                return mid ; 
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1 ; 
            }
        }return -1 ; 
    }

    //bubble sort 
    public int[] BubbleSort(int[] arr){
        for(int i = 0 ; i<arr.length-1;i++){
            for(int j = 0 ; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ; 
                }
            }
        }return arr;
    }

    public static void main(String[] args) {
        day01 d = new day01();
        int [] arr = {23,5,8,90,3}; 
        // System.out.println(d.LinearSearch(arr,94));
        // System.out.println(d.binarySearch(arr, 8));
        System.out.println(d.BubbleSort(arr));
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
