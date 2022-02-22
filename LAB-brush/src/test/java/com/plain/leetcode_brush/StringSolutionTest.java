package com.plain.leetcode_brush;

import com.plain.leetcode_brush.StringSolution.LengthOfLongestSubstring;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
*@author:feng
*@date: 2020/12/29
*@description:   StringSolution夹的测试类===
**/

@SpringBootTest
public class StringSolutionTest {

    @Test
    void contextLoadsLengthOfLongestSubstring(){
        String s = "pwwkeww";
        String s1 = "ddssqddse";//3
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        int i = lengthOfLongestSubstring.lengthOfLongestSubstring(s);
        System.out.println(i);
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring(s1));
    }
    @Test
    void contextLoads(){
        String s1 = new String("abc");
        String s2 = new String("a");
        String s3 = new String("d");
        System.out.println(s1.indexOf(s3));
    }
}
