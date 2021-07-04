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
    
    // Efficient Way
    public String longestCommonPrefix(String[] strs) {
        int count = 0;
        String s = strs[0];
        for(int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            boolean flag = true;
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].length() <= i || cur != strs[j].charAt(i)) {
                    flag = false;
                }
            }
            if(flag) count++;
            else break;
        }
        return strs[0].substring(0,count);
    }
}
