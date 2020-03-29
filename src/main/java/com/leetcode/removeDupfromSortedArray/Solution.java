package com.leetcode.removeDupfromSortedArray;

class Solution {

    public int removeDuplicates(int[] nums) {

        if(nums.length == 0)
            return 0;
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] == nums[i])
                continue;
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}
