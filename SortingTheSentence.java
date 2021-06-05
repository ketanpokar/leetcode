// Problem Link : https://leetcode.com/problems/sorting-the-sentence/

class SortingTheSentence {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sortedSentence = new String[words.length];
        for(String word : words) {
            sortedSentence[word.charAt(word.length()-1)-49] = word.substring(0,word.length()-1);
        }
        for(String word : sortedSentence) {
            System.out.print(word + " ");
        }
        return String.join(" ",sortedSentence);
    }
}
