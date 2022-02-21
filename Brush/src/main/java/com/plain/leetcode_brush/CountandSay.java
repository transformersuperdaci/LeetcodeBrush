package com.plain.leetcode_brush;

/**
*@author:feng
*@date: 2020/12/16
*@description: Leetcode 38 自己写的代码，多次进行修改
**/
public class CountandSay {

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String opStr = countAndSay(n-1);
        StringBuilder resStr = new StringBuilder();
        int i=0;
        while(i<opStr.length()){
            char cur = opStr.charAt(i);
            int j=0;
            while (i+j<opStr.length() && opStr.charAt(i+j)==cur) j++;
            resStr.append(j).append(cur);
            i+=j;
        }
        return resStr.toString();
    }
}

