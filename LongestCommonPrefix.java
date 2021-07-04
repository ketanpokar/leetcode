// Problem Link : https://leetcode.com/problems/longest-common-prefix/

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        
        int count = 0;

        for(int i = 1; i <= strs[0].length(); i++) {
            String temp = strs[0].substring(0,i);
            boolean flag = true;
            //System.out.print(i + " ");
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].length() < i || !strs[j].startsWith(temp)) {
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return strs[0].substring(0,count);
    }
}
