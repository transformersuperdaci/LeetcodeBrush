package com.plain.leetcode_brush.StringSolution;
/**
*@author:feng
*@date: 2020/12/24
*@description:  Leetcode 344 ReverseString
**/

/**
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 */
public class ReverseString {
    public void reverseString(char[] s) {
/**
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while(i<s.length){
            stringBuilder.append(s[i]);
            i++;
        }
        stringBuilder = stringBuilder.reverse();
        int j =0;
        while (j<s.length){
            s[j] = stringBuilder.charAt(j);
            j++;
        }
**/
       char [] sRes = new char[s.length];
       int i = s.length-1;
       while (i>=0){
           sRes[s.length-i-1] = s[i];
           i--;
       }
        s = sRes;
        System.out.println(s);
    }
}
