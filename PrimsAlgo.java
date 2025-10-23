public class PrimsAlgo {
    public static int FindMinVer(int[]weight,boolean[]visited,int V){
        int minver = -1 ; 
        for(int i = 0 ; i<V ; i++){
            if(!visited[i]&&(minver==-1 || weight[i]<weight[minver])){
                minver = i ; 
            }
        }return minver; 
    }
    public static void prims(int[][]graph,int V){
        int[]parent = new int[V];
        int[]weight = new int[V];
        boolean[]visited = new boolean[V];

        for(int i = 0 ; i<V ; i++){
            weight[i] = Integer.MAX_VALUE; 
            visited[i] = false ; 
        }

        parent[0] = -1 ; 
        weight[0] = 0 ; 

        for(int i = 0 ; i<V-1 ; i++){
            int minver = FindMinVer(weight,visited,V);
            visited[minver] = true ; 

            for(int j = 0 ; j<V; j++){
                if(graph[minver][j]!=0 && !visited[j]){
                    if(graph[minver][j]<weight[j]){
                        weight[j] = graph[minver][j];
                        parent[j] = minver; 
                    }
                }
            }
        }
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + weight[i]);
        }
    }
    public static void main(String[] args) {
        int V = 4 ; 
        int[][] graph = new int[V][V];
        int[][] edges = {
                { 0, 1, 10 },
                { 0, 2, 6 },
                { 0, 3, 5 },
                { 1, 3, 15 },
                { 2, 3, 4 }
        };

        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int w = e[2];
            graph[u][v] = w;
            graph[v][u] = w; 
        }

        prims(graph, V);
    }
}
