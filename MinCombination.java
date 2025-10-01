import java.util.* ; 
class MinCombination{
    public int gcd(int n , int m){
        if(m ==0) return n ; 
        return gcd(m,n%m); 
    }
    public static void main(String[] args) {
        MinCombination m1 = new MinCombination(); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        System.out.println(m1.gcd(n, m));

    }
}