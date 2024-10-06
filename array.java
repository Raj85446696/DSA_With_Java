public class array {
    public static void main(String[] args) {
        // create an array in heap area.
        int arr[] = new int[] {12,23,34,45,56,67,78,89};
        System.out.println("Size of array = "+arr.length); // return size of array

        // Traversing an array 
        // using for loop 
        // for(int i = 0 ; i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // using while loop 
        // int i = 0 ; 
        // while(i<arr.length){
        //     System.out.println(arr[i]);
        //     i++;
        // }
        // using do-while loop 
        // do{
        //     System.out.println(arr[i]);
        //     i++;
        // }while(i<arr.length);
        // using for each loop 
        for(int x:arr){
            System.out.println(x);
        }
    }
}

