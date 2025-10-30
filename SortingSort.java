import java.util.*;

public class SortingSort {

    public static int MinEfforts(int[] arr, int k) {
        int n = arr.length;

        // Step 1: Find sorted array
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        // Step 2: Move the heaviest (last) element to position (k - 1)
        int max = sorted[n - 1];
        for (int i = n - 1; i > k - 1; i--) {
            sorted[i] = sorted[i - 1];
        }
        sorted[k - 1] = max;

        // Step 3: Map weights to target positions
        Map<Integer, Integer> targetPos = new HashMap<>();
        for (int i = 0; i < n; i++) {
            targetPos.put(sorted[i], i);
        }

        // Step 4: Initialize visited array
        boolean[] visited = new boolean[n];
        int globalMin = Arrays.stream(arr).min().getAsInt();
        int totalEffort = 0;

        // Step 5: Cycle detection
        for (int i = 0; i < n; i++) {
            if (visited[i] || targetPos.get(arr[i]) == i)
                continue;

            int j = i;
            int cycleSize = 0;
            int sum = 0;
            int minInCycle = Integer.MAX_VALUE;

            while (!visited[j]) {
                visited[j] = true;
                int val = arr[j];
                sum += val;
                minInCycle = Math.min(minInCycle, val);
                j = targetPos.get(val);
                cycleSize++;
            }

            if (cycleSize > 1) {
                int cost1 = sum + (cycleSize - 2) * minInCycle;
                int cost2 = sum + minInCycle + (cycleSize + 1) * globalMin;
                totalEffort += Math.min(cost1, cost2);
            }
        }

        return totalEffort;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(MinEfforts(arr,3));
    }
}
