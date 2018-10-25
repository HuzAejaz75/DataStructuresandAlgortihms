/**
 * Created by huzaifa.aejaz on 10/22/18.
 */
public class findWordInBoard {
    static boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if((word.charAt(0) == board[i][j]) && search(board, word, i, j, 0)){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean search(char[][]board, String word, int i, int j, int index){
        if(index == word.length()){
            return true;
        }

        if(i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index) || visited[i][j]){
            return false;
        }

        visited[i][j] = true;
        if(search(board, word, i-1, j, index+1) ||
                search(board, word, i+1, j, index+1) ||
                search(board, word, i, j-1, index+1) ||
                search(board, word, i, j+1, index+1)){
            return true;
        }

        visited[i][j] = false;
        return false;
    }
    /*public boolean exist(char[][] board, String word) {
        if (word.length() == 0) return false;
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                return helper(board, word, r, c, 0);
            }
        }
        return false;
    }


    private boolean helper(char[][] board, String word, int row, int col, int index )
    {
        if(index== word.length()) return true;
        if(row >= board.length || row < 0 || col >= board[0].length|| col < 0 || board[row][col] != word.charAt(index))
            return false;

            return helper(board, word, row+1,col,index+1) ||
                    helper(board, word, row-1,col,index+1)||
                    helper(board, word, row,col+1,index+1)||
                    helper(board, word, row,col-1,index+1);


    }*/
}
