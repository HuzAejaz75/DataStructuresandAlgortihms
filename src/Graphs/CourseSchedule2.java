package Graphs;

import java.util.HashSet;

/**
 * Created by huzaifa.aejaz on 7/1/18.
 */
public class CourseSchedule2 {


    public int[] findOrder(int numCourses, int[][] pre) {

        int n = numCourses;
        boolean[] visited = new boolean[n];
        int[] order = new int[n];
        int index = n - 1;
        int[][] adj = new int[n][n];
        for(int i = 0; i < pre.length; i++){
            int from = pre[i][1];
            int dest = pre[i][0];
            adj[from][dest] = 1;
        }
        // Visit each node
        for (int u = 0; u < n; u++)
            if (!visited[u])
                index = visit(adj, visited, order, index, u);

        // Return topological sort
        return order;
    }
    private static int visit(int[][] adj, boolean[] visited, int[] order, int index, int u) {

        if (visited[u]) return index;
        visited[u] = true;

        // Visit all neighbors
        for (int v = 0; v < adj.length; v++)
            if (adj[u][v] != 0 && !visited[v])
                index = visit(adj, visited, order, index, v);

        // Place this node at the head of the list
        order[index--] = u;

        return index;
    }
}

         /*   int[] order = new int[numCourses];
            if(numCourses == 0) {
                return order;
            }

            if(pre.length == 0) {
                for(int i = 0; i < numCourses; i++) {
                    order[i] = i;
                }
                return order;
            }

            int[][] matrix = new int[numCourses][numCourses];
            for(int i = 0; i < pre.length;i++) {
                matrix[pre[i][0]][pre[i][1]] = 1;
            }
            for (int u = 0; u < n; u++)
                if (!visited[u])
                    index = visit(adj, visited, order, index, u);

            visit(matrix,order,index,)
            boolean[] courseDone = new boolean[numCourses];
            HashSet<Integer> pending = new HashSet<>();
            for(int i = 0; i < numCourses; i++) {
                if(!courseDone[i]) {
                    doDFS(matrix, i, courseDone, order, pending);

                    if(cycle) {
                        return new int[0];
                    }
                }
            }
            return order;
        }

        public void doDFS(int[][] matrix, int index, boolean[] courseDone, int[] order, HashSet<Integer> pending) {
            if(pending.contains(index)) {
                cycle = true;
                return;
            }

            for(int i = 0; i < matrix[index].length; i++) {
                if(matrix[index][i] == 1 && !courseDone[i]) {
                    pending.add(index);
                    doDFS(matrix, i, courseDone, order, pending);
                }
            }

            if(!courseDone[index] && orderIndex < matrix.length && !cycle) {
                courseDone[index] = true;
                order[orderIndex++] = index;
                pending.remove(index);
            }
        }
    private static int visit(int[][] adj, boolean[] visited, int[] order, int index, int u) {

        if (visited[u]) return index;
        visited[u] = true;

        // Visit all neighbors
        for (int v = 0; v < adj.length; v++)
            if (adj[u][v] != 0 && !visited[v])
                index = visit(adj, visited, order, index, v);

        // Place this node at the head of the list
        order[index--] = u;

        return index;

    }

    }*/





