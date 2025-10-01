import java.util.*;

public class FruitBowl {
    static class Point {
        int x, y;
        Point(int x, int y) { this.x = x; this.y = y; }
    }

    // cross product (to check turn direction)
    static int orientation(Point a, Point b, Point c) {
        return (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x);
    }

    // distance between two points
    static double dist(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of dots scattered on the screen: ");
        int n = sc.nextInt();

        Point[] pts = new Point[n];
        for (int i = 0; i < n; i++) {
            pts[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        // sort by x, then y
        Arrays.sort(pts, (a, b) -> a.x == b.x ? a.y - b.y : a.x - b.x);

        // build lower hull
        List<Point> lower = new ArrayList<>();
        for (Point p : pts) {
            while (lower.size() >= 2 &&
                   orientation(lower.get(lower.size() - 2), lower.get(lower.size() - 1), p) <= 0) {
                lower.remove(lower.size() - 1);
            }
            lower.add(p);
        }

        // calculate perimeter of lower hull
        double peri = 0;
        for (int i = 0; i < lower.size() - 1; i++) {
            peri += dist(lower.get(i), lower.get(i + 1));
        }

        System.out.println("Perimeter : " + Math.round(peri));
        sc.close();
    }
}
