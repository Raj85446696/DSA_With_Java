import java.util.Scanner; // This Scanner package is used for getting input from the user.
class Day1{

    // Question -1 Remove even integer from an Array arr = {3,2,4,7,10,6,5} 

    public int[] RemoveEvenNum(int [] arr){
        int oddNum = 0 ; 
        for(int i = 0 ; i<arr.length ;i++){
            if(arr[i]%2!=0){
                oddNum++;
            }
        }

        int [] oddArr = new int[oddNum];
        int idx = 0 ; 
        for(int i = 0 ; i<arr.length ;i++){
            if(arr[i]%2!=0){
                oddArr[idx] = arr[i];
                idx++;
            }
        }return oddArr ; 


    }
    public static void main(String[] args) {
         Day1 d = new Day1();
         int []arr = {3,2,4,7,10,6,5};
         System.out.println(d.RemoveEvenNum(arr)); 

        // 1. Creating an Array 
        // int [] arr = {5,7,9,3,5};

        // 2. another way to initalize an array is 
        // int arr[] = new int [5] ; 
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;


    // Traversing of an array .
    //     for(int i = 0 ; i<arr.length ; i++){
    //         System.out.println(arr[i]+" Element of array at index -> "+i);
    //     }

    // Adding & updating elements of an array .

    // int arr [] = new int[9]; // default value based on dataTypes
    // for(int i = 0 ; i<arr.length ; i++){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number -> ");
    //     arr[i] = sc.nextInt(); 
    // }

    // // updaing value of array 
    // arr[6] = 99 ; 
    // arr[3] = 199 ; 
    // arr[8] = 299 ; 

    // // Traversing element of array 

    // for(int i = 0 ; i<arr.length ; i++){
    //     System.out.println(arr[i]+" Element of array at index -> "+i);
    
    // }


    // boolean [] arr = new boolean[6] ; 
    // System.out.println(arr[1]); // Output : false 

    // double [] darr = new double[5];
    // System.out.println(darr[0]); // Output : 0.0 


    
    
    


    }
}