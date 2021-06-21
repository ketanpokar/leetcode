// Problem Link : https://leetcode.com/problems/combination-sum-iii/

class CombinationSumThree {
    public List<List<Integer>> combinationSum3(int k, int n) {
        if(k > n)
            return new ArrayList<>();
        else {
            int nums[] = {1,2,3,4,5,6,7,8,9};
            combination(nums, k, n, 0, 0, new ArrayList<>());
            return uniqueCombination;
        }
        
    }
    List<List<Integer>> uniqueCombination = new ArrayList<>();
    void combination(int[] nums, int k, int n, int i, int sum, List<Integer> combination) {
        
        if(sum == n && combination.size() == k) {
            uniqueCombination.add(new ArrayList<>(combination));
            return;
        }
        if(sum > n || combination.size() > k) return;
        
        for(int j = i; j < nums.length; j++) {
            combination.add(nums[j]);
            combination(nums, k, n, j + 1, sum + nums[j], combination);
            combination.remove(combination.size() - 1);
        }

    }
}
