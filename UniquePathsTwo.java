// Problem Link : https://leetcode.com/problems/unique-paths-ii/

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return uniquePaths(obstacleGrid,0,0, obstacleGrid.length-1, obstacleGrid[0].length-1);
    }
    Map<String,Integer> pathsCount = new HashMap<>();
    public int uniquePaths(int[][] obstacleGrid, int i, int j, int m, int n) {
        if(pathsCount.containsKey(i + "," + j)) return pathsCount.get(i + "," + j);
        if(i > m || j > n || obstacleGrid[i][j] == 1) return 0;
        if((i == m && j == n) ) return 1;

        int res = uniquePaths(obstacleGrid, i+1,j,m,n) + uniquePaths(obstacleGrid, i,j+1,m,n);
        pathsCount.put(i + "," + j, res);
        return res;
    }
}
