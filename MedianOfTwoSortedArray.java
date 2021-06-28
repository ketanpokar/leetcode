// Problem Link : https://leetcode.com/problems/median-of-two-sorted-arrays/

class MedianOfTwoSortedArray {
    int[] res = null;
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        res = new int[len/ 2 + 1];
        if(len == 0) return 0;
        if(len == 1) return nums1.length == 1 ? nums1[0] : nums2[0];
        if((len) % 2 == 0) {
            return evenMedian(nums1, nums2) / 2;
        } else {
            return oddMedian(nums1, nums2);
        }
    }
    
    public double evenMedian(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int len = (nums1.length + nums2.length) / 2;
        while(i < nums1.length && j < nums2.length && len >= 0) {
            if(nums1[i] < nums2[j]) {
                res[i + j] = nums1[i];
                i++;
            } else {
                res[i + j] = nums2[j];
                j++;
            }
            len--;
        }
        if(len == -1) {
            return res[i + j - 1] + res[i + j - 2];
        }
        while(i < nums1.length && len >= 0) {
            res[i + j] = nums1[i];
            i++;
            len--;
        }
        while(j < nums2.length && len >= 0) {
            res[i + j] = nums2[j];
            j++;
            len--;
        }
        return res[i + j - 1] + res[i + j - 2];
    }
    
    public double oddMedian(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int len = (nums1.length + nums2.length) / 2;
        while(i < nums1.length && j < nums2.length && len >= 0) {
            if(nums1[i] < nums2[j]) {
                res[i + j] = nums1[i];
                i++;
            } else {
                res[i + j] = nums2[j];
                j++;
            }
            len--;
        }
        if(len == -1) {
            return res[i + j - 1];
        }
        while(i < nums1.length && len >= 0) {
            res[i + j] = nums1[i];
            i++;
            len--;
        }
        while(j < nums2.length && len >= 0) {
            res[i + j] = nums2[j];
            j++;
            len--;
        }
        return res[i + j - 1];
    }
}
