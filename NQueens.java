// Problem Link : https://leetcode.com/problems/n-queens/

class NQueens {
    public List<List<String>> solveNQueens(int n) {
        
        printNQueens(new int[n][n], 0);
        return result;
        
    }
    List<List<String>> result = new ArrayList<>();
    public void printNQueens(int[][] chess, int row) {
        
        if(row >= chess.length){
            List<String> temp = new ArrayList<>();
            for(int i = 0 ; i < chess.length; i++) {
                String column = "";
                for(int j = 0; j < chess[i].length; j++) {
                    if(chess[i][j] == 1) column = column + "Q";
                    else column = column + ".";
                }
                temp.add(column);
            }
            result.add(temp);
        }
        
        for(int i = 0; i < chess.length; i++) {
            if(isValid(chess, row, i)) {
                chess[row][i] = 1;
                printNQueens(chess, row + 1);
                chess[row][i] = 0;
            }
        }
        
    }
    
    public boolean isValid(int[][] chess, int row, int column) {
        
        for(int i = 0; i <= row - 1; i++) {
            if(chess[i][column] == 1) {
                return false;
            }
        }
        
        for(int i = 1; i <= Math.min(row,column); i++) {
            if(chess[row-i][column-i] == 1){
                return false;
            }
        }
        
        for(int i = 1; i <= Math.min(chess.length - 1 - column, row); i++) {
            if(chess[row-i][column + i] == 1) {
                return false;
            }
        }
        
        return true;
    }
}
