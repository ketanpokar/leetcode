//Problem Link : https://leetcode.com/problems/divisor-game/

class DivisorGame {
    public boolean divisorGame(int n) {
        if(n == 2 || n == 0) return true;
        if(n == 1) return false;

        for(int i = 1; i < n; i++) {
            if(n % 2 == 0) {
                boolean res = divisorGame(n-i);
                if(res) return true;
            }
        }
        return false;
    }
}
