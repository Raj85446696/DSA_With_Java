import java.util.*;

public class LexicographicalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();

        while (test > 0) {
            String P = sc.nextLine(); 
            String S = sc.nextLine();
            List<Integer> list = new ArrayList<>();

            
            for (char c : S.toCharArray()) {
                list.add(P.indexOf(c));
            }

          
            Collections.sort(list);

    
            for (int idx : list) {
                System.out.print(P.charAt(idx));
            }
            System.out.println();
            test--;
        }

        sc.close();
    }
}
