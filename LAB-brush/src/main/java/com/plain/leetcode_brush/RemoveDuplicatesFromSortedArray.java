package com.plain.leetcode_brush;

/**
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4]
 * the  type of output is "int",but they will check your nums
 */
/**
*@author:feng
*@date: 2020/12/18
*@description:  力扣26
**/
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int resLen = len;
        int i=0;
        int newIndex = 0;
        while (i<len){
            int cmp = nums[i];
            nums[newIndex] = cmp;
            int j =1;
            while (i+j<len && nums[i+j]==nums[i]){
                j++;
            }
                i+=j;
                newIndex++;
                resLen = resLen - j+1;
        }
        return resLen;
    }
}
