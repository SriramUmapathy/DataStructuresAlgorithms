package com.leetcode.containsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for(int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i]))
                return true;
        }
        return false;
    }
}
