import java.util.* ; 
public class SquareFreeNum {
    public static int CountSqaureFreeNum(List<Integer> arr){
        int count = 0 ; 
        for(int num : arr){
            if(num==1){
                continue ; 
            }
            boolean isSquareFree = true; 
            for(int i = 2 ; i*i<=num ; i++){
                if(num%(i*i)==0){
                    isSquareFree = false ;
                    break; 
                }
            }
            if(isSquareFree)count++ ; 
        }return count ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int N = sc.nextInt(); 
        List<Integer> arr = new ArrayList<>(); 
        for(int i = 1 ; i<=N; i++){
            if(N%i==0){
                arr.add(i);
            }
        }
        System.out.println(CountSqaureFreeNum(arr));
    }
}
