import java.util.*;

public class SmallestMultiplePer {

    public static String[] allPerNum(long N) {
        String digit = String.valueOf(N);
        List<String> list = new ArrayList<>();
        permute("", digit, list);
        String[] result = new String[list.size()];
        return list.toArray(result);
    }

    private static void permute(String prefix, String remaining, List<String> list) {
        if (remaining.length() == 0) {
            list.add(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char ch = remaining.charAt(i);
            String newPrefix = prefix + ch;
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            permute(newPrefix, newRemaining, list);
        }
    }

    public static long smallestMulper(long N, int d) {
        String[] allcom = allPerNum(N);
        long smallest = Long.MAX_VALUE;
        boolean found = false;

        for (String s : allcom) {
            long val = Long.parseLong(s);
            if (val < N && val % d == 0) {
                smallest = Math.min(smallest, val);
                found = true;
            }
        }

        return found ? smallest : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of N: ");
        long N = sc.nextLong();
        System.out.print("Enter a value of d: ");
        int d = sc.nextInt();

        long result = smallestMulper(N, d);
        if (result != -1)
            System.out.println("Smallest permutation less than " + N + " and divisible by " + d + " is: " + result);
        else
            System.out.println("No such permutation exists.");
    }
}
