import java.util.*;

public class MathewJohnNumber {

    public int mathewJohnNumber(int min, int max, int k) {
        // for methew number
        ArrayList<Integer> methew = new ArrayList<>();
        // for john number
        ArrayList<Integer> john = new ArrayList<>();

        for (int i = min; i <= max; i++) {
            int num = i * (2 * i - 1);
            methew.add(num);
        }

        for (int i = min; i <= max; i++) {
            int num = (i * (i+1))/2;
            john.add(num);
        }
        int index = 0;
        for (int i = 0; i < methew.size(); i++) {
            if (john.contains(methew.get(index))) {
                index++;
                if (index == k) {
                    return methew.get(i);
                }
            }

        }return -1 ;  

    }

    public static void main(String[] args) {
        MathewJohnNumber mj = new MathewJohnNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter min Range : ");
        int n = sc.nextInt();
        System.out.print("Enter max Range : ");
        int m = sc.nextInt();
        System.out.println(mj.mathewJohnNumber(n, m, 3));

    }
}
