import java.util.*; 
public class Arrangement {
    public  List<Integer> sitting(int R , int N){
        int q = N/R ; 
        int rem = N%R ; 
        List<Integer> result = new ArrayList<>(); 
        for(int i  = 0 ; i<R ; i++){
            if(i<rem){
                result.add(q+1);
            }else{
                result.add(q);
            }
        }return result ;
    }
    public static void main(String[] args) {
        Arrangement a = new Arrangement(); 
        System.out.println(a.sitting(5, 10));
    }
}
