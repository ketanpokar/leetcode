// Problem Link : https://leetcode.com/problems/n-queens-ii/

class NQueensTwo {
    public int totalNQueens(int n) {
        return printNQueens(new int[n][n], 0);
    }
    
    public static int printNQueens(int[][] chess, int row) {
        
        if(row >= chess.length){
            return 1;
        }
            
        int res = 0;
        for(int i = 0; i < chess.length; i++) {
            if(isValid(chess, row, i)) {
                chess[row][i] = 1;
                res = res + printNQueens(chess, row + 1);
                chess[row][i] = 0;
            }
        }
        return res;
    }
    
    public static boolean isValid(int[][] chess, int row, int column) {
        
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
