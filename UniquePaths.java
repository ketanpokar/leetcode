// Problem Link : https://leetcode.com/problems/unique-paths/

class Solution {
    public int uniquePaths(int m, int n) {
        return uniquePaths(1,1,m,n);
    }
    Map<String,Integer> pathsCount = new HashMap<>();
    public int uniquePaths(int i, int j, int m, int n) {
        if(pathsCount.containsKey(i + "," + j)) return pathsCount.get(i + "," + j);
        if(i == m && j == n) return 1;
        if(i > m || j > n) return 0;

        int res = uniquePaths(i+1,j,m,n) + uniquePaths(i,j+1,m,n);
        pathsCount.put(i + "," + j, res);
        return res;
    }
}
