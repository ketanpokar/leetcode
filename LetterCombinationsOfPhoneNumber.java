// Problem Link : https://leetcode.com/problems/letter-combinations-of-a-phone-number/

class LetterCombinationsOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<String>();
        String[][] dialer = {{"a", "b", "c"},
                           {"d", "e", "f"},
                           {"g", "h", "i"},
                           {"j", "k", "l"},
                           {"m", "n", "o"},
                           {"p", "q", "r", "s"},
                           {"t", "u", "v"},
                           {"w", "x", "y", "z"}};
        return combinations(digits, new String(), new ArrayList<String>(), dialer, 0);
        
    }
    
    
    List<String> combinations(String digits, String currentCombination, List<String> totalCombinations, String[][] dialer, int start) {

        if(digits.length() == currentCombination.length()) {
            totalCombinations.add(currentCombination);
            return totalCombinations;
        }

        for(int i = start; i < digits.length(); i++) {
            int digit = Integer.parseInt(digits.charAt(i) + "");
            String[] key = dialer[digit-2];
            for(String alplabet : key){
                combinations(digits, currentCombination + (alplabet), totalCombinations, dialer, i + 1);
            }

        }
        return totalCombinations;
    }
}
