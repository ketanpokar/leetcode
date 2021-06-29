// Problem Link : https://leetcode.com/problems/daily-temperatures/

class DailyTemperature {
    class Pair {
        int key;
        int value;
        Pair(int key, int value) { this.key = key; this.value = value; }
        int getKey() { return this.key; }
        int getValue() { return this.value; }
    }
    
    public int[] dailyTemperatures(int[] temperatures) {
        // for(int i = 0; i < temperatures.length; i++) {
        //     int count = 0;
        //     for(int j = i + 1; j < temperatures.length; j++) {
        //         if(temperatures[j] > temperatures[i]) {
        //             count = (j - i);
        //             break;
        //         }
        //     }
        //     temperatures[i] = count;
        // }
        
        Stack<Pair> s = new Stack<>();
        s.push(new Pair(0, temperatures[0]));
        
        for(int i = 1; i < temperatures.length; i++) {
            
            Pair cp = new Pair(i, temperatures[i]);
            
            while(!s.isEmpty()) {
                Pair pp = s.peek();
                if(cp.getValue() > pp.getValue()) {
                    s.pop();
                    temperatures[pp.getKey()] = i - pp.getKey();
                } else break;
            }
            
            s.push(cp);
        }
        while(!s.isEmpty()) {
            temperatures[s.pop().getKey()] = 0;
        }
        
        return temperatures;
    }
    
    
}
