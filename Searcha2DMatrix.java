Problem link : https://leetcode.com/problems/search-a-2d-matrix/

class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        return bnRow(matrix, target);
    }
    
    public boolean bnRow(int[][] arr, int target) {
        int low = 0, high = arr.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid][0] == target || arr[mid][arr[mid].length - 1] == target) return true;
            else if(arr[mid][0] < target && arr[mid][arr[mid].length - 1] > target) {
                return bn(arr[mid], target);
            } else if(arr[mid][0] > target) {
                high = mid - 1;
            } else if(arr[mid][arr[mid].length - 1] < target) {
                low = mid + 1;
            }
        }
        return false;
    }

    public boolean bn(int[] subArr, int target) {

        int low = 0, high = subArr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if(subArr[mid] == target) {
                return true;
            } else if(subArr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
