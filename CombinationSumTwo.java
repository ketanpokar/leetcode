// Problem Link : https://leetcode.com/problems/combination-sum-ii/

class CombinationSumTwo {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        combinations(candidates, target, 0, 0, new ArrayList<>());
        //System.out.println(uniqueCombinations);
        return uniqueCombinations;
    }
    List<List<Integer>> uniqueCombinations = new ArrayList<>();
    void combinations(int[] candidates, int target, int idx, int sum, List<Integer> combination) {

        if(sum == target && !uniqueCombinations.contains(combination)) {
            uniqueCombinations.add(new ArrayList<>(combination));
            return;
        }
        
        if(sum > target) {
            return;
        }

        for(int i = idx; i < candidates.length; i++) {
            combination.add(candidates[i]);
            combinations(candidates, target, i + 1, sum + candidates[i], combination);
            combination.remove(combination.size() - 1);
        }

    }
}
