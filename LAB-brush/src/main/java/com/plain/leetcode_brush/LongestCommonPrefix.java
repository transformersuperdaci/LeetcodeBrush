package com.plain.leetcode_brush;

/**
*@author:feng
*@date: 2020/12/18
*@description: Leetcode 14 by CharlieGuo
**/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1 || strs == null) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        //find the shortest String
        int shortest = 0;
        int len = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            int curLen = strs[i].length();
            if (curLen < len) {
                len = curLen;
                shortest = i;
            }
        }
        //find the longest common prefix
        String sub = strs[shortest];
        for (int i = 0; i < strs.length; i++) {
            int s=strs[i].indexOf(sub);
            while (s != 0) {
                sub = sub.substring(0, sub.length()-1);
            }
        }
        return sub;
    }
}