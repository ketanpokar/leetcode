// Problem link : https://leetcode.com/problems/defanging-an-ip-address/submissions/

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder s = new StringBuilder();
        for(int i = 0 ; i < address.length(); i++) {
            char c = address.charAt(i);
            if(c != '.')
                s.append(c);
            else
                s.append("[.]");
        }
        return s.toString();
    }
}
