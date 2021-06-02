package com.dsalgo.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PathWithMaximumGold {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        int grid[][] = {{1,0,7},{2,0,6},{3,4,5},{0,3,0},{9,0,20}};
//        int grid[][] = {{0,6,0},{5,8,7},{0,9,0}};
        int grid[][] = {{1,0,7,0,0,0},{2,0,6,0,1,0},{3,5,6,7,4,2},{4,3,1,0,2,0},{3,0,5,0,20,0}};
        System.out.println("Max : " + getMaximumGold(grid) + " " + (System.currentTimeMillis() - startTime));
    }

    public static int getMaximumGold(int[][] grid) {
        int max = 0;
        for(int i = 0 ; i < grid.length; i++) {
            for(int j = 0 ; j < grid[i].length ; j++) {
                if(grid[i][j] >= 0) {
//                    int res = getGold(grid,i,j, 0,new int[grid.length][grid[0].length]);
                    int res = getGoldOptimised(grid,i,j, 0,new int[grid.length][grid[0].length]);
                    if(res > max) {
                        max = res;
                    }
                }
            }
        }
        return max;
    }

    public static int getGold(int[][] grid, int i, int j, int maxGold, int visited[][]) {
        if(i >= grid.length || i == -1 || j == -1 || j >= grid[0].length || grid[i][j] == 0 || visited[i][j] == 1){
            System.out.println(maxGold);
            return maxGold;
        }

        visited[i][j] = 1;
        int down = getGold(grid, i+1, j, maxGold + grid[i][j], visited);
        int right = getGold(grid, i, j+1, maxGold + grid[i][j], visited);
        int top = getGold(grid, i-1, j, maxGold + grid[i][j], visited);
        int left = getGold(grid, i, j-1, maxGold + grid[i][j], visited);
        visited[i][j] = 0;

        int directions[] = {down, right, top, left};
        int max = 0;
        for(int direction : directions) {
            if(direction > max) max = direction;
        }
        return max;
    }

    static Map<String, Integer> paths = new HashMap<>();
    public static int getGoldOptimised(int[][] grid, int i, int j, int maxGold, int visited[][]) {
        if(paths.containsKey(i+","+j)) return paths.get(i+","+j);

        if(i >= grid.length || i == -1 || j == -1 || j >= grid[0].length || grid[i][j] == 0 || visited[i][j] == 1){
            System.out.println(maxGold);
            return maxGold;
        }

        visited[i][j] = 1;
        int down = getGold(grid, i+1, j, maxGold + grid[i][j], visited);
        int right = getGold(grid, i, j+1, maxGold + grid[i][j], visited);
        int top = getGold(grid, i-1, j, maxGold + grid[i][j], visited);
        int left = getGold(grid, i, j-1, maxGold + grid[i][j], visited);
        visited[i][j] = 0;

        int directions[] = {down, right, top, left};
        int max = 0;
        for(int direction : directions) {
            if(direction > max) max = direction;
        }
        paths.put(i+","+j,max);
        return max;
    }

}
