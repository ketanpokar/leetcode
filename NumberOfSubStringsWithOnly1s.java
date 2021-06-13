// Problem Link : https://leetcode.com/problems/number-of-substrings-with-only-1s/

class NumberOfSubStringsWithOnly1s {
    public int numSub(String s) {
        long sum = 0, temp = 0;
        String[] split = s.split("0");
        
        for(String str : split) {
            temp = str.length();
            sum = sum + (temp * (temp + 1) / 2);
        }
        return (int)(sum % 1000000007);
    }
}
