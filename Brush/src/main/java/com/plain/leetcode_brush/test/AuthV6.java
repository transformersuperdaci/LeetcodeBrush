package com.plain.leetcode_brush.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface AuthV6 {

    // 注释第一个字前面空一个空格
    String value() default "com.chinaunicom.wo.common.result.Result";

    // 间隔一个属性，中间空一行
    // 最下面留白一行
    boolean isActive() default true;

}
