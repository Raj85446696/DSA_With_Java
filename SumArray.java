import java.util.Scanner;

class SumArray {
    public static void SumOfArray(int[] arr,int size){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<arr.length;i++){ //n
            arr[i] = sc.nextInt(); //n+1
            sum+=arr[i]; 
        }
        System.out.println("Sum of array :- "+sum);
    }

    // Find Minimum Element 
    public static int FindMax(int[] arr){
        int max = arr[0]; 
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }return max ; 
    }


    // Find Minimum elements
    public static int FindMin(int[] arr){
        int min = arr[0]; 
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }return min ; 
    }


    public static void SwapNum(int num1 , int num2){
        System.out.println("Prev : "+num1+" , "+num2);
        // Method 1 using third parameter 
        int temp = num1 ;
        num1 = num2 ; 
        num2 = temp ;  
        System.out.println("Next : "+num1+" , "+num2);
    }

    public static void SwapArr(int arr[],int i , int j ){
        System.out.println("Prev : "+arr[i]+" , "+arr[j]);
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp ; 
        System.out.println("Sucessfully Swap");
        System.out.println("Next : "+arr[i]+" , "+arr[j]);  
    }

    public static void SwapArray(int []arr){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int left = 0 ; 
        int right = arr.length-1 ; 
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right]; 
            arr[right] = temp ; 
            left++; 
            right-- ; 
        }
        System.out.println("");
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter size of array :- ");
        // int size = sc.nextInt();
        // int arr[] = new int[size];
        // SumOfArray(arr, size);
        // int[] arr = {20,343,88,102,455}; 
        // System.out.println("Max Element :- "+FindMax(arr));
        // System.out.println("Min Element :- "+FindMin(arr));
        // SwapNum(1, 2);
        int arr[] = {110,20,30,80};
        // SwapArr(arr, 1, 3);
        SwapArray(arr);
    }
}