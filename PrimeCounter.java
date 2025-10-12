import java.util.* ; 
public class PrimeCounter {

    public static int prime_Counter(int low , int high){
        int count= 0 ; 
        for(int i = low ; i<=high; i++){
            if(i<2)continue ; 
            boolean isPrime = true ; 
            for(int j = 2 ; j*j<=i ; j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)count++ ; 
        }return count; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test Cases :- ");
        int t = sc.nextInt(); 
        for(int i = 0 ; i<t ; i++){
            System.out.print("Enter Start Number :- ");
            int l = sc.nextInt(); 
            System.out.print("Enter End number :- ");
            int r = sc.nextInt(); 
            int n = prime_Counter(l, r);
            System.out.println("Prime Number :- "+n);
        }
    }
}
