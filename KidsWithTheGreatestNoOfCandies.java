package com.dsalgo.leetcode;

import java.util.ArrayList;
import java.util.List;
//Problem link : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWithTheGreatestNoOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> result = new ArrayList<>();
        int i = 0;
        for( ; i <= candies.length/2 ; i++) {
            int maxCadies = (candies[i]>candies[candies.length-i-1])?candies[i]:candies[candies.length-i-1];
            if(maxCadies > max) {
                max = maxCadies;
            }
        }
        for(int candy : candies) {
            if(candy+extraCandies >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }

}
