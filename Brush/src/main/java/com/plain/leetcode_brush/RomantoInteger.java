package com.plain.leetcode_brush;

import java.util.HashMap;
import java.util.Map;

/**
*@author:feng
*@date: 2020/12/15
*@description: Leetcode 13
**/
public class RomantoInteger {
    public int RomantoInt(String str){
        Integer res = 0;
        Map mapSingle = new HashMap<String,Integer>();
        Map mapDouble = new HashMap<String,Integer>();


        mapSingle.put("M",1000);
        mapDouble.put("CM",900);
        mapDouble.put("CD",400);
        mapSingle.put("C",100);
        mapDouble.put("XC",90);
        mapDouble.put("XL",40);
        mapSingle.put("X",10);
        mapSingle.put("L",50);
        mapDouble.put("IX",9);
        mapDouble.put("IV",4);
        mapSingle.put("I",1);
        mapSingle.put("D",500);
        mapSingle.put("V",5);
        for (int n=0; n<str.length();n++){
            if (str.length()-n >=2){
                if (mapDouble.containsKey(str.substring(n,n+2))){
                    res += Integer.parseInt(mapDouble.get(str.substring(n,n+2)).toString());
                    n++;
                }
                else {
                    res += Integer.parseInt(mapSingle.get(str.substring(n,n+1)).toString());
                }
            }
            else {
                if (mapDouble.containsKey(str.substring(n))){
                    res += Integer.parseInt(mapDouble.get(str.substring(n)).toString());
                    n++;
                }
                else {
                    res += Integer.parseInt(mapSingle.get(str.substring(n)).toString());
                }
            }
        }
        return res;
    }
}
