import java.util.*;

/**
 * Created by huzaifa.aejaz on 8/2/18.
 */
public class NumberOfConnectedComponents {
    public int countComponents(int n, int[][] edges)
    {
        int[][] adj = new int[n][n];
        for(int[] x : edges){
            int from =  x[0];
            int to = x[1];
            adj[from][to] = 1;
            adj[to][from] = 1;
        }
        int count = 0;
        for(int u = 0; u < adj.length; u++){
            for(int v = 0; v < adj.length; v++){
                if(adj[u][v]==1){

                    DFS(adj,v);
                    count++;
                }
            }
        }
        return count;
    }

    private void DFS(int[][] adj,int u)
    {
        for(int v = 0 ; v < adj.length; v++){
            if(adj[u][v]==1){
                adj[u][v]=0;
                adj[v][u]=0;
                DFS(adj,v);
            }
        }
    }


    /*  another way*/
    public int countComponents2(int n, int[][] edges) {
        if (n <= 1)
            return n;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        Set<Integer> visited = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (visited.add(i)) {
                dfsVisit(i, map, visited);
                count++;
            }
        }
        return count;
    }

    private void dfsVisit(int i, Map<Integer, List<Integer>> map, Set<Integer> visited)
    {
        for (int j : map.get(i))
        {
            if (visited.add(j))
                dfsVisit(j, map, visited);
        }
    }
}
