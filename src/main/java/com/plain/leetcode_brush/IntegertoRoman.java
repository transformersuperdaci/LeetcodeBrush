package com.plain.leetcode_brush;

import java.util.ArrayList;
import java.util.List;

/**
*@author:feng
*@date: 2020/12/11
*@description: Leetcode12
**/
public class IntegertoRoman {
    public String intToRoman(int num){
        //罗马数字串
        String resStr = "";
        //
        int remainder = num;
        //1000级别的字符串,只到3999，后面的没必要列出，也没法表示
        String [] mStr = {"","M","MM","MMM"};
        //100级别的字符串
        String [] cStr = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        //10级别
        String [] xStr = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        //1级别
        String [] iStr ={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        resStr += mStr[num/1000]+cStr[num%1000/100]+xStr[num%100/10]+iStr[num%10];
        return resStr;
    }


}
