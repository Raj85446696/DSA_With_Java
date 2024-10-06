import java.util.Scanner;
public class inputarray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print("enter an array = ");
            int num = sc.nextInt();
        }
    }
}
