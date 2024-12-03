class Solution {
    static public void solve(int col, char[][] board, List<List<String>> ans, int leftRow[], int upperDiagonal[], int lowerDiagonal[]){
        if(col==board.length){
            ans.add(construct(board));
            return;
        }
        
        for(int row=0; row<board.length; row++){
            if(leftRow[row]==0 && upperDiagonal[row + col]==0 && lowerDiagonal[board.length-1+col-row]==0){
                board[row][col]='Q';
                leftRow[row]=1;
                upperDiagonal[row+col]=1;
                lowerDiagonal[board.length-1+col-row]=1;
                solve(col+1, board, ans, leftRow, upperDiagonal, lowerDiagonal);
                board[row][col]='.';
                leftRow[row]=0;
                upperDiagonal[row+col]=0;
                lowerDiagonal[board.length-1+col-row]=0;
                
            }
        }
    }
    
    static public List<String> construct(char[][] board){
        List<String> res = new LinkedList<String>();
        for(int i=0;i<board.length;i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        
        List<List<String>> ans = new ArrayList<List<String>> ();
        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2*n-1];
        int lowerDiagonal[] = new int[2*n-1];
        
        solve(0, board, ans, leftRow, upperDiagonal, lowerDiagonal);
        return ans;
    }
}