package com.plain.leetcode_brush;
/**
*@author:feng
*@date: 2020/12/21
*@description: leetcode 28
**/
public class ImplementStr {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        String haystackReverse = new StringBuilder(haystack).reverse().toString();
        String needleReverse = new StringBuilder(needle).reverse().toString();
        if (haystack.contains(needle)){
            return len1-len2-haystackReverse.lastIndexOf(needleReverse);
        }
        else
        return -1;
    }
}
