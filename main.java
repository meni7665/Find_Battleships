class Solution {
    public int countBattleships(char[][] board) {
        int m = board[0].length;
        int n = board.length;
        int ships = 0;
        if(m==0){
            return ships;
        }
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
             if(board[i][j] == '.') {continue;}
             if(i>0 && board[i-1][j] == 'X'){continue;}
             if(j>0 && board[i][j-1] == 'X'){continue;}
             ships++;
            }
        }
        return ships;
}
}
