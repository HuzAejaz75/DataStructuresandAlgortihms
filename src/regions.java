/**
 * Created by huzaifa.aejaz on 7/15/18.
 */
public class regions {
    public void solve(char[][] board) {
        int[][] dp = new int[board.length][board.length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'O'){
                    if(dfs(board,i,j)){
                        dp[i][j] = 'X';
                    }
                }
            }
        }
    }

    private boolean dfs(char[][] board, int r, int c){
        if(r < 0 || r >= board.length || c<0|| c>=board[0].length) return false;
        if((r==0 || c==0 || r==board.length-1 || c==board[0].length-1) && board[r][c] != 'X') return false;
        if(board[r][c]=='X'){
            return true;
        }


        boolean down = dfs(board,r+1,c);
        boolean up =  dfs(board,r-1,c);
        boolean left = dfs(board,r,c-1);
        boolean right = dfs(board,r,c+1);
        if(down && up && left && right){
            board[r][c]='X';
        }
        return true;
    }
}
