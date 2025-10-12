import java.util.*;

public class StringCount {

    // Count occurrences of character at index 'c' from start to index 'c'
    public static int CountChar(String S, int c) {
        if (c < 0 || c >= S.length()) {
            return -1; // invalid index
        }

        char target = S.charAt(c);
        int count = 0;

        for (int i = 0; i <= c; i++) {
            if (S.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String S = sc.nextLine();
        System.out.print("How many queries: ");
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            System.out.print("Enter index: ");
            int s = sc.nextInt();
            int result = CountChar(S, s);
            if (result == -1) {
                System.out.println("Invalid index!");
            } else {
                System.out.println("Count of character '" + S.charAt(s) + "' up to index " + s + " is: " + result);
            }
        }
    }
}
