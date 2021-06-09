// Problem Link : https://leetcode.com/problems/combination-sum/

class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = combinations(candidates, target, 0);
        return result != null ? result : new ArrayList<>();
    }
    
    public static List<List<Integer>> combinations(int[] candidates, int target, int start) {
        if(target == 0) return new ArrayList<>();
        if(target < 0) return null;
        
        List<List<Integer>> totalCombinations = null;
        for(int i = start; i < candidates.length; i++) {
            List<List<Integer>> combination = combinations(candidates, target - candidates[i], i);
            if(combination != null && combination.size() == 0) {
                if(totalCombinations == null) totalCombinations = new ArrayList<>();
                List<Integer> temp = new ArrayList<>();
                temp.add(candidates[i]);

                totalCombinations.add(temp);
            }else if(combination != null) {
                if(totalCombinations == null) totalCombinations = new ArrayList<>();
                for(List<Integer> c : combination) {
                    c.add(candidates[i]);
                    totalCombinations.add(c);
                }

            }
        }
        return totalCombinations;

    }
    
    
}
