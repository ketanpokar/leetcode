// Problem Link : https://leetcode.com/problems/matrix-diagonal-sum/

class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        
        int n = mat.length, sum = 0;
        if(mat.length == 1) return mat[0][0];
        for(int i = 0; i < n; i++) {
            sum = sum + mat[i][i];
            if(i != n/2 || n%2 != 1) {
                sum = sum + mat[i][n-i-1];
            }
        }
        
        return sum;
    }
}
