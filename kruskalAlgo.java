import java.util.*; 
public class kruskalAlgo {
    static int findParent(int v , int[]parent){
        if(parent[v]==v){
            return v ; 
        }
        return parent[v] = findParent(parent[v], parent);
    }

    public static void union(int u , int v , int[] parent){
        int pu = findParent(u, parent);
        int pv = findParent(v, parent);
        parent[pu] = pv; 
    }
    public static void main(String[] args) {
        int V = 4 ; 
        int[][] edges = {
                { 0, 1, 10 },
                { 0, 2, 6 },
                { 0, 3, 5 },
                { 1, 3, 15 },
                { 2, 3, 4 }
        };
        Arrays.sort(edges,(a,b)->a[2]-b[2]);

        // initalize parent arrays
        int[]parent = new int[V] ;
        for(int i = 0 ; i<V ; i++){
            parent[i] = i ; 
        }

        int totalweight = 0 ; 
        for(int[]e:edges){
            int u = e[0],v = e[1] , w = e[2];
            int pu = findParent(u,parent);
            int pv = findParent(v,parent);
            if(pu!=pv){
                System.out.println(u+" -- "+v+" = "+w);
                totalweight+=w;
                union(pu,pv,parent);
            }
        }
        System.out.println(totalweight);

    }
}
