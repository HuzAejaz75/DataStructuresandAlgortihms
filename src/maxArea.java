/**
 * Created by huzaifa.aejaz on 7/15/18.
 */
public class maxArea {
    int maxArea = Integer.MIN_VALUE;
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visit = new boolean[m][n];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j]==1 && visit[i][j]==false){
                    maxArea = Math.max(maxArea,dfs(grid, visit, i ,j));
                }
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, boolean[][] visit, int r, int c){
        if(r < 0 || c < 0 || r>= grid.length || c >=grid[0].length || grid[r][c]==0 || visit[r][c]) return 0;
        visit[r][c] = true;
        return(1+ dfs(grid,visit, r+1,c)+ dfs(grid,visit, r-1,c)+ dfs(grid,visit,r,c+1)+ dfs(grid,visit, r,c-1));
    }
}
