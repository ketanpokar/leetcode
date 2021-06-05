//Problem Link : https://leetcode.com/problems/replace-all-digits-with-characters/

class DigitsToCharacters {
    public String replaceDigits(String s) {
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < s.length(); i = i + 2) {
            sb.append(s.charAt(i-1));
            char temp = (char) (s.charAt(i-1) + Integer.parseInt(s.charAt(i) + ""));
            sb.append(temp);
        }
        if(sb.length() < s.length()) {
            sb.append(s.charAt(s.length()-1));
        }
        return sb.toString();
        
    }
}
