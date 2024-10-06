import java.util.Scanner; 
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter a number = ");
        int num = sc.nextInt(); 
        int sum = 1 ; 
        for(int i = num ; i>1 ;i--){
            sum*=i ;
        }
        System.out.print("Factorial of number is = "+sum);

    }
}
