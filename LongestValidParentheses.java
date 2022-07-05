Problem Link : https://leetcode.com/problems/longest-valid-parentheses/

import java.util.AbstractMap;
class LongestValidParentheses {
    public int longestValidParentheses(String str) {
        Stack<Map.Entry<Integer, Character>> s = new Stack<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                Map.Entry<Integer, Character> entry = new AbstractMap.SimpleEntry<Integer, Character>(i, c);
                s.push(entry);
            } else {
                boolean res = false;
                if(s.isEmpty()) {
                    res = true;
                } else {
                    Map.Entry<Integer, Character> prev = s.peek();
                    if(c == '}' && '{' != prev.getValue()) {
                        res = true;
                    } else if(c == ']' && '[' != prev.getValue()) {
                        res = true;
                    } else if(c == ')' && '(' != prev.getValue()) {
                        res = true;
                    }
                }
                if (res) {
                    Map.Entry<Integer, Character> entry = new AbstractMap.SimpleEntry<Integer, Character>(i, c);
                    s.push(entry);
                } else {
                    s.pop();
                }
            }
        }
        int i = str.length();

        for(i = str.length(); !s.isEmpty(); ) {
            Map.Entry<Integer, Character> entry = s.pop();
            int key = entry.getKey();
            if(max <= (i - key - 1)) {
                max = (i - key - 1);
            }
            i = key;
        }
        if(i > 0) {
            if(max < i) {
                max = i;
            }
        }
        return Math.max(max, 0);
    }
}
