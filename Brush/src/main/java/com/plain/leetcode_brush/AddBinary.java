package com.plain.leetcode_brush;
/**
*@author:feng
*@date: 2020/12/23
*@description: 力扣67 二进制加法
**/
public class AddBinary {
    public String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        if (len1>len2){
            b=incre(b,len1);
        }
        else {a=incre(a,len2);}
        int curr = 0;
        int next = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=a.length()-1;i>=0;i--){
                int sum = (a.charAt(i)-'0')+(b.charAt(i)-'0')+curr;
                curr = sum % 2;
                stringBuilder.append(String.valueOf(curr));
                next = sum / 2;
                curr = next;
        }
        if (next>0){stringBuilder.append(String.valueOf(next));}
        return stringBuilder.reverse().toString();
    }

    private String incre (String sb,int m){
        int len = sb.length();
        StringBuilder stringBuilder = new StringBuilder(sb).reverse();
        for (int i =0;i<m-len;i++){
            stringBuilder.append("0");
        }
        return stringBuilder.reverse().toString();
    }
}
