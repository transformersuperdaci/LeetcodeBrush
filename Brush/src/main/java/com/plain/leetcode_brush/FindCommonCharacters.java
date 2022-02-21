package com.plain.leetcode_brush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
*@author:feng
*@date: 2021/6/3
*@description: Leetcode 1002
**/
public  class FindCommonCharacters {
    public static List<String> commonChars(String[] A) {
        List<String> res=new ArrayList<>();
        int[] min_freq=new int[26];// if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.
        Arrays.fill(min_freq,Integer.MAX_VALUE);
        for(String curr : A)
        {
            int[] char_freq=new int[26];
            for(char c: curr.toCharArray())
            {
                char_freq[c-'a']++;//in the current string calculate frequency of every character
            }
            for(int i=0;i<26;i++)
            {
                min_freq[i]=Math.min(min_freq[i],char_freq[i]);
            }
        }

        for(int i=0;i<26;i++)
        {
            while(min_freq[i]>0)
            {
                res.add(""+(char)(i+'a'));
                min_freq[i]--;
            }
        }
        return res;
    }
}
