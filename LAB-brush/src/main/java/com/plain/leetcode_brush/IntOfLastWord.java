package com.plain.leetcode_brush;
/**
*@author:feng
*@date: 2020/12/22
*@description:  求最后一个单词的长度
**/
public class IntOfLastWord {
    public int intOfLastWord(String str) {
        return str.trim().length()-str.trim().lastIndexOf(" ");
    }
}
