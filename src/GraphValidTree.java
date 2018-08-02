import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 7/28/18.
 */
public class GraphValidTree {
    public boolean validTree(int n, int[][] edges) {
        boolean[] visited = new boolean[n];
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < adj.length; i++)
            adj[i] = new ArrayList<Integer>();
        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }
        if (!dfs(0, -1, visited, adj)) return false;
        for (boolean b : visited)
            if (!b) return false;
        return true;
    }

    // p is the pointer to 'parent' node, we ignore it to avoid infinite loop
    private boolean dfs(int v, int p, boolean[] visited, List<Integer>[] adj) {
        visited[v] = true;
        for (int i : adj[v]) {
            if (i == p) continue;
            if (visited[i] || !dfs(i, v, visited, adj)) return false;
        }
        return true;
    }
}
