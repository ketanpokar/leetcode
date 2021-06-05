// https://leetcode.com/problems/count-the-number-of-consistent-strings/

class CountOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        
        Set<Character> uniqueCharacters = new HashSet<>();
        for(int i = 0; i < allowed.length(); i++) {
            uniqueCharacters.add(allowed.charAt(i));
        }
        int count = 0;
        for(String word : words) {
            boolean flag = true;
            for(char i : word.toCharArray()) {
                if(!uniqueCharacters.contains(i)){
                    flag = false;
                    break;
                } 
            }
            if(flag) count++;
        }
        return count;
        
    }
}
