import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Center {
    int x, y;
    Center(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class People {
    String name;
    String category;
    int age;
    int x, y;

    People(String name, String category, int age, int x, int y) {
        this.name = name;
        this.category = category;
        this.age = age;
        this.x = x;
        this.y = y;
    }
}

public class VaccinationPlanning {

    public static double dist(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        ArrayList<Center> cList = new ArrayList<>();
        HashMap<Center, ArrayList<People>> map = new HashMap<>();

        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Center c1 = new Center(x, y);
            cList.add(c1);
            map.put(c1, new ArrayList<>());
        }

        int N = sc.nextInt();
        sc.nextLine(); // consume newline
        ArrayList<People> pList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String name = sc.nextLine();
            String category = sc.nextLine();
            int age = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine(); // consume newline
            People pl = new People(name, category, age, x, y);
            pList.add(pl);
        }

        // Assign each person to nearest center
        for (People p : pList) {
            double min = Double.MAX_VALUE;
            Center nearest = null;
            for (Center c : cList) {
                double d = dist(c.x, c.y, p.x, p.y);
                if (d < min) {
                    min = d;
                    nearest = c;
                }
            }
            map.get(nearest).add(p);
        }

        // Print results
        for (Center c : cList) {
            System.out.println("Center at (" + c.x + "," + c.y + "):");
            for (People p : map.get(c)) {
                System.out.println("  " + p.name + " (" + p.category + ", " + p.age + ")");
            }
        }
    }
}
