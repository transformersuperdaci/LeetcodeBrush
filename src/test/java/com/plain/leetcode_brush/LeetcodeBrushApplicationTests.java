package com.plain.leetcode_brush;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeetcodeBrushApplicationTests {

    @Test
    void contextLoads() {
        IntegertoRoman integertoRoman = new IntegertoRoman();
        System.out.println(integertoRoman.intToRoman(1135));
    }

    @Test
    void contextLoads2(){
        IntegertoRoman2 integertoRoman2 = new IntegertoRoman2();
        System.out.println(integertoRoman2.intToRoman(1135));
    }

}
