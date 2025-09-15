import java.util.*;

public class Graph {
    public void createGraph(int[][] matrix, int i, int j) {
        matrix[i][j] = 1;
        matrix[j][i] = 1;
    }

    public void displayGraph(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public void bfs(int start, int[][] matrix, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int i = 0; i < matrix.length; i++) {
                if (matrix[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public void dfs(int start , int[][] matrix, boolean[] visited){
        visited[start] = true ; 
        System.out.print(start+" ");
        for(int i = 0 ; i<matrix.length ; i++){
            if(matrix[start][i]==1 && !visited[i]){
                dfs(i, matrix, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 4;
        int[][] matrix = new int[V][V];
        boolean[] visited = new boolean[V];
        Graph g = new Graph();
        g.createGraph(matrix, 0, 1);
        g.createGraph(matrix, 0, 2);
        g.createGraph(matrix, 3, 2);
        g.createGraph(matrix, 2, 2);
        // g.displayGraph(matrix);
        g.bfs(0, matrix, visited);
        // g.dfs(0, matrix, visited);

    }
}