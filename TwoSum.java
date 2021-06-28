// Problem Link : https://leetcode.com/problems/two-sum/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> memo = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(memo.containsKey(target - nums[i])) {
                res[0] = memo.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            memo.put(nums[i], i);
        }
        return res;
    }
}
