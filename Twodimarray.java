import java.util.Scanner;
public class Twodimarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of rows : ");
        int row = sc.nextInt(); 
        System.out.print("enter no of columns : ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                arr[i][j] = sc.nextInt(); 
            }
        }
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.println(arr[i][j]+" ");; 
            }
        }
    }
}
