import java.util.Arrays;

/**
 * Created by huzaifa.aejaz on 8/2/18.
 */
public class friendCircles {
    public int findCircleNum(int[][] M) {
        boolean[] visited = new boolean[M.length];
        int[] friends = new int[M.length];
        for(int i = 0; i < M.length; i++)
        {
            friends[i] = i;
        }//o(n)

        for(int u = 0; u < M.length; u++){
            for(int v = 0; v < M[0].length; v++){
                if(M[u][v]==1 && !visited[v]){
                    friends[v] = u;
                    visited[v] = true;
                }
            }
        }
        Arrays.sort(friends);
        int circles = 1;
        for(int i = 0 ; i < friends.length; i++){
            if(i > 0 && friends[i-1] != friends[i]){
                circles++;
            }
        }
        return circles;
    }
}
