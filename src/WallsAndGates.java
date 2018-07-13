/**
 * Created by huzaifa.aejaz on 7/8/18.
 */
public class WallsAndGates {
        public void wallsAndGates(int[][] rooms) {
            for(int rows = 0; rows < rooms.length; rows++){
                for(int cols = 0; cols < rooms[0].length; cols++){
                    if(rooms[rows][cols]==0){
                        dfs(rooms,rows, cols,0);
                    }
                }
            }
        }

        public void dfs(int[][] rooms, int r, int c, int val){
            if(r <0 || c<0 ||r >= rooms.length || c>=rooms[0].length || rooms[r][c]==-1) return;

            if(rooms[r][c]>=val){
                rooms[r][c]=val;
                dfs(rooms, r+1,c,val+1);
                dfs(rooms, r-1,c,val+1);
                dfs(rooms, r,c+1,val+1);
                dfs(rooms, r,c-1,val+1);
            }
            return;


        }

}
