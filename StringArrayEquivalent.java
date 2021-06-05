// Problem Link : https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

class StringArrayEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sword1 = new StringBuilder();
        StringBuilder sword2 = new StringBuilder();
        
        for(String word : word1) {
            sword1.append(word);
        }
        for(String word : word2) {
            sword2.append(word);
        }
        
        return sword1.toString().equals(sword2.toString());
    }
}
