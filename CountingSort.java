public class CountingSort {
    public void countingSort(int[]arr){
        // step1 find the max element 
        int max = arr[0];
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        // create a new count array and store frequency 
        int[] count = new int[max+1];
        for(int n : arr){
            count[n]++ ; 
        }

        // build new arr 
        int index = 0 ; 
        for(int i = 0 ; i<count.length;i++){
            while(count[i]>0){
                arr[index++] = i ;
                count[i]-- ; 
            }
        }
    }
    public static void main(String[] args) {
        CountingSort c = new CountingSort(); 
        int[] arr = {4,2,2,8,3,3,1};
        c.countingSort(arr);
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
