package com.plain.leetcode_brush.test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
*@author:feng
*@date: 2021/6/4
*@description:
**/
public class demo1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics statistics = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("max:"+statistics.getMax());
        System.out.println("avg:"+statistics.getAverage());
        System.out.println("min:"+statistics.getMin());
        System.out.println("sum:"+statistics.getSum());
        System.out.println("总数:"+statistics.getCount());

    }
}
