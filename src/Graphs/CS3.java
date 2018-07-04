package Graphs;

import java.util.HashSet;

/**
 * Created by huzaifa.aejaz on 7/3/18.
 */
public class CS3 {
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
                index = detectAndAdd(matrix, order, visited, index,u, went);//visit(adj, visited, order, index, u);
        if(cycle) return new int[0];
        else return order;
    }


    public int detectAndAdd(int[][] matrix, int[] order, boolean[] courseDone, int index,int u, HashSet<Integer> pending)
    {
        if(pending.contains(u)){
            cycle = true;
            return index;
        }

        for(int v = 0; v < matrix.length; v++){
            if(matrix[u][v] != 0 && !courseDone[v] ){
                pending.add(u);
                index = detectAndAdd(matrix, order, courseDone, index, v, pending);
            }
        }

        if(!courseDone[u] && !cycle){
            courseDone[u]= true;
            order[index--] = u;
            //pending.remove(u);
        }
        return index;

    }
}
