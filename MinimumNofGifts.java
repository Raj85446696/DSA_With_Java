import java.util.*;

public class MinimumNofGifts {

    public int[] minNoofGifts(List<int[]> allRanks) {
        int[] result = new int[allRanks.size()];

        for (int t = 0; t < allRanks.size(); t++) {
            int[] rank = allRanks.get(t);
            int n = rank.length;
            int[] gifts = new int[n];

            // Give everyone at least 1 gift
            Arrays.fill(gifts, 1);

            // Left to right
            for (int i = 1; i < n; i++) {
                if (rank[i] > rank[i - 1]) {
                    gifts[i] = gifts[i - 1] + 1;
                }
            }

            // Right to left
            for (int i = n - 2; i >= 0; i--) {
                if (rank[i] > rank[i + 1] && gifts[i] <= gifts[i + 1]) {
                    gifts[i] = gifts[i + 1] + 1;
                }
            }

            // Sum gifts for this test case
            int sum = 0;
            for (int g : gifts) {
                sum += g;
            }
            result[t] = sum; // Assign sum after calculating it
        }

        return result; // Return after processing all test cases
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int testCase = sc.nextInt();
        List<int[]> allRanks = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            System.out.print("Number of employees: ");
            int employee = sc.nextInt();
            int[] rank = new int[employee];

            for (int j = 0; j < employee; j++) {
                rank[j] = sc.nextInt();
            }
            allRanks.add(rank);
        }

        sc.close();

        MinimumNofGifts m = new MinimumNofGifts();
        int[] res = m.minNoofGifts(allRanks);

        // Print results
        for (int n : res) {
            System.out.println(n);
        }
    }
}
