import java.util.*; 
public class CoinDistributionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt(); 

        // count the number of 5's
        int count0f5 = (n-4)/5 ; 
        int countof2 = 0 ; 
        int countof1 = 0 ;

        // count of 1's 
        if((n-5*count0f5)%2==0){
            countof1 = 2 ; 
        }else{
            countof1 = 1 ; 
        }

        // count of 2's 
        countof2 = (n-5*count0f5 - countof1)/2 ;

        System.out.println("Count of all coins "+(count0f5+countof1+countof2));
        System.out.println("Count of 5's :- "+count0f5
        +"\nCount of 2's :- "+countof2
        +"\nCount of 1's :- "+countof1
        );

    }
}
