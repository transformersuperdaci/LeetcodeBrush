package com.plain.leetcode_brush.StringSolution;
/**
*@author:feng
*@date: 2020/12/29
*@description: 试着用动态规划解决 leetcode 3. Longest Substring Without Repeating Characters
 * 是否无法用动态规划
**/
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int [][]dp = new int[len+1][len+1];
        dp[len][len] = 1 ;
        dp[len-1][len-1] = 1 ;
        int left = 0 ;
        int down = 0 ;
        for (int i= len;i>=1;i--){
            for (int j = i;j<=len;j++){
                if (i==j){dp[i][j]=1;}
                else {
                    //left
                    if (s.substring(i-1,j-1).indexOf(s.charAt(j-1))<0){left = dp[i][j-1] + 1; }
                    if (s.substring(i-1,j-1).indexOf(s.charAt(j-1))>=0){left = dp[i][j-1];}
                    //down
                    if (s.substring(i,j).indexOf(s.charAt(i-1))<0){down = dp[i+1][j] + 1; }
                    if (s.substring(i,j).indexOf(s.charAt(i-1))>=0){down = dp[i+1][j];}

                    dp[i][j] = Math.max(left,down);
                }
            }
        }

        return dp[1][len];
    }
}
