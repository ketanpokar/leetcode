Problem link : https://leetcode.com/problems/valid-parentheses/

class isValidParanthesis {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        boolean res = true;
        loop : for(char c : str.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                s.push(c);
            } else {
                if(s.isEmpty()) {
                    res = false;
                    break;
                } else {
                    char prev = s.pop();
                    switch(c) {
                        case '}' : if(prev != '{') { res = false; break loop; } break;

                        case ')' : if(prev != '(') { res = false; break loop; } break;

                        case ']' : if(prev != '[') { res = false; break loop; } break;

                    }
                }
            }

        }
        if (!s.isEmpty()) {
            res = false;
        }
        return res;
        
    }
}
