import java.util.*;

public class OnaCube {
    public static double onaCube(int num, List<List<Integer>> result) {
        double totalDistance = 0.0;
        for (int i = 0; i < num - 1; i++) {
            List<Integer> p1 = result.get(i);
            List<Integer> p2 = result.get(i + 1);

            int x1 = p1.get(0), y1 = p1.get(1), z1 = p1.get(2);
            int x2 = p2.get(0), y2 = p2.get(1), z2 = p2.get(2);

            double distance = 0.0;
            if (z1 == z2 || x1 == x2 || y1 == y2) {
                double d = Math.sqrt(Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2) +
                        Math.pow(z2 - z1, 2));
                distance = d * Math.PI / 3.0;
            } else {
                double dx = Math.abs(x2 - x1);
                double dy = Math.abs(y2 - y1);
                double dz = Math.abs(z2 - z1);
                distance = Math.sqrt(Math.pow(dx + dz, 2) + Math.pow(dy, 2));
            }
            distance = Math.round(distance * 100.0) / 100.0;
            totalDistance += distance;
        }
        totalDistance = Math.round(totalDistance * 100.0) / 100.0;
        return totalDistance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> result = new ArrayList<>();
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            List<Integer> point = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                int val = sc.nextInt();
                point.add(val);
            }
            result.add(point);
        }
        sc.close();
        System.out.println(onaCube(num, result));
    }
}
