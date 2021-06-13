// Problem Link : https://leetcode.com/problems/height-checker/

class HeightChecker {
    public int heightChecker(int[] heights) {
        int temp[] = new int[heights.length];
        for(int i = 0; i < heights.length; i++)
            temp[i] = heights[i];
        Arrays.sort(temp);
        int count = 0;
        for(int i = 0; i < heights.length; i++) {
            if(temp[i] != heights[i]) count++;
        }
        return count;
    }
}
