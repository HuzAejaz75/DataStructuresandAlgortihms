package Graphs;

import java.util.HashSet;

/**
 * Created by huzaifa.aejaz on 7/1/18.
 */
public class CS2 {
        boolean cycle = false;

        public int[] findOrder(int numCourses, int[][] prerequisites) {
            //DFs based Topological sort.
            // construct the adjacency matrix.
            int[][] matrix = new int[numCourses][numCourses];

            for(int i = 0; i < prerequisites.length; i++){
                int from = prerequisites[i][1];
                int dest = prerequisites[i][0];
                matrix[from][dest] = 1;
            }
            boolean[] visited = new boolean[numCourses];
            int[] order = new int[numCourses];
            int index = numCourses -1;
            HashSet<Integer> went = new HashSet<>();
            for (int u = 0; u < numCourses; u++)
                if (!visited[u])
                    index = topSort(matrix, order, visited, index, u,went);//visit(adj, visited, order, index, u);

            return order;
        }

        private int topSort(int[][]matrix,int[] order, boolean[] visited, int index, int u, HashSet<Integer> went) {
            if (went.contains(u)) {
                cycle = true;
                return index;
            }

            for (int v = 0; v < matrix.length; v++) {
                if (matrix[u][v] != 0 && !visited[v]) {
                    went.add(u);//1.add it to the list
                    topSort(matrix, order, visited, index, v, went);//call dfs again with the same parameters

                }
            }
            if (!visited[u] && index < matrix.length && !cycle) {

                visited[u]=true;
                order[index--] = u;

            }
            return index;
        }

}

