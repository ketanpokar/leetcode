// Problem Link : 

class SelfDividingNumber {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> result = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            
            int n = i;
            boolean flag = true;
            while(n > 0) {
                int temp = n % 10;
                if(temp != 0) {
                    if(i % temp != 0) {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
                n = n / 10;
            }
            if(flag) {
                result.add(i);
            }
            
        }
        
        return result;
        
    }
}
