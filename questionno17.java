import java.util.LinkedList;
import java.util.Queue;
public class questionno17 {
    //Generate 

    String[] generateBinaryNumber(int n ){
        String [] result = new String[n];
        Queue <String> q = new LinkedList<>();
        q.offer("1");
        for(int i = 0 ; i<n ; i++){
            result[i] = q.poll();
            String n1 = result[i]+"1";
            String n2 = result[i]+"0";
            q.offer(n1);
            q.offer(n2);

        }return result; 
    }
    public static void main(String[] args) {
        questionno17 q = new questionno17(); 
        System.out.println(q.generateBinaryNumber(4));
    }
}
