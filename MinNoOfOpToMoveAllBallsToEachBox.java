// Problem link : https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/

class MinNoOfOpToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        
        Set<Integer> mem = new HashSet<>();
        int[] response = new int[boxes.length()];
        
        for(int i = 0; i < boxes.length(); i++) {
            if(boxes.charAt(i) == '1') {
                mem.add(i);
            }
        }
        
        for(int i = 0; i < boxes.length(); i++) {
            int count = 0;
            for(int j : mem) {
                if(i == j) continue;
                else {
                    count = count + Math.abs(i-j);
                }
            }
            response[i] = count;
        }
        return response;
    }
}
