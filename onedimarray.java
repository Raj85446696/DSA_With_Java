import java.util.Scanner ; 
public class onedimarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int size = sc.nextInt() ;
        int arr[] = new int[size] ; 
        for(int i = 0 ; i<size ; i++){
            System.out.print("enter a number : "); 
            arr[i] = sc.nextInt(); 
        }
        System.out.print("enter a number what you want to search : ");
        int num = sc.nextInt();
        for(int i=0;i<size ; i++){
            if(num == arr[i]){
                System.out.println("index of number is : "+i);
            }
        }
    }
}
