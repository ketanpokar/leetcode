// Problem Link : https://leetcode.com/problems/spiral-matrix/

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        return rotate(matrix, matrix.length, matrix[0].length, new ArrayList<>());
    }
    List<Integer> rotate(int[][] matrix, int m, int n, List<Integer> result) {
        int loop = Math.min(m,n) % 2 == 0 ? Math.min(m,n) / 2 - 1 : Math.min(m, n) / 2;

        for(int s = 0; s <= loop; s++) {
            for(int i = s; i < n - s; i++) {
                result.add(matrix[s][i]);
            }

            for(int i = s + 1; i <= m - s - 1; i++) {
                result.add(matrix[i][n - s - 1]);
            }
            if(s != m - s - 1){
                for(int i = n - s - 2; i >= s; i--) {
                    result.add(matrix[m - s - 1][i]);
                }
            }
            
            if(s != n - s - 1) {
                for(int i = m - s - 2; i > s; i--) {
                    result.add(matrix[i][s]);
                }
            }
            
        }
        return result;
    }
}


