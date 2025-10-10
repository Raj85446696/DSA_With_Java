import java.util.*;
class ConsecutiveSum{
    public List<Integer> generatePrimeNumber(int n){
        List<Integer> result = new ArrayList<>(); 
        for(int i = 2 ; i<=n ; i++){
            if(isPrime(i)){
                result.add(i);
            }
        } return result ; 
    }

    public boolean isPrime(int num){
        if(num<2)return false ; 
        for(int i = 2 ; i*i<=num ; i++){
            if(num%i==0)return false ; 
        }return true ; 

    }

    public int Sum(List<Integer> result,int N){
        int sum = 0 ; 
        int count = -1 ; 
        for(int i = 0 ; i<result.size();i++){
            sum+=result.get(i);
            if(isPrime(sum)){
                if(sum<=N){
                    count++ ; 
                }
            }
        }
        return count ; 

    } 
    public static void main(String[] args) {
        ConsecutiveSum c = new ConsecutiveSum(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int N = sc.nextInt(); 
        List<Integer> primes = c.generatePrimeNumber(N);
        System.out.println(primes);
        int count = c.Sum(primes,N);
        System.out.println("Total consecutive prime sums: "+ count);
    }
}