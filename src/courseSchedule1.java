import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by huzaifa.aejaz on 8/20/18.
 */
public class courseSchedule1 {
    public boolean canFinish(int numCourses, int[][] prerequisites)
    {
        int[][] matrix = new int[numCourses][numCourses]; // i -> j
        int[] indegree = new int[numCourses];

        for (int i=0; i<prerequisites.length; i++)
        {
            int from = prerequisites[i][0];
            int to = prerequisites[i][1];
            if (matrix[from][to] == 0)
                indegree[to]++; //duplicate case
            matrix[from][to] = 1;
        }

        int count = 0;
        Queue<Integer> queue = new LinkedList();
        for (int i=0; i<indegree.length; i++)
        {
            if (indegree[i] == 0) queue.offer(i);
        }
        while (!queue.isEmpty())
        {
            int course = queue.poll();
            count++;
            for (int i=0; i<numCourses; i++) {
                if (matrix[course][i] != 0) {
                    if (--indegree[i] == 0)
                        queue.offer(i);
                }
            }
        }
        return count == numCourses;
    }
}
