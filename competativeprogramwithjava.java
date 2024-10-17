import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class program{
    public static void GDF(int num1 , int num2){
        List<Integer> newlist = new ArrayList<>(); 
        if(num1>num2){
            for(int i = 1 ; i<=num1 ; i++){
                if(num1%i==0 && num2%i==0){
                    newlist.add(i); 
                }
            } 
            System.out.println(Collections.max(newlist)+" Is the GCD");
            
        }else{
            for(int i = 1 ; i<=num2 ; i++){
                if(num1%i==0 && num2%i==0){
                    newlist.add(i);
                }
                
            } 
            System.out.println(Collections.max(newlist)+" Is the GCD");
        }
    }
    public static void main(String[] args) {
        GDF(118, 112);
    }
}