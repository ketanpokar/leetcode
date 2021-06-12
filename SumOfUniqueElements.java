// Problem Link : https://leetcode.com/problems/sum-of-unique-elements/submissions/

class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> unique = new HashMap<>();
        int sum = 0;
        for(int num : nums) {
            if(unique.containsKey(num) && unique.get(num) == 1) {
                unique.put(num, unique.get(num) + 1);
                sum = sum - num;
            } else if(!unique.containsKey(num)){
                unique.put(num, 1);
                sum = sum + num;
            }
        }
        return sum;
    }
}
