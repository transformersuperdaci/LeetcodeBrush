package com.plain.leetcode_brush.StringSolution;

/**
*@author:feng
*@date: 2020/12/25
*@description: 力扣345 翻转元音字母
**/

/**
 * Input: "leetcode"
 * Output: "leotcede"
 */

/**
 * A E I O U不要遗漏
 */
public class ReverseVowels {
    public String reverseVowels(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilderRes = new StringBuilder(s);
        int i = 0;
        int [] index = {};
        int j = 0;
        while(i<s.length()){
            if (isVowels(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
            i++;
        }
        while (j<s.length()){
            if (isVowels(stringBuilderRes.charAt(j))){
                stringBuilderRes.setCharAt(j,stringBuilder.charAt(stringBuilder.length()-1));
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }
            j++;
        }

        return stringBuilderRes.toString();
    }

    public boolean isVowels(char c){
        if (c == 'a' || c== 'e' || c== 'i' || c== 'o' || c == 'u'){
            return true;
        }
        else return false;
    }
}
