import java.util.*;

public class Zoodesign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cost = new int[3];
        for (int i = 0; i < 3; i++) {
            cost[i] = sc.nextInt();
        }

        int maxArea[] = new int[3];
        for (int i = 0; i < 3; i++) {
            maxArea[i] = sc.nextInt();
        }

        int[] minAnimals = new int[3];
        int[] areaPerAnimal = new int[3];
        int[] minArea = new int[3];
        for (int i = 0; i < 3; i++) {
            minAnimals[i] = sc.nextInt();
            areaPerAnimal[i] = sc.nextInt();
            minArea[i] = minAnimals[i] * areaPerAnimal[i];
        }

        int totalArea = sc.nextInt();
        sc.close();

        // Step 5: Check feasibility
        int sumMin = minArea[0] + minArea[1] + minArea[2];
        if (sumMin > totalArea) {
            System.out.println("Infeasible - total land less than minimum required area");
            return;
        }

        int[] usedArea = Arrays.copyOf(minArea, 3);
        int remaining = totalArea - sumMin;

        // Step 7: Sort indices based on cost (ascending)
        Integer[] idx = { 0, 1, 2 };
        Arrays.sort(idx, Comparator.comparingInt(i -> cost[i]));

        // Step 8: Allocate remaining area to cheapest enclosures first
        for (int i : idx) {
            if (remaining <= 0)
                break;
            int canAdd = maxArea[i] - usedArea[i];
            int add = Math.min(canAdd, remaining);
            usedArea[i] += add;
            remaining -= add;
        }

        // Step 9: Calculate total cost
        long totalCost = 0;
        for (int i = 0; i < 3; i++) {Sma
            totalCost += (long) cost[i] * usedArea[i];
        }

        // Step 10: Output result
        System.out.println(totalCost);

    }
}
