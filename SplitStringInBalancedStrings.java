// Problem Link : https://leetcode.com/problems/split-a-string-in-balanced-strings/

class Solution {
    public int balancedStringSplit(String s) {
        int rcount = 0;
        int lcount = 0;
        int res = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R') {
                rcount++;
            } else if(s.charAt(i) == 'L') {
                lcount++;
            }

            if(rcount == lcount) {
                rcount = 0;
                lcount = 0;
                res++;
            }
        }
        return res;
    }
}
