// Problem Link : https://leetcode.com/problems/is-subsequence/submissions/

class IsSubsequence {
    public boolean isSubsequence(String s, String t) {

        int iS = 0, iT = 0;

        while(iS < s.length() && iT < t.length()){

            if(s.charAt(iS) == t.charAt(iT)){
                iS++;
            }
            iT++;
        }

        if(iS == s.length()){
            return true;
        }
        else{
            return false;
        }

    }
}
