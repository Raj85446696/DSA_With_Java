import java.util.*; 

public class MinimumSum {

    public static int minSum(int[]arr,int N){
        for(int i = 0 ; i<N ; i++){
            Arrays.sort(arr);
            int maxidx = arr.length-1 ; 
            arr[maxidx] = arr[maxidx]/2 ; 
        }
        int sum = 0 ; 
        for(int s : arr){
            sum+=s ; 
        }
        return sum ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array :- ");
        int size = sc.nextInt();
        System.out.print("Enter no of Operation :- ");
        int N = sc.nextInt(); 
        int[]arr = new int[size];
        for(int i = 0 ; i<size ; i++){
            arr[i] = sc.nextInt(); 
        }

        System.out.println(minSum(arr, N));

    }
}
