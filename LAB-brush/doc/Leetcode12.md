---
title: "leetcode12 解答 1.0"
date: 2019-01-24T06:00:00+08:00
draft: false
tags:
   - JAVA
categories:
  - 技术
  - 归档
---


# 12 Integer to Roman

## 问题：

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.

 

Example 1:

Input: num = 3
Output: "III"
Example 2:

Input: num = 4
Output: "IV"
Example 3:

Input: num = 9
Output: "IX"
Example 4:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 5:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= num <= 3999

## 分析：
两种思路。
思路一：
把千、百、十、个的数组列出来，单位的千、百、十、个算作一个粒度，所有的都表示出来，然后拼接起来。这样思考，需要的数组多，逻辑相对简单；
思路二：
把能直接表示出来的数字组成一个数组，然后把目标数字进行依次放进去这个“筛选器”中比较，余下的部分继续循环比较，直至0。这样思考，数组，简单，
逻辑相对来说复杂。

## 参考：
IntegerRoman2参考https://leetcode.com/problems/integer-to-roman/discuss/6309/more-generalizable-solution-can-be-extended-to-any-roman-to-integer-conversion


